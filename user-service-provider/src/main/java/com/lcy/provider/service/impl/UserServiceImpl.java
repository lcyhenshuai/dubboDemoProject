package com.lcy.provider.service.impl;



import com.common.pojo.UserAddress;
import com.common.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    public List<UserAddress> getAllUserAddresssList(String id) {
        UserAddress userAddress1=new UserAddress(1,"河南郑州","001","lcy","123456","y");
        UserAddress userAddress2=new UserAddress(2,"河南郑州","002","yyy","123456","y");

        return Arrays.asList(userAddress1,userAddress2);
    }
}
