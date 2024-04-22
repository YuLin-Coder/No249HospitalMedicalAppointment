package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhenduanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhenduanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhenduanxinxiView;


/**
 * 诊断信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface ZhenduanxinxiService extends IService<ZhenduanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhenduanxinxiVO> selectListVO(Wrapper<ZhenduanxinxiEntity> wrapper);
   	
   	ZhenduanxinxiVO selectVO(@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);
   	
   	List<ZhenduanxinxiView> selectListView(Wrapper<ZhenduanxinxiEntity> wrapper);
   	
   	ZhenduanxinxiView selectView(@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhenduanxinxiEntity> wrapper);
   	

}

