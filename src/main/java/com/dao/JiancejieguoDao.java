package com.dao;

import com.entity.JiancejieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancejieguoVO;
import com.entity.view.JiancejieguoView;


/**
 * 检测结果
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface JiancejieguoDao extends BaseMapper<JiancejieguoEntity> {
	
	List<JiancejieguoVO> selectListVO(@Param("ew") Wrapper<JiancejieguoEntity> wrapper);
	
	JiancejieguoVO selectVO(@Param("ew") Wrapper<JiancejieguoEntity> wrapper);
	
	List<JiancejieguoView> selectListView(@Param("ew") Wrapper<JiancejieguoEntity> wrapper);

	List<JiancejieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JiancejieguoEntity> wrapper);
	
	JiancejieguoView selectView(@Param("ew") Wrapper<JiancejieguoEntity> wrapper);
	

}
