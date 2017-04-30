//package org.ryanstrong;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * Created by ryanstrong on 4/26/17.
// */
//
////TODO MAKE WORK WITH BCRYPT
//
//@Configuration //tags the class as a source of bean definitions for the application context
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .antMatchers("/","/home","/add","/user/add",
//                        "/time/add","/time/start", "/time/end").permitAll()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
////            .antMatcher("")
//
//            .logout()
//                .permitAll();
//    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder)throws Exception{
//        auth
//            .inMemoryAuthentication().passwordEncoder(passwordEncoder)
//                .withUser("user").password("password").roles("USER")
//                    ;
//
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
