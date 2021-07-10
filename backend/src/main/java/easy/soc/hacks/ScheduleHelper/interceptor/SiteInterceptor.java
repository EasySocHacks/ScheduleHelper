package easy.soc.hacks.ScheduleHelper.interceptor;

import easy.soc.hacks.ScheduleHelper.util.constant.GlobalConstants;
import easy.soc.hacks.ScheduleHelper.util.constant.impl.GlobalConstants_ENG;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;

@Component
public class SiteInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HttpSession httpSession = request.getSession();

            trySetDefaults(httpSession);
        }

        return true;
    }

    private void trySetDefaults(HttpSession httpSession) {
        tryInitAttribute("language", "ENG", httpSession);

        GlobalConstants globalConstants;

        try {
            Class<?> clazz = Class.forName("easy.soc.hacks.ScheduleHelper.utils.constants.implementations.GlobalConstants_" +
                    httpSession.getAttribute("language"));

            globalConstants = (GlobalConstants) clazz.getConstructors()[0].newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            httpSession.setAttribute("language", "ENG");
            globalConstants = new GlobalConstants_ENG();
        }

        globalConstants.init(httpSession);
    }

    private boolean tryInitAttribute(String attribute, Object value, HttpSession httpSession) {
        if (httpSession.getAttribute(attribute) == null) {
            httpSession.setAttribute(attribute, value);

            return true;
        }

        return false;
    }
}
