package cn.aegisa.house2.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/5/20 15:23
 */
@Controller
public class AppErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @Autowired
    private ErrorAttributes errorAttributes;

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    /**
     * web页面异常处理拦截器
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    public ApiResponse error(HttpServletRequest request, HttpServletResponse response) {
        return ApiResponse.ofMessage(500, "系统错误");
    }


}
