package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuyuanxinxiView;


/**
 * 住院信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ZhuyuanxinxiService extends IService<ZhuyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuyuanxinxiVO> selectListVO(Wrapper<ZhuyuanxinxiEntity> wrapper);
   	
   	ZhuyuanxinxiVO selectVO(@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);
   	
   	List<ZhuyuanxinxiView> selectListView(Wrapper<ZhuyuanxinxiEntity> wrapper);
   	
   	ZhuyuanxinxiView selectView(@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuyuanxinxiEntity> wrapper);
   	

}

