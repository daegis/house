package cn.aegisa.house2.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/5/26 15:34
 */
@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @RequestMapping("/center")
    public String adminCenterPage() {
        return "admin/center";
    }

    @RequestMapping("/welcome")
    public String welcomePage() {
        return "admin/welcome";
    }
}
