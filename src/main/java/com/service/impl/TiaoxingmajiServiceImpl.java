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


import com.dao.TiaoxingmajiDao;
import com.entity.TiaoxingmajiEntity;
import com.service.TiaoxingmajiService;
import com.entity.vo.TiaoxingmajiVO;
import com.entity.view.TiaoxingmajiView;

@Service("tiaoxingmajiService")
public class TiaoxingmajiServiceImpl extends ServiceImpl<TiaoxingmajiDao, TiaoxingmajiEntity> implements TiaoxingmajiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiaoxingmajiEntity> page = this.selectPage(
                new Query<TiaoxingmajiEntity>(params).getPage(),
                new EntityWrapper<TiaoxingmajiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiaoxingmajiEntity> wrapper) {
		  Page<TiaoxingmajiView> page =new Query<TiaoxingmajiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiaoxingmajiVO> selectListVO(Wrapper<TiaoxingmajiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiaoxingmajiVO selectVO(Wrapper<TiaoxingmajiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiaoxingmajiView> selectListView(Wrapper<TiaoxingmajiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiaoxingmajiView selectView(Wrapper<TiaoxingmajiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
