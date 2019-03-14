package com.hy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date : 2019/3/14 16:18
 * @Author:hang.S
 * @Description:
 */
@Controller
public class TextController {
    @RequestMapping("text.do")
    public String text(){
        return "index.jsp";
    }
}
