package com.jssh.crm.core.framework.context;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by S on 2018/4/18
 * 获取系统上下文路径
 */
public class BaseController {
    /**
     * 获取上下文路径
     * 绑定至域对象
     * @param request
     */
    @ModelAttribute
    public void preMethod(HttpServletRequest request){
        request.setAttribute("ctx",request.getContextPath());
    }
}
