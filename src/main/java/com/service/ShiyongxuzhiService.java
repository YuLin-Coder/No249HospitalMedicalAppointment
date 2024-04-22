package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyongxuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyongxuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyongxuzhiView;


/**
 * 使用须知
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
public interface ShiyongxuzhiService extends IService<ShiyongxuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyongxuzhiVO> selectListVO(Wrapper<ShiyongxuzhiEntity> wrapper);
   	
   	ShiyongxuzhiVO selectVO(@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);
   	
   	List<ShiyongxuzhiView> selectListView(Wrapper<ShiyongxuzhiEntity> wrapper);
   	
   	ShiyongxuzhiView selectView(@Param("ew") Wrapper<ShiyongxuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyongxuzhiEntity> wrapper);
   	

}

