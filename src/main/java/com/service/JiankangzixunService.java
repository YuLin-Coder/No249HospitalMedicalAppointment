package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangzixunView;


/**
 * 健康资讯
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface JiankangzixunService extends IService<JiankangzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangzixunVO> selectListVO(Wrapper<JiankangzixunEntity> wrapper);
   	
   	JiankangzixunVO selectVO(@Param("ew") Wrapper<JiankangzixunEntity> wrapper);
   	
   	List<JiankangzixunView> selectListView(Wrapper<JiankangzixunEntity> wrapper);
   	
   	JiankangzixunView selectView(@Param("ew") Wrapper<JiankangzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangzixunEntity> wrapper);
   	

}

