package org.anowls.spring.swanim.handler;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * <p>Title: swan-im</p>
 * <p>Description: 这里填写描述</p>
 * <p>Copyright: Copyright © 2017-2020 汉博德信息技术有限公司 All Rights Reserved</p>
 * <p>Company: http://www.hanboard.com</p>
 *
 * @author haopeisong
 * @date 2018-3-24
 */
public class SwanWebSocketHandler extends AbstractWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);
        System.out.println(session.getHandshakeHeaders());
        System.out.println(session.getAttributes());
        System.out.println(session.getPrincipal().getName());
        System.out.println(session.getUri());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
        try {
            super.handleTextMessage(session, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
        try {
            super.handleBinaryMessage(session, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void handlePongMessage(WebSocketSession session, PongMessage message) {
        try {
            super.handlePongMessage(session, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
