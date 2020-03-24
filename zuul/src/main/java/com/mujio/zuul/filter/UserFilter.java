package com.mujio.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 可以通过不同的filter继承ZuulFilter来实现前置后置等方法
 * FilterConstants.PRE_TYPE请求被路由前调用
 * FilterConstants.POST_TYPE在ROUTE和ERROR后调用
 * FilterConstants.ROUTE_TYPE请求时调用
 * FilterConstants.ERROR_TYPE请求出现错误时调用
 */
@Component
public class UserFilter extends ZuulFilter{

    // 请求被路由前调用
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    //数值越大优先级越靠后
    @Override
    public int filterOrder() {
        return 0;
    }

    //是否进行过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //具体的过滤规则实现
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest req = RequestContext.getCurrentContext().getRequest();
        String token = req.getParameter("token");
        if (StringUtils.isEmpty(token)){
            RequestContext.getCurrentContext().setSendZuulResponse(false);//不进行路由
            RequestContext.getCurrentContext().setResponseStatusCode(200);
            RequestContext.getCurrentContext().setResponseBody("{\"error\":\"invalid token\"}");
        }
        return null;
    }
}