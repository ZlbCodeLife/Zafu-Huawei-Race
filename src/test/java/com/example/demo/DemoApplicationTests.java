package com.example.demo;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.huawei.cloudcampus.api.ApiClient;
import com.huawei.cloudcampus.api.ApiException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.huawei.cloudcampus.api.model.*;
import com.huawei.cloudcampus.api.service.*;

import com.google.gson.Gson;
import org.springframework.http.HttpHeaders;


@SpringBootTest
class DemoApplicationTests {

//    public static void main(String[] args) {
//        // init Api
//        String tenantName = "tenantName";
//        String tenantPwd = "tenantPwd";
//        String host = "host";
//        String port = "port";
//        ApiClient apiClient = new ApiClient();
//        apiClient.setTenantName(tenantName);
//        apiClient.setTenantPwd(tenantPwd);
//        apiClient.setHost(host);
//        apiClient.setPort(port);
//        AuthApiV2ServiceApi api = new AuthApiV2ServiceApi(apiClient);
//
//        // Gson
//        Gson gson = new Gson();
//
//        try {
//            // body
//            String bodyJson = "{'userName':'zhangsan@xxx.com','password':'******'}";
//            AuthCreditV2In body = gson.fromJson(bodyJson, AuthCreditV2In.class);
//
//            // access api
//            AuthTokenV2Out response = api.getAuthToken(body);
//            String result = gson.toJson(response);
//            System.out.println(result);
//        } catch (ApiException e) {
//            e.printStackTrace();
//        }
//    }
//    }

}
