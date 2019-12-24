package com.briup.employee.web.controller;

import com.briup.employee.bean.Message;
import com.briup.employee.bean.employee;
import com.briup.employee.util.MessageUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empcontroller {
    @PostMapping("/add")
    public Message add(employee emp){
        return MessageUtil.success("添加员工");

    }
}
