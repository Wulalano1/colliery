package com.yw.colliery.service.unsafe.impl;

import com.yw.colliery.api.base.ResultObject;
import com.yw.colliery.entity.unsafe.UnsafeInfoEntity;
import com.yw.colliery.mapper.unsafe.UnsafeMapper;
import com.yw.colliery.service.unsafe.UnsafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnsafeServiceImpl implements UnsafeService {

    @Autowired
    private UnsafeMapper unsafeMapper;


    @Override
    public Integer unsafeInsert(UnsafeInfoEntity unsafeInfoEntity) {
        return unsafeMapper.insertUnsafe(unsafeInfoEntity);
    }

    @Override
    public ArrayList<UnsafeInfoEntity> getAllUnsafeInfo() {
        return unsafeMapper.selectAllUnsafeInfo();
    }

    @Override
    public List<UnsafeInfoEntity> getUnsafeInfoByDepartId(Integer departId) {
        return unsafeMapper.selectUnsafeInfoByDepartList(departId);
    }

    @Override
    public Integer upateUnsafeInfo(UnsafeInfoEntity unsafeInfoEntity) {
        return unsafeMapper.updateUnsafeInfo(unsafeInfoEntity);
    }
}
