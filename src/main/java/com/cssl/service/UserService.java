package com.cssl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.TbUser;

public interface UserService extends IService<TbUser> {

    TbUser selectName(String username,String phone);


    TbUser selectUser(String username,String phone,String password);
}
