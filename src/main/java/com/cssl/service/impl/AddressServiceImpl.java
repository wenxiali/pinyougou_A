package com.cssl.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.dao.AddressDao;
import com.cssl.pojo.TbAddress;
import com.cssl.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AddressServiceImpl extends ServiceImpl<AddressDao, TbAddress> implements AddressService {

    @Autowired
    private AddressDao dao;

    @Override
    public IPage<Map<String, Object>> selectAddress(IPage page,String username, Integer aId) {
        return dao.selectAddress(page,username,aId);
    }

    @Override
    public TbAddress selectIs() {
        return dao.selectIs();
    }

    @Override
    public int deleteAdd(Integer aId) {
        return dao.deleteAdd(aId);
    }

    @Override
    public TbAddress getAddress(String username) {
        return dao.byenAddress(username);
    }

    @Override
    public int updateAddress(TbAddress address) {
        return dao.updateAddress(address);
    }

    @Override
    public int updateIs(TbAddress address) {
        return dao.updateIs(address);
    }

    @Override
    public int updateUs(TbAddress address) {
        return dao.updateUs(address);
    }


}
