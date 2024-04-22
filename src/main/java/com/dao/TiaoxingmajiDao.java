package com.dao;

import com.entity.TiaoxingmajiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiaoxingmajiVO;
import com.entity.view.TiaoxingmajiView;


/**
 * 条形码机
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
public interface TiaoxingmajiDao extends BaseMapper<TiaoxingmajiEntity> {
	
	List<TiaoxingmajiVO> selectListVO(@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);
	
	TiaoxingmajiVO selectVO(@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);
	
	List<TiaoxingmajiView> selectListView(@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);

	List<TiaoxingmajiView> selectListView(Pagination page,@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);
	
	TiaoxingmajiView selectView(@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);
	

}
