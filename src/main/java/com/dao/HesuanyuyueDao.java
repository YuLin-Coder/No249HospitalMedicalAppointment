package com.dao;

import com.entity.HesuanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanyuyueVO;
import com.entity.view.HesuanyuyueView;


/**
 * 核酸预约
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface HesuanyuyueDao extends BaseMapper<HesuanyuyueEntity> {
	
	List<HesuanyuyueVO> selectListVO(@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);
	
	HesuanyuyueVO selectVO(@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);
	
	List<HesuanyuyueView> selectListView(@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);

	List<HesuanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);
	
	HesuanyuyueView selectView(@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);
	

}
