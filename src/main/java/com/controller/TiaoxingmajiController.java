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

import com.entity.TiaoxingmajiEntity;
import com.entity.view.TiaoxingmajiView;

import com.service.TiaoxingmajiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 条形码机
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
@RestController
@RequestMapping("/tiaoxingmaji")
public class TiaoxingmajiController {
    @Autowired
    private TiaoxingmajiService tiaoxingmajiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TiaoxingmajiEntity tiaoxingmaji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			tiaoxingmaji.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TiaoxingmajiEntity> ew = new EntityWrapper<TiaoxingmajiEntity>();
		PageUtils page = tiaoxingmajiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiaoxingmaji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TiaoxingmajiEntity tiaoxingmaji, 
		HttpServletRequest request){
        EntityWrapper<TiaoxingmajiEntity> ew = new EntityWrapper<TiaoxingmajiEntity>();
		PageUtils page = tiaoxingmajiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiaoxingmaji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TiaoxingmajiEntity tiaoxingmaji){
       	EntityWrapper<TiaoxingmajiEntity> ew = new EntityWrapper<TiaoxingmajiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tiaoxingmaji, "tiaoxingmaji")); 
        return R.ok().put("data", tiaoxingmajiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TiaoxingmajiEntity tiaoxingmaji){
        EntityWrapper< TiaoxingmajiEntity> ew = new EntityWrapper< TiaoxingmajiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tiaoxingmaji, "tiaoxingmaji")); 
		TiaoxingmajiView tiaoxingmajiView =  tiaoxingmajiService.selectView(ew);
		return R.ok("查询条形码机成功").put("data", tiaoxingmajiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TiaoxingmajiEntity tiaoxingmaji = tiaoxingmajiService.selectById(id);
        return R.ok().put("data", tiaoxingmaji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TiaoxingmajiEntity tiaoxingmaji = tiaoxingmajiService.selectById(id);
        return R.ok().put("data", tiaoxingmaji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TiaoxingmajiEntity tiaoxingmaji, HttpServletRequest request){
    	tiaoxingmaji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tiaoxingmaji);
        tiaoxingmajiService.insert(tiaoxingmaji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TiaoxingmajiEntity tiaoxingmaji, HttpServletRequest request){
    	tiaoxingmaji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tiaoxingmaji);
        tiaoxingmajiService.insert(tiaoxingmaji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TiaoxingmajiEntity tiaoxingmaji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tiaoxingmaji);
        tiaoxingmajiService.updateById(tiaoxingmaji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tiaoxingmajiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TiaoxingmajiEntity> wrapper = new EntityWrapper<TiaoxingmajiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = tiaoxingmajiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
