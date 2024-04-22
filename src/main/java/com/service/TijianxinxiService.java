package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianxinxiView;


/**
 * 体检信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface TijianxinxiService extends IService<TijianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianxinxiVO> selectListVO(Wrapper<TijianxinxiEntity> wrapper);
   	
   	TijianxinxiVO selectVO(@Param("ew") Wrapper<TijianxinxiEntity> wrapper);
   	
   	List<TijianxinxiView> selectListView(Wrapper<TijianxinxiEntity> wrapper);
   	
   	TijianxinxiView selectView(@Param("ew") Wrapper<TijianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianxinxiEntity> wrapper);
   	

}

