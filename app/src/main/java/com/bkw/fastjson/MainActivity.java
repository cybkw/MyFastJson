package com.bkw.fastjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bkw.fastjson.bean.OrderInfo;
import com.bkw.fastjson.bean.UserInfo;
import com.bkw.library.JSON;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serializer();
    }

    private void serializer() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(15);
        userInfo.setMoney(0);
        userInfo.setName("bkw");
        userInfo.setSuperme(true);

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setNo("100021");
        orderInfo.setOrderName("台网黑猪肉");
        orderInfo.setUserInfo(userInfo);

        String jsonString = JSON.toJSONString(orderInfo);

        Log.e("TAG", jsonString);
    }
}
