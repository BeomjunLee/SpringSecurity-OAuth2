package com.oauth2.oauth2;

import com.oauth2.domain.Role;
import com.oauth2.service.CustomOAuth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()
            .and()
                .authorizeRequests()
                .antMatchers("/**", "/css/**", "/images/**", "/js/**").permitAll()
//                .antMatchers("/**").hasRole("USER")
                .anyRequest().authenticated()
            .and()
                .logout()
                .logoutSuccessUrl("/main")
            .and()
                .oauth2Login()  //OAuth2 로그인 기능에 대한 여러 설정의 진입점
                .defaultSuccessUrl("/main")
                .userInfoEndpoint() //OAuth2 로그인 성공 이후 사용자 정보를 가져올 때의 설정들을 담당
                .userService(customOAuth2UserService);
    }
}
