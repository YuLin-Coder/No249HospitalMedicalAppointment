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


import com.dao.ZaixianzixunDao;
import com.entity.ZaixianzixunEntity;
import com.service.ZaixianzixunService;
import com.entity.vo.ZaixianzixunVO;
import com.entity.view.ZaixianzixunView;

@Service("zaixianzixunService")
public class ZaixianzixunServiceImpl extends ServiceImpl<ZaixianzixunDao, ZaixianzixunEntity> implements ZaixianzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianzixunEntity> page = this.selectPage(
                new Query<ZaixianzixunEntity>(params).getPage(),
                new EntityWrapper<ZaixianzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianzixunEntity> wrapper) {
		  Page<ZaixianzixunView> page =new Query<ZaixianzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianzixunVO> selectListVO(Wrapper<ZaixianzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianzixunVO selectVO(Wrapper<ZaixianzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianzixunView> selectListView(Wrapper<ZaixianzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianzixunView selectView(Wrapper<ZaixianzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
