package com.yw.colliery.api.business.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yw.colliery.api.base.BaseController;
import com.yw.colliery.api.base.ESessionKey;
import com.yw.colliery.api.base.ResultObject;
import com.yw.colliery.entity.DcSwxqYjcl;
import com.yw.colliery.service.business.impl.DcSwxqYjclServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
/**
 * <p>
 * 地测信息管理-水文险情及预警处理 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-03-06
 */
@RestController
@RequestMapping("/apiv1/dc-swxq-yjcl")
@Api(value = "DcSwxqYjclController", description = "地测信息管理-水文险情及预警处理")
@Slf4j
public class DcSwxqYjclController extends BaseController<DcSwxqYjclServiceImpl,DcSwxqYjcl> {

	@ApiOperation(value = "决策统计",response=ResultObject.class)//
	@PostMapping("/countToPieChart")
	public Object countBy(@ApiParam(hidden=true) @RequestParam Map<String,Object> params
			, @ApiParam(hidden=true) HttpServletRequest request
			) {

		if(log.isDebugEnabled())log.debug("countBy参数:\n{}",params);
		HttpSession session = request.getSession();
		Map<String,Object> result = new HashMap<String,Object>();
		
		QueryWrapper<DcSwxqYjcl> qw = null;
		
		//用户区域部门列表sql ('数据所属煤矿','所属煤矿')
		@SuppressWarnings("unchecked")
		List<String> deptsIds = (List<String>)session.getAttribute(ESessionKey.DeptsIds.key);
		
		qw = new QueryWrapper<DcSwxqYjcl>();
		qw.select("count(*) AS shuliang","zrdw");
		qw.in(true,"ssmk", deptsIds);
		qw.groupBy(true, "zrdw");
		result.put("zrdwGroup", service.list(qw));
		
		qw = new QueryWrapper<DcSwxqYjcl>();
		qw.select("count(*) AS shuliang","wxdj");
		qw.in(true,"ssmk", deptsIds);
		qw.groupBy(true, "wxdj");
		result.put("wxdjGroup", service.list(qw));

		return new ResultObject(ResultObject.SUCCESS,"1005","接口调用成功",result);
	}
}
