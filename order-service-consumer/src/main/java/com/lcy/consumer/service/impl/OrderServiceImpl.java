package com.lcy.consumer.service.impl;

import com.common.pojo.UserAddress;
import com.common.service.OrderService;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserService userService;
    public void initOrder(String userId) {
        //查询用户的收获地址
        List<UserAddress> userAddressList=userService.getAllUserAddresssList(userId);
//        System.out.println(userAddressList);
        for(UserAddress userAddress:userAddressList){
            System.out.println(userAddress.getUserAddersss());
        }
    }
}
