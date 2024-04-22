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


import com.dao.ZixunhuifuDao;
import com.entity.ZixunhuifuEntity;
import com.service.ZixunhuifuService;
import com.entity.vo.ZixunhuifuVO;
import com.entity.view.ZixunhuifuView;

@Service("zixunhuifuService")
public class ZixunhuifuServiceImpl extends ServiceImpl<ZixunhuifuDao, ZixunhuifuEntity> implements ZixunhuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunhuifuEntity> page = this.selectPage(
                new Query<ZixunhuifuEntity>(params).getPage(),
                new EntityWrapper<ZixunhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunhuifuEntity> wrapper) {
		  Page<ZixunhuifuView> page =new Query<ZixunhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunhuifuVO> selectListVO(Wrapper<ZixunhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunhuifuVO selectVO(Wrapper<ZixunhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunhuifuView> selectListView(Wrapper<ZixunhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunhuifuView selectView(Wrapper<ZixunhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
