package com.baizhi.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {
    /**
     * loadUserByUsername  读取用户信息(根据用户名)
     *
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // UserDetails : 封装用户数据的接口
        User user = null;
        if(s.equals("admin")){
            user = new User("admin","admin", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN"));
        }
        return user;
    }
}
