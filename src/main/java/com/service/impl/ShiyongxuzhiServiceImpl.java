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


import com.dao.ShiyongxuzhiDao;
import com.entity.ShiyongxuzhiEntity;
import com.service.ShiyongxuzhiService;
import com.entity.vo.ShiyongxuzhiVO;
import com.entity.view.ShiyongxuzhiView;

@Service("shiyongxuzhiService")
public class ShiyongxuzhiServiceImpl extends ServiceImpl<ShiyongxuzhiDao, ShiyongxuzhiEntity> implements ShiyongxuzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyongxuzhiEntity> page = this.selectPage(
                new Query<ShiyongxuzhiEntity>(params).getPage(),
                new EntityWrapper<ShiyongxuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyongxuzhiEntity> wrapper) {
		  Page<ShiyongxuzhiView> page =new Query<ShiyongxuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyongxuzhiVO> selectListVO(Wrapper<ShiyongxuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyongxuzhiVO selectVO(Wrapper<ShiyongxuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyongxuzhiView> selectListView(Wrapper<ShiyongxuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyongxuzhiView selectView(Wrapper<ShiyongxuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
