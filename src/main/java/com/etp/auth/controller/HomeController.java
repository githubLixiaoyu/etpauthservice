/**
 * home
 *
 * @author syp007
 * @create 2018-01-05 13:18.
 */

package com.etp.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/index")
    public String index()
    {
        return "home";
    }
}
