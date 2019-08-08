package com.zqxsober.controller;

import com.zqxsober.config.LogTool;
import com.zqxsober.domain.RcAreaCode;
import com.zqxsober.service.ViewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/zqxsober")
public class ViewController {

    @Resource
    private ViewService viewService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String view(){
        return "zqxsober";
    }

    @RequestMapping(value = "/areaCodeList", method = RequestMethod.POST)
    @ResponseBody
    public RcAreaCode areaCodeList(Integer rcAreaCodeId) {
        try {
            RcAreaCode rcAreaCode =  viewService.queryAll(rcAreaCodeId);
            return rcAreaCode;
        } catch (Exception e) {
            LogTool.error("服务异常，请求参数：",rcAreaCodeId);
            LogTool.error("异常信息：",e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
