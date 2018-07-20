package com.base4j.service.impl.admin;

import com.alibaba.dubbo.config.annotation.Service;
import com.base4j.entity.admin.SysUser;
import com.base4j.mapper.admin.SysUserMapper;
import com.base4j.service.admin.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author hyj
 */

@Service(version = "1.0.0")
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> querySysUserList() {
        return sysUserMapper.querySysUserList();
    }
}
