package com.cssl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cssl.pojo.TbUser;

import java.util.Map;

public interface UserService {
    int insertUser(TbUser user);

    TbUser selectName(String username,String phone);

    IPage<Map<String,Object>> selectList(IPage page,String username,Integer status,String nick_Name);

    TbUser selectUser(String username,String phone,String password);
}
