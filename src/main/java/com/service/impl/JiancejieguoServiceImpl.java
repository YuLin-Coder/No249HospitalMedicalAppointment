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


import com.dao.JiancejieguoDao;
import com.entity.JiancejieguoEntity;
import com.service.JiancejieguoService;
import com.entity.vo.JiancejieguoVO;
import com.entity.view.JiancejieguoView;

@Service("jiancejieguoService")
public class JiancejieguoServiceImpl extends ServiceImpl<JiancejieguoDao, JiancejieguoEntity> implements JiancejieguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancejieguoEntity> page = this.selectPage(
                new Query<JiancejieguoEntity>(params).getPage(),
                new EntityWrapper<JiancejieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancejieguoEntity> wrapper) {
		  Page<JiancejieguoView> page =new Query<JiancejieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancejieguoVO> selectListVO(Wrapper<JiancejieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancejieguoVO selectVO(Wrapper<JiancejieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancejieguoView> selectListView(Wrapper<JiancejieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancejieguoView selectView(Wrapper<JiancejieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
