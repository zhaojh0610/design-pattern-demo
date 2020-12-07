package com.zjh.design;

import com.zjh.design.store.ICommodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : zhaojh
 * @date : 2020/12/7 15:51
 * @description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAPI {

    @Test
    public void test() throws Exception {
        Store store = new Store();
        ICommodity Coupon = store.getCommodity(1);
        Coupon.sendCommodity(null,null,null,null);
        ICommodity phone = store.getCommodity(2);
        phone.sendCommodity(null,null,null,null);
        ICommodity shoppingCard = store.getCommodity(3);
        shoppingCard.sendCommodity(null,null,null,null);
    }
}
