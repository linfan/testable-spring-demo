package com.example.demo.service;

import com.example.demo.util.DataUtil;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName() {
        System.out.println(DataUtil.getData());
        return DataUtil.getData();
    }

}
