package app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class CardSecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String CLASSNAME = CardSecurityConfig.class.getName();
    private static final Logger LOG = LoggerFactory.getLogger(CLASSNAME);
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        LOG.trace("configure -- Entry");
        http.csrf().disable().authorizeRequests()
                .antMatchers("/api/card/Add").permitAll()
                .antMatchers("/api/card/GetAll").permitAll()
                .antMatchers("/info").permitAll()
                .antMatchers("/management/**").permitAll()
                .antMatchers("/health").permitAll()
                .antMatchers("/metrics").permitAll()
                .anyRequest().denyAll();
        LOG.trace("configure -- Exit");
    }

}
