package com.example.demo.util;

import com.example.demo.Config.UserConfig;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class getToken {
    public static HttpHeaders getToken()  {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders requestHeaders = new HttpHeaders();
        MediaType type=MediaType.parseMediaType("application/json;charset=UTF-8");
        requestHeaders.setContentType(type);
        requestHeaders.add("Accept",MediaType.APPLICATION_JSON.toString());
        String token="";
        try {
            Map map = new HashMap(16);
            map.put("userName", UserConfig.username);
            map.put("password",UserConfig.pwd);
            HttpEntity<Map> requestEntity = new HttpEntity<>(map,requestHeaders);
            ResponseEntity<JSONObject> response = restTemplate.exchange("https://cn2.naas.huaweicloud.com:18002/controller/v2/tokens", HttpMethod.POST,requestEntity,JSONObject.class);
            JSONObject jsonObject = Objects.requireNonNull(response.getBody()).getJSONObject("data");
            token=jsonObject.get("token_id").toString();
            requestHeaders.add("X-AUTH-TOKEN",token);
            requestHeaders.add("Accept-Language","en-US");
            return requestHeaders;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }
}
