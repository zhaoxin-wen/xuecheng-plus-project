package com.xuecheng.base.execption;

import java.io.Serializable;

/**
 * @author wzw
 * @date 2023/4/10 22:32
 * @description 错误响应参数包装
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}