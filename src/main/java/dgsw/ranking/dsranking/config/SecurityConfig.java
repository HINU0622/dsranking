package dgsw.ranking.dsranking.config;

import dgsw.ranking.dsranking.security.DsRankingOAuth2UserService;
import dgsw.ranking.dsranking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final DsRankingOAuth2UserService oauth2Service;

    private final OAuth2AuthenticationSuccessHandler oAuth2AuthenticationSuccessHandler;

    private UserService userService;

    @Bean
    protected SecurityFilterChain config(HttpSecurity http) throws Exception {
        http.oauth2Login(oauth2 ->
                oauth2.successHandler(oAuth2AuthenticationSuccessHandler));
        return http.build();
    }

}
