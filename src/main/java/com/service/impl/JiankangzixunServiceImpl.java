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


import com.dao.JiankangzixunDao;
import com.entity.JiankangzixunEntity;
import com.service.JiankangzixunService;
import com.entity.vo.JiankangzixunVO;
import com.entity.view.JiankangzixunView;

@Service("jiankangzixunService")
public class JiankangzixunServiceImpl extends ServiceImpl<JiankangzixunDao, JiankangzixunEntity> implements JiankangzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangzixunEntity> page = this.selectPage(
                new Query<JiankangzixunEntity>(params).getPage(),
                new EntityWrapper<JiankangzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangzixunEntity> wrapper) {
		  Page<JiankangzixunView> page =new Query<JiankangzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangzixunVO> selectListVO(Wrapper<JiankangzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangzixunVO selectVO(Wrapper<JiankangzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangzixunView> selectListView(Wrapper<JiankangzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangzixunView selectView(Wrapper<JiankangzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
