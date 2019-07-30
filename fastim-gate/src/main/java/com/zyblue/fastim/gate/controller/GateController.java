package com.zyblue.fastim.gate.controller;


import com.zyblue.fastim.common.ServerInfo;
import com.zyblue.fastim.common.request.LoginRequest;
import com.zyblue.fastim.common.response.LoginResponse;
import com.zyblue.fastim.common.url.UrlConstant;
import com.zyblue.fastim.common.vo.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class GateController {
    private final static Logger logger = LoggerFactory.getLogger(GateController.class);

    @RequestMapping(value = UrlConstant.GET_SERVERINFO, method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<ServerInfo> getServerInfo(@RequestBody LoginRequest loginRequest){
        logger.info("getServerInfo|loginRequest:{}", loginRequest);

        ServerInfo info = new ServerInfo();
        info.setIp("127.0.0.1");
        info.setServerPort(9527);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken("zyblue");
        loginResponse.setServerInfo(info);
        logger.info("loginResponse:{}", loginResponse);
        return new BaseResponse(200, "success", loginResponse);
    }
}
