package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunhuifuView;


/**
 * 咨询回复
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ZixunhuifuService extends IService<ZixunhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunhuifuVO> selectListVO(Wrapper<ZixunhuifuEntity> wrapper);
   	
   	ZixunhuifuVO selectVO(@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);
   	
   	List<ZixunhuifuView> selectListView(Wrapper<ZixunhuifuEntity> wrapper);
   	
   	ZixunhuifuView selectView(@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunhuifuEntity> wrapper);
   	

}

