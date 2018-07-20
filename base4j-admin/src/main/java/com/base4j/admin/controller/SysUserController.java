package com.base4j.admin.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.base4j.entity.admin.SysUser;
import com.base4j.service.admin.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Reference(version = "1.0.0")
    private SysUserService sysUserService;

    @RequestMapping("/querySysUserList")
    public String querySysUserList(){

        List<SysUser> sysUsers = sysUserService.querySysUserList();

        return JSON.toJSONString(sysUsers);
    }
}
