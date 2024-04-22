package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinxinxiView;


/**
 * 药品信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface YaopinxinxiService extends IService<YaopinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinxinxiVO> selectListVO(Wrapper<YaopinxinxiEntity> wrapper);
   	
   	YaopinxinxiVO selectVO(@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);
   	
   	List<YaopinxinxiView> selectListView(Wrapper<YaopinxinxiEntity> wrapper);
   	
   	YaopinxinxiView selectView(@Param("ew") Wrapper<YaopinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinxinxiEntity> wrapper);
   	

}

