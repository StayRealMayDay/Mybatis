package com.mybatis.nnewdemo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.mybatis.nnewdemo.entity.MenuModel;
import com.mybatis.nnewdemo.mapper.MenuModelMapper;
import com.mybatis.nnewdemo.service.MenuModelService;

@Service
public class MenuModelServiceImpl implements MenuModelService{

    @Resource
    private MenuModelMapper menuModelMapper;

    @Override
    public int insert(MenuModel menuModel){
        return menuModelMapper.insert(menuModel);
    }

    @Override
    public int insertSelective(MenuModel menuModel){
        return menuModelMapper.insertSelective(menuModel);
    }

    @Override
    public int insertList(List<MenuModel> menuModels){
        return menuModelMapper.insertList(menuModels);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuModel menuModel){
        return menuModelMapper.updateByPrimaryKeySelective(menuModel);
    }
}
