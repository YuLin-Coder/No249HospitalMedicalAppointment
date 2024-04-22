package com.dao;

import com.entity.ShiyongxuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyongxuzhiVO;
import com.entity.view.ShiyongxuzhiView;


/**
 * 使用须知
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
public interface ShiyongxuzhiDao extends BaseMapper<ShiyongxuzhiEntity> {
	
	List<ShiyongxuzhiVO> selectListVO(@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);
	
	ShiyongxuzhiVO selectVO(@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);
	
	List<ShiyongxuzhiView> selectListView(@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);

	List<ShiyongxuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);
	
	ShiyongxuzhiView selectView(@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);
	

}
