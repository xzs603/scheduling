package org.javaboy.scheduling02.config;

import org.javaboy.scheduling02.model.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @Description: GlobalExpHandler
 * @Author: zhenshan.xu
 * @Date: 2022/2/14 9:18
 */
@RestControllerAdvice
public class GlobalExpHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public RespBean handleBusinessException(Exception e, HttpServletResponse response) {
        return RespBean.error(e.getMessage());
    }
}
