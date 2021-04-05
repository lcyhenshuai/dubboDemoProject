package com.common.service;



import com.common.pojo.UserAddress;

import java.util.List;

public interface UserService {
    /**
     *根据用户id返回所有用户的收获地址
     * @Param id
     * @return
     */
    List<UserAddress>getAllUserAddresssList(String id);
}
