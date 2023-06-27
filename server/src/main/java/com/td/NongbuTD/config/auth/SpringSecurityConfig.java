package com.td.NongbuTD.config.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
public class SpringSecurityConfig{

    private final JwtTokenProvider jwtTokenProvider;

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("resources/**","/pmftd/api/v1/**");

    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CustomAuthenticationProvider customAuthenticationProvider() {
        return new CustomAuthenticationProvider(bCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .formLogin()
                .disable()
                .authorizeRequests((authz) -> authz.anyRequest().permitAll())
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.csrf().disable()
////                .headers()
//
//                /**
//                 * yeoooo
//                 * header는 http 요청이나 응답의 헤더에 추가할 수 있는 헤더.
//                 * 주로
//                 * XXS protection
//                 * X-Frame_option
//                 * content-security-polish
//                 * strict-transport-security
//                 * 를 설정하는데 사용
//                 */
////                .and()
////                .formLogin()
//
//                .authorizeRequests()
//                .antMatchers("/test")
//                .authenticated()
//                .and()
//                /**
//                 * @Author yeoooo
//                 * 관리자 페이지용 form login
//                 */
//                .formLogin()
//                .loginPage("/pmftd/management/")
//                .usernameParameter("id")
//                .passwordParameter("pw")
//                .loginPage("/login")
//                .loginProcessingUrl("/pmftd/login/action")
//                .defaultSuccessUrl("/")
//                .and()
////                .sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
////                .maximumSessions(3)
//                .authorizeRequests()
//                .anyRequest()
//                .permitAll()
//                .and()
//                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider),
//                        UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("logout"))
//                .invalidateHttpSession(true)
//                ;
//
//        return http.build();
//
//    }

}
