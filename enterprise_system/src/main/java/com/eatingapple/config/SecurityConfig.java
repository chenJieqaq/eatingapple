package com.eatingapple.config;

import com.eatingapple.filter.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * spring security配置
 * {@link EnableGlobalMethodSecurity } 如果想要启用spring方法级安全时，使用这个注解
 *
 * @author ruoyi
 */
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        httpSecurity
////                .authorizeRequests()
////                // 对于登录login 验证码captchaImage 允许匿名访问
////                .antMatchers("/api", "/hello/login").anonymous();
//        http.authorizeRequests()
//                .anyRequest().permitAll().and().logout().permitAll().and()
//                .csrf().disable();//配置不需要登录验证
//    }

    @Autowired
    JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //关闭csrf
                .csrf().disable()
                //不通过Session获取SecurityContext
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // 对于登录接口 允许匿名访问
                .antMatchers("/user/login").anonymous()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated();
        //把token校验过滤器添加到过滤器链中
//        http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);

    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
