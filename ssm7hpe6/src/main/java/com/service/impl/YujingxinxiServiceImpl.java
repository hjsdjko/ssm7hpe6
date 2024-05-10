package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YujingxinxiDao;
import com.entity.YujingxinxiEntity;
import com.service.YujingxinxiService;
import com.entity.vo.YujingxinxiVO;
import com.entity.view.YujingxinxiView;

@Service("yujingxinxiService")
public class YujingxinxiServiceImpl extends ServiceImpl<YujingxinxiDao, YujingxinxiEntity> implements YujingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YujingxinxiEntity> page = this.selectPage(
                new Query<YujingxinxiEntity>(params).getPage(),
                new EntityWrapper<YujingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YujingxinxiEntity> wrapper) {
		  Page<YujingxinxiView> page =new Query<YujingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YujingxinxiVO> selectListVO(Wrapper<YujingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YujingxinxiVO selectVO(Wrapper<YujingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YujingxinxiView> selectListView(Wrapper<YujingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YujingxinxiView selectView(Wrapper<YujingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
