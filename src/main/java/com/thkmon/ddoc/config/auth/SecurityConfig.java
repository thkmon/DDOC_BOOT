/*
package com.thkmon.ddoc.config.auth;

import com.thkmon.ddoc.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity // Spring Security 설정들을 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.csrf().disable().headers().frameOptions().disable() : h2-console 화면을 사용하기 위해 해당 옵션들을 disable 한다.
        http.csrf().disable().headers().frameOptions().disable()
                .and()
                // authorizeRequests : URL별 권한 관리를 설정하는 옵션의 시작점. authorizeRequests 가 선언되어야만 antMatchers 옵션을 사용가능
                .authorizeRequests().antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**", "/profile", "/game/**").permitAll()
                // antMatchers : 권한관리 대상을 지정하는 옵션입니다. URL, HTTP 메소드별로 관리가 가능
                //               "/" 등 지정된 URL들은 permitAll() 옵션을 통해 전체 열람 권한을 부여함
                //               "/api/vi/**" 주소를 가진 API는 USER 권한을 가진 사람들만 가능하도록 처리
                .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                // anyRequest : 설정된 값들 이외 나머지 URL들을 나타냅니다.
                .anyRequest().authenticated()
                .and()
                .logout().logoutSuccessUrl("/")
                .and()
                .oauth2Login().userInfoEndpoint()
                .userService(customOAuth2UserService);
    }
}
*/