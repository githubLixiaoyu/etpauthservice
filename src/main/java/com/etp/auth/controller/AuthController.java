/**
 * 验证控制器
 *
 * @author syp007
 * @create 2018-01-05 16:06.
 */

package com.etp.auth.controller;

import com.etp.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping("/auth")
    @ResponseBody
    public boolean  auth()
    {
        return true;
    }
}
