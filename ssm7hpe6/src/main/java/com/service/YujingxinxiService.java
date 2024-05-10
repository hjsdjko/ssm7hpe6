package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YujingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YujingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YujingxinxiView;


/**
 * 预警信息
 *
 * @author 
 * @email 
 * @date 2021-03-10 00:19:41
 */
public interface YujingxinxiService extends IService<YujingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YujingxinxiVO> selectListVO(Wrapper<YujingxinxiEntity> wrapper);
   	
   	YujingxinxiVO selectVO(@Param("ew") Wrapper<YujingxinxiEntity> wrapper);
   	
   	List<YujingxinxiView> selectListView(Wrapper<YujingxinxiEntity> wrapper);
   	
   	YujingxinxiView selectView(@Param("ew") Wrapper<YujingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YujingxinxiEntity> wrapper);
   	
}

