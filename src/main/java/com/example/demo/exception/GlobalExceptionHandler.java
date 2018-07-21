package com.example.demo.exception;


import com.example.demo.result.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Describe
 * @Author Corey
 * @Date 2018/7/4.
 */
@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {

        if (ex instanceof MissingServletRequestParameterException) {
            return new ResponseResult(400, ex);
        }
        if (ex instanceof NoPermissions) {

            LOGGER.error("=======" + ex.getMessage() + "=======");
            return new ResponseResult(401, "sorry，无权限！");

        }

//        if (ex instanceof DuplicateKeyException) {
//            LOGGER.error("=======违反主键约束：主键重复插入=======");
//            return new ResponseResult(400, "主键重复插入！");
//        }

        /**
         * 未知异常
         */
        LOGGER.error(ex.toString());
        return new ResponseResult(500, ex.getMessage());

    }

}

