package com.zjh.design.store.impl;

import com.zjh.design.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author : zhaojh
 * @date : 2020/12/7 15:41
 * @description :
 */
@Slf4j
public class PhoneCommodityService implements ICommodity {

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
      log.info("send PhoneSer");
    }
}
