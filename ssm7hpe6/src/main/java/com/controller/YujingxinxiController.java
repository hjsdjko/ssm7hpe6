package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YujingxinxiEntity;
import com.entity.view.YujingxinxiView;

import com.service.YujingxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 预警信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 00:19:41
 */
@RestController
@RequestMapping("/yujingxinxi")
public class YujingxinxiController {
    @Autowired
    private YujingxinxiService yujingxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YujingxinxiEntity yujingxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yujingxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			yujingxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YujingxinxiEntity> ew = new EntityWrapper<YujingxinxiEntity>();
		PageUtils page = yujingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yujingxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YujingxinxiEntity yujingxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yujingxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			yujingxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YujingxinxiEntity> ew = new EntityWrapper<YujingxinxiEntity>();
		PageUtils page = yujingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yujingxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YujingxinxiEntity yujingxinxi){
       	EntityWrapper<YujingxinxiEntity> ew = new EntityWrapper<YujingxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yujingxinxi, "yujingxinxi")); 
        return R.ok().put("data", yujingxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YujingxinxiEntity yujingxinxi){
        EntityWrapper< YujingxinxiEntity> ew = new EntityWrapper< YujingxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yujingxinxi, "yujingxinxi")); 
		YujingxinxiView yujingxinxiView =  yujingxinxiService.selectView(ew);
		return R.ok("查询预警信息成功").put("data", yujingxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YujingxinxiEntity yujingxinxi = yujingxinxiService.selectById(id);
        return R.ok().put("data", yujingxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YujingxinxiEntity yujingxinxi = yujingxinxiService.selectById(id);
        return R.ok().put("data", yujingxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YujingxinxiEntity yujingxinxi, HttpServletRequest request){
    	yujingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yujingxinxi);

        yujingxinxiService.insert(yujingxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YujingxinxiEntity yujingxinxi, HttpServletRequest request){
    	yujingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yujingxinxi);
    	yujingxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        yujingxinxiService.insert(yujingxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YujingxinxiEntity yujingxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yujingxinxi);
        yujingxinxiService.updateById(yujingxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yujingxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YujingxinxiEntity> wrapper = new EntityWrapper<YujingxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yujingxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
