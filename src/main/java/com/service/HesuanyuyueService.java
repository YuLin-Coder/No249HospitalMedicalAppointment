package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HesuanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HesuanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanyuyueView;


/**
 * 核酸预约
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface HesuanyuyueService extends IService<HesuanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HesuanyuyueVO> selectListVO(Wrapper<HesuanyuyueEntity> wrapper);
   	
   	HesuanyuyueVO selectVO(@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);
   	
   	List<HesuanyuyueView> selectListView(Wrapper<HesuanyuyueEntity> wrapper);
   	
   	HesuanyuyueView selectView(@Param("ew") Wrapper<HesuanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HesuanyuyueEntity> wrapper);
   	

}

