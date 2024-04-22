package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HesuanjianceDao;
import com.entity.HesuanjianceEntity;
import com.service.HesuanjianceService;
import com.entity.vo.HesuanjianceVO;
import com.entity.view.HesuanjianceView;

@Service("hesuanjianceService")
public class HesuanjianceServiceImpl extends ServiceImpl<HesuanjianceDao, HesuanjianceEntity> implements HesuanjianceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanjianceEntity> page = this.selectPage(
                new Query<HesuanjianceEntity>(params).getPage(),
                new EntityWrapper<HesuanjianceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanjianceEntity> wrapper) {
		  Page<HesuanjianceView> page =new Query<HesuanjianceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanjianceVO> selectListVO(Wrapper<HesuanjianceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanjianceVO selectVO(Wrapper<HesuanjianceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanjianceView> selectListView(Wrapper<HesuanjianceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanjianceView selectView(Wrapper<HesuanjianceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
