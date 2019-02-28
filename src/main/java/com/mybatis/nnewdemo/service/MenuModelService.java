package com.mybatis.nnewdemo.service;

import java.util.List;
import com.mybatis.nnewdemo.entity.MenuModel;
public interface MenuModelService{

    int insert(MenuModel menuModel);

    int insertSelective(MenuModel menuModel);

    int insertList(List<MenuModel> menuModels);

    int updateByPrimaryKeySelective(MenuModel menuModel);
}
