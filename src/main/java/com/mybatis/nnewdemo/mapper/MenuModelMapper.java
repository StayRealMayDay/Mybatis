package com.mybatis.nnewdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.mybatis.nnewdemo.entity.MenuModel;

@Mapper
public interface MenuModelMapper {
    int insert(@Param("menuModel") MenuModel menuModel);

    int insertSelective(@Param("menuModel") MenuModel menuModel);

    int insertList(@Param("menuModels") List<MenuModel> menuModels);

    int updateByPrimaryKeySelective(@Param("menuModel") MenuModel menuModel);
}
