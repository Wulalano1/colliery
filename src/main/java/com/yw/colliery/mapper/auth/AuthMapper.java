package com.yw.colliery.mapper.auth;

import com.yw.colliery.entity.auth.AuthEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthMapper {

    /**
     * 添加权限
     * @param entity
     * @return
     */
    int addAuth(AuthEntity entity);

    /**
     * 修改权限
     * @param entity
     * @return
     */
    int updateAuth(AuthEntity entity);

    /**
     * 删除权限
     * @param authId
     * @return
     */
    int deleteAuth(Integer authId);

    /**
     * 根据id查询权限
     * @param authId
     * @return
     */
    AuthEntity selectById(Integer authId);

    /**
     * 根据等级和id集合查询权限集合
     * @param level
     * @param ids
     * @return
     */
    List<AuthEntity> selectByLevelAndIds(Integer level, List<Integer> ids);


    /**
     * 查询所有权限
     * @return
     */
    List<AuthEntity> selectAll();

}