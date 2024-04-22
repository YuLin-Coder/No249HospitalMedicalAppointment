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


import com.dao.JikongtongzhiDao;
import com.entity.JikongtongzhiEntity;
import com.service.JikongtongzhiService;
import com.entity.vo.JikongtongzhiVO;
import com.entity.view.JikongtongzhiView;

@Service("jikongtongzhiService")
public class JikongtongzhiServiceImpl extends ServiceImpl<JikongtongzhiDao, JikongtongzhiEntity> implements JikongtongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JikongtongzhiEntity> page = this.selectPage(
                new Query<JikongtongzhiEntity>(params).getPage(),
                new EntityWrapper<JikongtongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JikongtongzhiEntity> wrapper) {
		  Page<JikongtongzhiView> page =new Query<JikongtongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JikongtongzhiVO> selectListVO(Wrapper<JikongtongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JikongtongzhiVO selectVO(Wrapper<JikongtongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JikongtongzhiView> selectListView(Wrapper<JikongtongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JikongtongzhiView selectView(Wrapper<JikongtongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
