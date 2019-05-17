package pos.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements HandlerInterceptor {
	  /**
     * Controller业务方法执行之前执行
     * @return 返回值决定请求是放行还是拦截
     * false:表示拦截
     * true:表示放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("UserInterceptor.preHandle()");
        HttpSession session=request.getSession();
        String userid=(String) session.getAttribute("userid");
        if(userid==null||"".equals(userid)){
            response.sendRedirect(request.getContextPath()+"/user/login.do");
            return false;
        }
        return true;
    }
    /**
     * 此方法在Controller的业务方法执行之后执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("UserInterceptor.postHandle()");
    }
    /**
     * 此方法在Controller的业务方法执行结束并且视图解析完成后执行
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("UserInterceptor.afterCompletion()");
    }

}
