package com.zjh.design.store.impl;

import com.zjh.design.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author : zhaojh
 * @date : 2020/12/7 15:37
 * @description :
 */
@Slf4j
public class ShoppingCardCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        /**
         * 业务逻辑
         */
      log.info("send ShoppingCard  。。。");
    }
}
