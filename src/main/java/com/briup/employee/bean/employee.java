package com.briup.employee.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class employee implements Serializable {
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "编号")
    private int id;
    @ApiModelProperty(value = "描述")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
