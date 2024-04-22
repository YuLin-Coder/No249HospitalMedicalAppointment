package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuozhenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuozhenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuozhenxinxiView;


/**
 * 坐诊信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ZuozhenxinxiService extends IService<ZuozhenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuozhenxinxiVO> selectListVO(Wrapper<ZuozhenxinxiEntity> wrapper);
   	
   	ZuozhenxinxiVO selectVO(@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);
   	
   	List<ZuozhenxinxiView> selectListView(Wrapper<ZuozhenxinxiEntity> wrapper);
   	
   	ZuozhenxinxiView selectView(@Param("ew") Wrapper<ZuozhenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuozhenxinxiEntity> wrapper);
   	

}

