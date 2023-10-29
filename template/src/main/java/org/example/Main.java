package org.example;

import org.example.api.EntityService;
import org.example.implementation.Goods;
import org.example.implementation.Order;
import org.example.implementation.User;
import org.example.implementation.service.GoodsEntityService;
import org.example.implementation.service.OrderEntityService;
import org.example.implementation.service.UserEntityService;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) {
        final EntityService<Goods> goodsService = new GoodsEntityService();
        final EntityService<User>   userService = new UserEntityService();
        final EntityService<Order> orderService = new OrderEntityService();

        final Map<String, Object> goodsUpdateResult = goodsService.process("goods_1", new HashMap<>());
        final Map<String, Object> userUpdateResult  = userService.process("user_1", new HashMap<>());
        final Map<String, Object> orderUpdateResult = orderService.process("order_1", new HashMap<>());

        System.out.println(goodsUpdateResult);
        System.out.println(userUpdateResult);
        System.out.println(orderUpdateResult);
    }
}
