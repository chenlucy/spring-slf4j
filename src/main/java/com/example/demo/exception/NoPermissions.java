package com.example.demo.exception;

/**
 * @Describe
 * @Author Corey
 * @Date 2018/7/4.
 */
public class NoPermissions extends Exception {

    private static final long serialVersionUID = 2713900188102123466L;

    public NoPermissions(String message) {
        super(message);
    }
}
