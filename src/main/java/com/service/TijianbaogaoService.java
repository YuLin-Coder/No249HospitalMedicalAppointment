package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianbaogaoView;


/**
 * 体检报告
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
public interface TijianbaogaoService extends IService<TijianbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianbaogaoVO> selectListVO(Wrapper<TijianbaogaoEntity> wrapper);
   	
   	TijianbaogaoVO selectVO(@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);
   	
   	List<TijianbaogaoView> selectListView(Wrapper<TijianbaogaoEntity> wrapper);
   	
   	TijianbaogaoView selectView(@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianbaogaoEntity> wrapper);
   	

}

