package com.yooou.yj.config;

import com.yooou.yj.enums.StatusEnum;
import com.yooou.yj.exceptions.YooouException;
import com.yooou.yj.response.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: WangYuJ
 * @Date 2018/11/7
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    /**
     * @Description: 全局异常捕获
     * @Param [ex]  
     * @Return void  
     */
    @ExceptionHandler(Exception.class)
    public Object exceptionHandler(Exception ex) {
        BaseResponse response = new BaseResponse();
        response.setCode(StatusEnum.FAIL.getCode());
        if (ex instanceof YooouException) {
            response.setMsg(ex.getMessage());
        } else {
            response.setMsg(StatusEnum.FAIL.getMsg());
        }
        return response;
    }
}
