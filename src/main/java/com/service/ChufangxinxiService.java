package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufangxinxiView;


/**
 * 处方信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ChufangxinxiService extends IService<ChufangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufangxinxiVO> selectListVO(Wrapper<ChufangxinxiEntity> wrapper);
   	
   	ChufangxinxiVO selectVO(@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);
   	
   	List<ChufangxinxiView> selectListView(Wrapper<ChufangxinxiEntity> wrapper);
   	
   	ChufangxinxiView selectView(@Param("ew") Wrapper<ChufangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufangxinxiEntity> wrapper);
   	

}

