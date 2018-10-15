package com.cssl.controller;

import com.cssl.pojo.TbUser;
import com.cssl.service.AddressService;
import com.cssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AjaxController {
    @Autowired
    private AddressService aService;


    @Autowired
    private UserService uService;

    /**
     * 删除地址
     * @param aId
     * @return
     */
    @RequestMapping("/delAddress.action")
    public int de(Integer aId){
        int row=aService.deleteAdd(aId);
        return  row;
    }

    @RequestMapping("/modifyPW.action")
    public boolean modifyPW(TbUser user,Integer id, HttpSession session){
        boolean row=uService.updateById(user);
        return row;
    }
}