/**
 * 验证服务器实现
 *
 * @author syp007
 * @create 2018-01-05 16:27.
 */

package com.etp.auth.service;

import org.springframework.stereotype.Service;

@Service("authService")
public class AuthServiceImpl implements AuthService {
    public boolean getSuccess() {
        return false;
    }
}
