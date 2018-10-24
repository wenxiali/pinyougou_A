package com.cssl.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cssl.pojo.TbAddress;
import com.cssl.pojo.TbOrder;
import com.cssl.pojo.TbOrderItem;
import com.cssl.service.AddressService;
import com.cssl.service.OrderItemService;
import com.cssl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
    @Autowired
    private AddressService aService;

    @Autowired
    private OrderItemService oiService;

    @Autowired
    private OrderService oService;

    /**
     * 删除地址
     *
     * @param aId
     * @return
     */
    @RequestMapping("/delAddress.action")
    public int de(Integer aId) {
        int row = aService.deleteAdd(aId);
        return row;
    }

    /**
     * 选中删除
     *
     * @param orderId
     * @return
     */
    @RequestMapping("/delete")
    public boolean deleteevaluate(String orderId) {
        boolean a = oiService.delete(new QueryWrapper<TbOrderItem>().eq("order_id", orderId));
        // System.out.println(a);
        boolean b = false;
        if (a) {
            b = oService.delete(new QueryWrapper<TbOrder>().eq("order_id", orderId));
            //System.out.println(b);
        }
        return b;
    }

    /**
     * 退款
     */
    @RequestMapping("/home-tuikuan")
    public int tuikuan(TbOrder order) {
        int row = oService.updateTui(order);
        return row;
    }

    /**
     * 修改默认地址
     *
     * @param address
     * @return
     */
    @RequestMapping("/home-moren")
    public int moren(TbAddress address) {
        int row =0;
        if (address.getIs_Default() == 1) {
            return 0;
        }else {
            row = aService.updateIs(address);
            return row;
        }
    }

}
