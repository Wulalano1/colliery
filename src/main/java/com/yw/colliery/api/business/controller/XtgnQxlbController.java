package com.yw.colliery.api.business.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import com.yw.colliery.api.base.BaseController;
import com.yw.colliery.service.business.impl.XtgnQxlbServiceImpl;
import com.yw.colliery.entity.XtgnQxlb;
/**
 * <p>
 * 系统功能-权限列表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-03-07
 */
@RestController
@RequestMapping("/apiv1/xtgn-qxlb")
@Api(value = "XtgnQxlbController", description = "系统功能-权限列表")
@Slf4j
public class XtgnQxlbController extends BaseController<XtgnQxlbServiceImpl,XtgnQxlb> {

}
