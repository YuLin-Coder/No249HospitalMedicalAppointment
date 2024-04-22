package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaoyuyueView;


/**
 * 挂号预约
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface GuahaoyuyueService extends IService<GuahaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaoyuyueVO> selectListVO(Wrapper<GuahaoyuyueEntity> wrapper);
   	
   	GuahaoyuyueVO selectVO(@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);
   	
   	List<GuahaoyuyueView> selectListView(Wrapper<GuahaoyuyueEntity> wrapper);
   	
   	GuahaoyuyueView selectView(@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaoyuyueEntity> wrapper);
   	

}

