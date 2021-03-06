package com.cssl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.TbAddress;

import java.util.Map;

public interface AddressService extends IService<TbAddress> {
    IPage<Map<String,Object>> selectAddress(IPage page, String username, Integer aId);

    TbAddress selectIs();

    int deleteAdd(Integer aId);

    TbAddress getAddress(String username);

    int updateAddress(TbAddress address);

    int updateIs(TbAddress address);
    int updateUs(TbAddress address);

}
