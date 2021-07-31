package com.zhong.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//实体类实现序列化：支持流传输
public class Payment implements Serializable {
    private Long id;
    private String serial; //序列号
}
