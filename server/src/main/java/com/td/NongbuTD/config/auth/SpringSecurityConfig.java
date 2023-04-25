package com.td.NongbuTD.config.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@EnableWebSecurity
@Configuration
public class SpringSecurityConfig{
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("resources/**");
    }

//    @Bean
//    public void configure(HttpSecurity http) {
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http.csrf().disable()
//                .headers()
                /**
                 * yeoooo
                 * header는 http 요청이나 응답의 헤더에 추가할 수 있는 헤더.
                 * 주로
                 * XXS protection
                 * X-Frame_option
                 * content-security-polish
                 * strict-transport-security
                 * 를 설정하는데 사용
                 */
//                .and()
                .formLogin()
                .loginPage("/api/v1/login")
                .usernameParameter("id")
                .passwordParameter("pw")
                .and()
                .build();

    }

}
