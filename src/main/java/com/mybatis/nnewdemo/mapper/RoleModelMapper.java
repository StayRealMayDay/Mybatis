package com.mybatis.nnewdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.mybatis.nnewdemo.entity.RoleModel;

@Mapper
public interface RoleModelMapper {
    int insert(@Param("roleModel") RoleModel roleModel);

    int insertSelective(@Param("roleModel") RoleModel roleModel);

    int insertList(@Param("roleModels") List<RoleModel> roleModels);

    int updateByPrimaryKeySelective(@Param("roleModel") RoleModel roleModel);
}
