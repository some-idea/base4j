package com.base4j.mapper.admin;

import com.base4j.entity.admin.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {

    List<SysUser> querySysUserList();
}
