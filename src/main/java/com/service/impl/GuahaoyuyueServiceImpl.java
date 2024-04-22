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


import com.dao.GuahaoyuyueDao;
import com.entity.GuahaoyuyueEntity;
import com.service.GuahaoyuyueService;
import com.entity.vo.GuahaoyuyueVO;
import com.entity.view.GuahaoyuyueView;

@Service("guahaoyuyueService")
public class GuahaoyuyueServiceImpl extends ServiceImpl<GuahaoyuyueDao, GuahaoyuyueEntity> implements GuahaoyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaoyuyueEntity> page = this.selectPage(
                new Query<GuahaoyuyueEntity>(params).getPage(),
                new EntityWrapper<GuahaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaoyuyueEntity> wrapper) {
		  Page<GuahaoyuyueView> page =new Query<GuahaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuahaoyuyueVO> selectListVO(Wrapper<GuahaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaoyuyueVO selectVO(Wrapper<GuahaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaoyuyueView> selectListView(Wrapper<GuahaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaoyuyueView selectView(Wrapper<GuahaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
