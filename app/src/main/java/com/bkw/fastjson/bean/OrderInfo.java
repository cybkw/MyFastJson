package com.bkw.fastjson.bean;

public class OrderInfo {

    private String no;
    private String orderName;

    private UserInfo userInfo;

    @Override
    public String toString() {
        return "OrderInfo{" +
                "no='" + no + '\'' +
                ", orderName='" + orderName + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
