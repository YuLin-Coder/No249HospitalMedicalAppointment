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


import com.dao.ZhenduanxinxiDao;
import com.entity.ZhenduanxinxiEntity;
import com.service.ZhenduanxinxiService;
import com.entity.vo.ZhenduanxinxiVO;
import com.entity.view.ZhenduanxinxiView;

@Service("zhenduanxinxiService")
public class ZhenduanxinxiServiceImpl extends ServiceImpl<ZhenduanxinxiDao, ZhenduanxinxiEntity> implements ZhenduanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhenduanxinxiEntity> page = this.selectPage(
                new Query<ZhenduanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhenduanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhenduanxinxiEntity> wrapper) {
		  Page<ZhenduanxinxiView> page =new Query<ZhenduanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhenduanxinxiVO> selectListVO(Wrapper<ZhenduanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhenduanxinxiVO selectVO(Wrapper<ZhenduanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhenduanxinxiView> selectListView(Wrapper<ZhenduanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhenduanxinxiView selectView(Wrapper<ZhenduanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
