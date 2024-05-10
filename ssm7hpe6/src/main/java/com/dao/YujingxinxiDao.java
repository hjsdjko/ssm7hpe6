package com.dao;

import com.entity.YujingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YujingxinxiVO;
import com.entity.view.YujingxinxiView;


/**
 * 预警信息
 * 
 * @author 
 * @email 
 * @date 2021-03-10 00:19:41
 */
public interface YujingxinxiDao extends BaseMapper<YujingxinxiEntity> {
	
	List<YujingxinxiVO> selectListVO(@Param("ew") Wrapper<YujingxinxiEntity> wrapper);
	
	YujingxinxiVO selectVO(@Param("ew") Wrapper<YujingxinxiEntity> wrapper);
	
	List<YujingxinxiView> selectListView(@Param("ew") Wrapper<YujingxinxiEntity> wrapper);

	List<YujingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YujingxinxiEntity> wrapper);
	
	YujingxinxiView selectView(@Param("ew") Wrapper<YujingxinxiEntity> wrapper);
	
}
