package com.yw.colliery.api.business.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import com.yw.colliery.api.base.BaseController;
import com.yw.colliery.service.business.impl.DcJbcsKqwzServiceImpl;
import com.yw.colliery.entity.DcJbcsKqwz;
/**
 * <p>
 * 地测信息管理-基本参数-矿区位置 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-03-06
 */
@RestController
@RequestMapping("/apiv1/dc-jbcs-kqwz")
@Api(value = "DcJbcsKqwzController", description = "地测信息管理-基本参数-矿区位置")
@Slf4j
public class DcJbcsKqwzController extends BaseController<DcJbcsKqwzServiceImpl,DcJbcsKqwz> {
    
}
