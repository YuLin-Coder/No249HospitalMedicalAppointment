package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangdanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangdanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangdanganView;


/**
 * 健康档案
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public interface JiankangdanganService extends IService<JiankangdanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangdanganVO> selectListVO(Wrapper<JiankangdanganEntity> wrapper);
   	
   	JiankangdanganVO selectVO(@Param("ew") Wrapper<JiankangdanganEntity> wrapper);
   	
   	List<JiankangdanganView> selectListView(Wrapper<JiankangdanganEntity> wrapper);
   	
   	JiankangdanganView selectView(@Param("ew") Wrapper<JiankangdanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangdanganEntity> wrapper);
   	

}

