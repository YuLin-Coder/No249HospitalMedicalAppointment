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


import com.dao.YaopinxinxiDao;
import com.entity.YaopinxinxiEntity;
import com.service.YaopinxinxiService;
import com.entity.vo.YaopinxinxiVO;
import com.entity.view.YaopinxinxiView;

@Service("yaopinxinxiService")
public class YaopinxinxiServiceImpl extends ServiceImpl<YaopinxinxiDao, YaopinxinxiEntity> implements YaopinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinxinxiEntity> page = this.selectPage(
                new Query<YaopinxinxiEntity>(params).getPage(),
                new EntityWrapper<YaopinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinxinxiEntity> wrapper) {
		  Page<YaopinxinxiView> page =new Query<YaopinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinxinxiVO> selectListVO(Wrapper<YaopinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinxinxiVO selectVO(Wrapper<YaopinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinxinxiView> selectListView(Wrapper<YaopinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinxinxiView selectView(Wrapper<YaopinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
