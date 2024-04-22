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


import com.dao.HesuanyuyueDao;
import com.entity.HesuanyuyueEntity;
import com.service.HesuanyuyueService;
import com.entity.vo.HesuanyuyueVO;
import com.entity.view.HesuanyuyueView;

@Service("hesuanyuyueService")
public class HesuanyuyueServiceImpl extends ServiceImpl<HesuanyuyueDao, HesuanyuyueEntity> implements HesuanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanyuyueEntity> page = this.selectPage(
                new Query<HesuanyuyueEntity>(params).getPage(),
                new EntityWrapper<HesuanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanyuyueEntity> wrapper) {
		  Page<HesuanyuyueView> page =new Query<HesuanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanyuyueVO> selectListVO(Wrapper<HesuanyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanyuyueVO selectVO(Wrapper<HesuanyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanyuyueView> selectListView(Wrapper<HesuanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanyuyueView selectView(Wrapper<HesuanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
