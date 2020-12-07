package com.zjh.design.store;

import java.util.Map;

/**
 * @author : zhaojh
 * @date : 2020/12/7 14:47
 * @description : 商品相关接口
 */
public interface ICommodity {
    /**
     * 发放商品接口
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
