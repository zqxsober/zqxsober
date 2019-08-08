package com.zqxsober.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RcAreaCode {

    private Integer rcAreaCodeId;

    private String rcAreaCodeUuid;

    private String areaCode;

    private String codeName;

    private String remark;

    private String busiType;

    private Date createTime;

    private Date updateTime;

    private Integer delFlag;

    private String createUserUuid;
    
    private String updateUserUuid;
    

}