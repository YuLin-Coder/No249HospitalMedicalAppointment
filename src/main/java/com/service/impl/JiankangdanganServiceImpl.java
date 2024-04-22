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


import com.dao.JiankangdanganDao;
import com.entity.JiankangdanganEntity;
import com.service.JiankangdanganService;
import com.entity.vo.JiankangdanganVO;
import com.entity.view.JiankangdanganView;

@Service("jiankangdanganService")
public class JiankangdanganServiceImpl extends ServiceImpl<JiankangdanganDao, JiankangdanganEntity> implements JiankangdanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangdanganEntity> page = this.selectPage(
                new Query<JiankangdanganEntity>(params).getPage(),
                new EntityWrapper<JiankangdanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangdanganEntity> wrapper) {
		  Page<JiankangdanganView> page =new Query<JiankangdanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangdanganVO> selectListVO(Wrapper<JiankangdanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangdanganVO selectVO(Wrapper<JiankangdanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangdanganView> selectListView(Wrapper<JiankangdanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangdanganView selectView(Wrapper<JiankangdanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
