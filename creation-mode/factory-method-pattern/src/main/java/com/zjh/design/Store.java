package com.zjh.design;

import com.zjh.design.store.ICommodity;
import com.zjh.design.store.impl.CouponCommodityService;
import com.zjh.design.store.impl.PhoneCommodityService;
import com.zjh.design.store.impl.ShoppingCardCommodityService;

/**
 * @author : zhaojh
 * @date : 2020/12/7 14:56
 * @description :
 */
public class Store {

    public ICommodity getCommodity(Integer type) throws Exception {
        if (Integer.valueOf("1").equals(type)) {
            return new CouponCommodityService();
        }
        if (Integer.valueOf("2").equals(type)) {
            return  new PhoneCommodityService();
        }
        if (Integer.valueOf("3").equals(type)) {
            return new ShoppingCardCommodityService();
        }
        throw new Exception("没有该类型的奖品");
    }
}
