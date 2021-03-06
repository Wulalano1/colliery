package com.yw.colliery.service.user;

import com.yw.colliery.entity.user.CollierySafetyUserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @description: 用户查询接口
 * @author: xuzhou-lhq
 * @create: 2019-04-25 14:04
 **/
public interface CollierySafetyUserService extends UserDetailsService {

    CollierySafetyUserEntity selectByUserName(String userCode);

    int addSafetyUser(CollierySafetyUserEntity userEntity);

    int updateSafetyUSer(CollierySafetyUserEntity userEntity);

    int deleteSafetyUSer(Integer userId);

    List<CollierySafetyUserEntity> selectAllUser();

    CollierySafetyUserEntity selectyUserId(Integer userId);
}
