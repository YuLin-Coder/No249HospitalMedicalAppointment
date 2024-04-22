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

import com.entity.ZuozhenxinxiEntity;
import com.entity.view.ZuozhenxinxiView;

import com.service.ZuozhenxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 坐诊信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@RestController
@RequestMapping("/zuozhenxinxi")
public class ZuozhenxinxiController {
    @Autowired
    private ZuozhenxinxiService zuozhenxinxiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuozhenxinxiEntity zuozhenxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			zuozhenxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuozhenxinxiEntity> ew = new EntityWrapper<ZuozhenxinxiEntity>();
		PageUtils page = zuozhenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuozhenxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuozhenxinxiEntity zuozhenxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZuozhenxinxiEntity> ew = new EntityWrapper<ZuozhenxinxiEntity>();
		PageUtils page = zuozhenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuozhenxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuozhenxinxiEntity zuozhenxinxi){
       	EntityWrapper<ZuozhenxinxiEntity> ew = new EntityWrapper<ZuozhenxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuozhenxinxi, "zuozhenxinxi")); 
        return R.ok().put("data", zuozhenxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuozhenxinxiEntity zuozhenxinxi){
        EntityWrapper< ZuozhenxinxiEntity> ew = new EntityWrapper< ZuozhenxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuozhenxinxi, "zuozhenxinxi")); 
		ZuozhenxinxiView zuozhenxinxiView =  zuozhenxinxiService.selectView(ew);
		return R.ok("查询坐诊信息成功").put("data", zuozhenxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuozhenxinxiEntity zuozhenxinxi = zuozhenxinxiService.selectById(id);
        return R.ok().put("data", zuozhenxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuozhenxinxiEntity zuozhenxinxi = zuozhenxinxiService.selectById(id);
        return R.ok().put("data", zuozhenxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuozhenxinxiEntity zuozhenxinxi, HttpServletRequest request){
    	zuozhenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuozhenxinxi);
        zuozhenxinxiService.insert(zuozhenxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuozhenxinxiEntity zuozhenxinxi, HttpServletRequest request){
    	zuozhenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuozhenxinxi);
        zuozhenxinxiService.insert(zuozhenxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuozhenxinxiEntity zuozhenxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuozhenxinxi);
        zuozhenxinxiService.updateById(zuozhenxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuozhenxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZuozhenxinxiEntity> wrapper = new EntityWrapper<ZuozhenxinxiEntity>();
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

		int count = zuozhenxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
