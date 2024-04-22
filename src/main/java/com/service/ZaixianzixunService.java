package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianzixunView;


/**
 * 在线咨询
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ZaixianzixunService extends IService<ZaixianzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianzixunVO> selectListVO(Wrapper<ZaixianzixunEntity> wrapper);
   	
   	ZaixianzixunVO selectVO(@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);
   	
   	List<ZaixianzixunView> selectListView(Wrapper<ZaixianzixunEntity> wrapper);
   	
   	ZaixianzixunView selectView(@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianzixunEntity> wrapper);
   	

}

