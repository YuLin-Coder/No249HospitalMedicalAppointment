package com.dao;

import com.entity.YiyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanxinxiVO;
import com.entity.view.YiyuanxinxiView;


/**
 * 医院信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface YiyuanxinxiDao extends BaseMapper<YiyuanxinxiEntity> {
	
	List<YiyuanxinxiVO> selectListVO(@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);
	
	YiyuanxinxiVO selectVO(@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);
	
	List<YiyuanxinxiView> selectListView(@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);

	List<YiyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);
	
	YiyuanxinxiView selectView(@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);
	

}
