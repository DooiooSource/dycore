package com.dooioo.web.exception;

/**
 * 没有找到对应的资源异常
 * 抛出该异常会跳转到指定的页面（根据url参数）
 * 如果url未指定，默认会跳转/404请求
 *
 * User: kuang
 * Date: 12-8-25
 * Time: 下午8:56
 */
public class NotFoundException extends Exception {

    private String url;

    public NotFoundException(String message) {
        super(message);
        this.url = url;
    }

    public NotFoundException(String message, String url) {
        super(message);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
