package wc.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制层
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 10:51:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        //逻辑视图

        return "index";
    }

}
