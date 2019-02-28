package com.mybatis.nnewdemo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.mybatis.nnewdemo.entity.RoleModel;
import com.mybatis.nnewdemo.mapper.RoleModelMapper;
import com.mybatis.nnewdemo.service.RoleModelService;

@Service
public class RoleModelServiceImpl implements RoleModelService{

    @Resource
    private RoleModelMapper roleModelMapper;

    @Override
    public int insert(RoleModel roleModel){
        return roleModelMapper.insert(roleModel);
    }

    @Override
    public int insertSelective(RoleModel roleModel){
        return roleModelMapper.insertSelective(roleModel);
    }

    @Override
    public int insertList(List<RoleModel> roleModels){
        return roleModelMapper.insertList(roleModels);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleModel roleModel){
        return roleModelMapper.updateByPrimaryKeySelective(roleModel);
    }
}
