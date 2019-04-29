package com.yw.colliery.user.impl;

import com.yw.colliery.entity.user.CollierySafetyUserEntity;
import com.yw.colliery.mapper.user.CollierySafetyUserMapper;
import com.yw.colliery.user.CollierySafetyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @description: 用户查询
 * @author: xuzhou-lhq
 * @create: 2019-04-25 12:39
 **/
@Service
public class CollierySafetyUserServiceImpl implements CollierySafetyUserService {

    @Autowired
    private CollierySafetyUserMapper collierySafetyUserMapper;

    @Override
    public CollierySafetyUserEntity selectByUserCode(String userCode) {
        return collierySafetyUserMapper.selectByUserCode(userCode);
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        CollierySafetyUserEntity scsfUser = this.selectByUserCode(userName);
        if(scsfUser == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return scsfUser;
    }

}