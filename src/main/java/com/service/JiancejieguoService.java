package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancejieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancejieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancejieguoView;


/**
 * 检测结果
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface JiancejieguoService extends IService<JiancejieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancejieguoVO> selectListVO(Wrapper<JiancejieguoEntity> wrapper);
   	
   	JiancejieguoVO selectVO(@Param("ew") Wrapper<JiancejieguoEntity> wrapper);
   	
   	List<JiancejieguoView> selectListView(Wrapper<JiancejieguoEntity> wrapper);
   	
   	JiancejieguoView selectView(@Param("ew") Wrapper<JiancejieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancejieguoEntity> wrapper);
   	

}

