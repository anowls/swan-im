package org.anowls.spring.swanim.handshake.handler;

import java.security.Principal;
import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

/**
 * <p>Title: swan-im</p>
 * <p>Description: 这里填写描述</p>
 * <p>Copyright: Copyright © 2017-2020 汉博德信息技术有限公司 All Rights Reserved</p>
 * <p>Company: http://www.hanboard.com</p>
 *
 * @author haopeisong
 * @date 2018-3-24
 */
public class OAuth2HandshakeHandler extends DefaultHandshakeHandler {

    @Override
    protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
        super.determineUser(request, wsHandler, attributes);
        System.out.println("===Principal===");

        return new Principal() {
            /**
             * Returns the name of this principal.
             *
             * @return the name of this principal.
             */
            @Override
            public String getName() {
                return "admin";
            }
        };
    }
}
