package com.dao;

import com.entity.TijianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianxinxiVO;
import com.entity.view.TijianxinxiView;


/**
 * 体检信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface TijianxinxiDao extends BaseMapper<TijianxinxiEntity> {
	
	List<TijianxinxiVO> selectListVO(@Param("ew") Wrapper<TijianxinxiEntity> wrapper);
	
	TijianxinxiVO selectVO(@Param("ew") Wrapper<TijianxinxiEntity> wrapper);
	
	List<TijianxinxiView> selectListView(@Param("ew") Wrapper<TijianxinxiEntity> wrapper);

	List<TijianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TijianxinxiEntity> wrapper);
	
	TijianxinxiView selectView(@Param("ew") Wrapper<TijianxinxiEntity> wrapper);
	

}
