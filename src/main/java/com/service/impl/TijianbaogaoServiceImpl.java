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


import com.dao.TijianbaogaoDao;
import com.entity.TijianbaogaoEntity;
import com.service.TijianbaogaoService;
import com.entity.vo.TijianbaogaoVO;
import com.entity.view.TijianbaogaoView;

@Service("tijianbaogaoService")
public class TijianbaogaoServiceImpl extends ServiceImpl<TijianbaogaoDao, TijianbaogaoEntity> implements TijianbaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianbaogaoEntity> page = this.selectPage(
                new Query<TijianbaogaoEntity>(params).getPage(),
                new EntityWrapper<TijianbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianbaogaoEntity> wrapper) {
		  Page<TijianbaogaoView> page =new Query<TijianbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijianbaogaoVO> selectListVO(Wrapper<TijianbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianbaogaoVO selectVO(Wrapper<TijianbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianbaogaoView> selectListView(Wrapper<TijianbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianbaogaoView selectView(Wrapper<TijianbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
