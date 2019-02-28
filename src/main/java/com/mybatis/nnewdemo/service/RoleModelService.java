package com.mybatis.nnewdemo.service;

import java.util.List;
import com.mybatis.nnewdemo.entity.RoleModel;
public interface RoleModelService{

    int insert(RoleModel roleModel);

    int insertSelective(RoleModel roleModel);

    int insertList(List<RoleModel> roleModels);

    int updateByPrimaryKeySelective(RoleModel roleModel);
}
