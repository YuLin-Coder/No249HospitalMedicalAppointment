package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZaixianzixunEntity;
import com.entity.view.ZaixianzixunView;

import com.service.ZaixianzixunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 在线咨询
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@RestController
@RequestMapping("/zaixianzixun")
public class ZaixianzixunController {
    @Autowired
    private ZaixianzixunService zaixianzixunService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaixianzixunEntity zaixianzixun,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			zaixianzixun.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huiyuan")) {
			zaixianzixun.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZaixianzixunEntity> ew = new EntityWrapper<ZaixianzixunEntity>();
		PageUtils page = zaixianzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianzixun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaixianzixunEntity zaixianzixun, 
		HttpServletRequest request){
        EntityWrapper<ZaixianzixunEntity> ew = new EntityWrapper<ZaixianzixunEntity>();
		PageUtils page = zaixianzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianzixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaixianzixunEntity zaixianzixun){
       	EntityWrapper<ZaixianzixunEntity> ew = new EntityWrapper<ZaixianzixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaixianzixun, "zaixianzixun")); 
        return R.ok().put("data", zaixianzixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaixianzixunEntity zaixianzixun){
        EntityWrapper< ZaixianzixunEntity> ew = new EntityWrapper< ZaixianzixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaixianzixun, "zaixianzixun")); 
		ZaixianzixunView zaixianzixunView =  zaixianzixunService.selectView(ew);
		return R.ok("查询在线咨询成功").put("data", zaixianzixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaixianzixunEntity zaixianzixun = zaixianzixunService.selectById(id);
        return R.ok().put("data", zaixianzixun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaixianzixunEntity zaixianzixun = zaixianzixunService.selectById(id);
        return R.ok().put("data", zaixianzixun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaixianzixunEntity zaixianzixun, HttpServletRequest request){
    	zaixianzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianzixun);
        zaixianzixunService.insert(zaixianzixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaixianzixunEntity zaixianzixun, HttpServletRequest request){
    	zaixianzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianzixun);
        zaixianzixunService.insert(zaixianzixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZaixianzixunEntity zaixianzixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaixianzixun);
        zaixianzixunService.updateById(zaixianzixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaixianzixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZaixianzixunEntity> wrapper = new EntityWrapper<ZaixianzixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huiyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zaixianzixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
