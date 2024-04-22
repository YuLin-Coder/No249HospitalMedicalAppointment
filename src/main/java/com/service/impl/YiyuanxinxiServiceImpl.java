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


import com.dao.YiyuanxinxiDao;
import com.entity.YiyuanxinxiEntity;
import com.service.YiyuanxinxiService;
import com.entity.vo.YiyuanxinxiVO;
import com.entity.view.YiyuanxinxiView;

@Service("yiyuanxinxiService")
public class YiyuanxinxiServiceImpl extends ServiceImpl<YiyuanxinxiDao, YiyuanxinxiEntity> implements YiyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanxinxiEntity> page = this.selectPage(
                new Query<YiyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<YiyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanxinxiEntity> wrapper) {
		  Page<YiyuanxinxiView> page =new Query<YiyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanxinxiVO> selectListVO(Wrapper<YiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanxinxiVO selectVO(Wrapper<YiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanxinxiView> selectListView(Wrapper<YiyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanxinxiView selectView(Wrapper<YiyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
