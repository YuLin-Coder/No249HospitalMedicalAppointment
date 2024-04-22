package com.dao;

import com.entity.JikongtongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JikongtongzhiVO;
import com.entity.view.JikongtongzhiView;


/**
 * 疾控通知
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface JikongtongzhiDao extends BaseMapper<JikongtongzhiEntity> {
	
	List<JikongtongzhiVO> selectListVO(@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);
	
	JikongtongzhiVO selectVO(@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);
	
	List<JikongtongzhiView> selectListView(@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);

	List<JikongtongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);
	
	JikongtongzhiView selectView(@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);
	

}
