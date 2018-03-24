package org.anowls.spring.swanim.config;

import org.anowls.spring.swanim.handler.SwanWebSocketHandler;
import org.anowls.spring.swanim.handshake.handler.OAuth2HandshakeHandler;
import org.anowls.spring.swanim.interceptor.TokenHandshakeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * <p>Title: edu-cloud-network-learning</p>
 * <p>Description: [Swan-Im]-WebSocket Settings</p>
 * <p>Copyright: Copyright © 2017-2020 汉博德信息技术有限公司 All Rights Reserved</p>
 * <p>Company: http://www.hanboard.com</p>
 *
 * @author haopeisong
 * @date 2018/1/22
 */
@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebMvcConfigurer, WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(swanWebSocketHandler(), "socket/{userId}")
            .addInterceptors(tokenHandshakeInterceptor()).setHandshakeHandler(oauth2HandshakeHandler()).setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler swanWebSocketHandler() {
        return new SwanWebSocketHandler();
    }

    @Bean
    public TokenHandshakeInterceptor tokenHandshakeInterceptor() {
        return new TokenHandshakeInterceptor();
    }

    @Bean
    public OAuth2HandshakeHandler oauth2HandshakeHandler() {
        return new OAuth2HandshakeHandler();
    }

}