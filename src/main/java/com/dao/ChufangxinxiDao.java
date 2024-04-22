package com.dao;

import com.entity.ChufangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufangxinxiVO;
import com.entity.view.ChufangxinxiView;


/**
 * 处方信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ChufangxinxiDao extends BaseMapper<ChufangxinxiEntity> {
	
	List<ChufangxinxiVO> selectListVO(@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);
	
	ChufangxinxiVO selectVO(@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);
	
	List<ChufangxinxiView> selectListView(@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);

	List<ChufangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);
	
	ChufangxinxiView selectView(@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);
	

}
