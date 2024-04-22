package com.dao;

import com.entity.ZuozhenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuozhenxinxiVO;
import com.entity.view.ZuozhenxinxiView;


/**
 * 坐诊信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ZuozhenxinxiDao extends BaseMapper<ZuozhenxinxiEntity> {
	
	List<ZuozhenxinxiVO> selectListVO(@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);
	
	ZuozhenxinxiVO selectVO(@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);
	
	List<ZuozhenxinxiView> selectListView(@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);

	List<ZuozhenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);
	
	ZuozhenxinxiView selectView(@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);
	

}
