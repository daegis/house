package cn.aegisa.house2.web.controller;

import cn.aegisa.house2.base.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/5/20 11:32
 */
@Slf4j
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        log.info("接收到前台前台发送过来的请求");
        model.addAttribute("name", "乌拉拉");
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public ApiResponse test() {
        return ApiResponse.ofMessage(200, "成功了");
    }

    @RequestMapping("/404")
    public String notFound() {
        return "404";
    }

    @RequestMapping("/403")
    public String notAnthea() {
        return "403";
    }

    @RequestMapping("/500")
    public String internalError() {
        return "500";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }
}


