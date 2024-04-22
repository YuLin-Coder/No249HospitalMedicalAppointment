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


import com.dao.ChufangxinxiDao;
import com.entity.ChufangxinxiEntity;
import com.service.ChufangxinxiService;
import com.entity.vo.ChufangxinxiVO;
import com.entity.view.ChufangxinxiView;

@Service("chufangxinxiService")
public class ChufangxinxiServiceImpl extends ServiceImpl<ChufangxinxiDao, ChufangxinxiEntity> implements ChufangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufangxinxiEntity> page = this.selectPage(
                new Query<ChufangxinxiEntity>(params).getPage(),
                new EntityWrapper<ChufangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufangxinxiEntity> wrapper) {
		  Page<ChufangxinxiView> page =new Query<ChufangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufangxinxiVO> selectListVO(Wrapper<ChufangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufangxinxiVO selectVO(Wrapper<ChufangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufangxinxiView> selectListView(Wrapper<ChufangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufangxinxiView selectView(Wrapper<ChufangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
