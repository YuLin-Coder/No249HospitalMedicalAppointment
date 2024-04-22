package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiaoxingmajiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiaoxingmajiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiaoxingmajiView;


/**
 * 条形码机
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
public interface TiaoxingmajiService extends IService<TiaoxingmajiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiaoxingmajiVO> selectListVO(Wrapper<TiaoxingmajiEntity> wrapper);
   	
   	TiaoxingmajiVO selectVO(@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);
   	
   	List<TiaoxingmajiView> selectListView(Wrapper<TiaoxingmajiEntity> wrapper);
   	
   	TiaoxingmajiView selectView(@Param("ew") Wrapper<TiaoxingmajiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiaoxingmajiEntity> wrapper);
   	

}

