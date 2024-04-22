package com.dao;

import com.entity.YaopinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinxinxiVO;
import com.entity.view.YaopinxinxiView;


/**
 * 药品信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface YaopinxinxiDao extends BaseMapper<YaopinxinxiEntity> {
	
	List<YaopinxinxiVO> selectListVO(@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);
	
	YaopinxinxiVO selectVO(@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);
	
	List<YaopinxinxiView> selectListView(@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);

	List<YaopinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);
	
	YaopinxinxiView selectView(@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);
	

}
