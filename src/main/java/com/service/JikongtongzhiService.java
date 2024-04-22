package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JikongtongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JikongtongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JikongtongzhiView;


/**
 * 疾控通知
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface JikongtongzhiService extends IService<JikongtongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JikongtongzhiVO> selectListVO(Wrapper<JikongtongzhiEntity> wrapper);
   	
   	JikongtongzhiVO selectVO(@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);
   	
   	List<JikongtongzhiView> selectListView(Wrapper<JikongtongzhiEntity> wrapper);
   	
   	JikongtongzhiView selectView(@Param("ew") Wrapper<JikongtongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JikongtongzhiEntity> wrapper);
   	

}

