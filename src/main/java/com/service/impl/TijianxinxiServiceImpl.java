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


import com.dao.TijianxinxiDao;
import com.entity.TijianxinxiEntity;
import com.service.TijianxinxiService;
import com.entity.vo.TijianxinxiVO;
import com.entity.view.TijianxinxiView;

@Service("tijianxinxiService")
public class TijianxinxiServiceImpl extends ServiceImpl<TijianxinxiDao, TijianxinxiEntity> implements TijianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianxinxiEntity> page = this.selectPage(
                new Query<TijianxinxiEntity>(params).getPage(),
                new EntityWrapper<TijianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianxinxiEntity> wrapper) {
		  Page<TijianxinxiView> page =new Query<TijianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijianxinxiVO> selectListVO(Wrapper<TijianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianxinxiVO selectVO(Wrapper<TijianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianxinxiView> selectListView(Wrapper<TijianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianxinxiView selectView(Wrapper<TijianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
