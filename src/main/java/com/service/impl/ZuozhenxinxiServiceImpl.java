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


import com.dao.ZuozhenxinxiDao;
import com.entity.ZuozhenxinxiEntity;
import com.service.ZuozhenxinxiService;
import com.entity.vo.ZuozhenxinxiVO;
import com.entity.view.ZuozhenxinxiView;

@Service("zuozhenxinxiService")
public class ZuozhenxinxiServiceImpl extends ServiceImpl<ZuozhenxinxiDao, ZuozhenxinxiEntity> implements ZuozhenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuozhenxinxiEntity> page = this.selectPage(
                new Query<ZuozhenxinxiEntity>(params).getPage(),
                new EntityWrapper<ZuozhenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuozhenxinxiEntity> wrapper) {
		  Page<ZuozhenxinxiView> page =new Query<ZuozhenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuozhenxinxiVO> selectListVO(Wrapper<ZuozhenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuozhenxinxiVO selectVO(Wrapper<ZuozhenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuozhenxinxiView> selectListView(Wrapper<ZuozhenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuozhenxinxiView selectView(Wrapper<ZuozhenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
