package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HesuanjianceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HesuanjianceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanjianceView;


/**
 * 核酸检测
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface HesuanjianceService extends IService<HesuanjianceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HesuanjianceVO> selectListVO(Wrapper<HesuanjianceEntity> wrapper);
   	
   	HesuanjianceVO selectVO(@Param("ew") Wrapper<HesuanjianceEntity> wrapper);
   	
   	List<HesuanjianceView> selectListView(Wrapper<HesuanjianceEntity> wrapper);
   	
   	HesuanjianceView selectView(@Param("ew") Wrapper<HesuanjianceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HesuanjianceEntity> wrapper);
   	

}

