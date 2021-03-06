package com.zqxsober.service.impl;

import com.zqxsober.config.LogTool;
import com.zqxsober.dao.general.RcAreaCodeMapper;
import com.zqxsober.domain.RcAreaCode;
import com.zqxsober.service.ViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ViewServiceImpl implements ViewService {

    @Resource
    private RcAreaCodeMapper rcAreaCodeMapper;

    /**
     * 地区列表
     *
     * @param rcAreaCodeId
     * @return
     */
    public RcAreaCode queryAll(Integer rcAreaCodeId) {
        LogTool.info("查询列表，请求参数为rcAreaCodeId：",rcAreaCodeId);
        RcAreaCode rcAreaCode = rcAreaCodeMapper.selectByPrimaryKey(rcAreaCodeId);
        return rcAreaCode;
    }
}
