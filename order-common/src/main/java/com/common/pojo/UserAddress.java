package com.common.pojo;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Integer id;
    private String userAddersss;
    private String userId;
    private String consignee;//收货人
    private String phoneNum;//电话号码
    private String isDefault;//是否为默认地址
    public UserAddress(){

    }
    public UserAddress(Integer id, String userAddersss, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddersss = userAddersss;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddersss() {
        return userAddersss;
    }

    public void setUserAddersss(String userAddersss) {
        this.userAddersss = userAddersss;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userAddersss='" + userAddersss + '\'' +
                ", userId='" + userId + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }
}
