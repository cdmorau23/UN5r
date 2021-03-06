package com.UN5.market.config;

import com.UN5.market.domain.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private AdRepository adRepository;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth= new DaoAuthenticationProvider();
        auth.setUserDetailsService(adRepository);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Override
    protected void  configure(HttpSecurity http) throws Exception{

        http.authorizeRequests().antMatchers(
                "/register.html",
                "/principal.html",
                "/clienteMenu.html",
                "/carrito.html",
                "/restauranteAgregarBuscador.html",
                "/js/**",
                "/css/**",
                "/assets/**",
                "/webfonts/**"
        ).permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login.html").permitAll().defaultSuccessUrl("/carrito.html").and()
                .logout().invalidateHttpSession(true).clearAuthentication(true).logoutRequestMatcher(new
                AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login.html?logout").permitAll();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.authenticationProvider(authenticationProvider());
    }
}
