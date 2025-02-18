package com.acme.modres;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyClassTest {

    @Test
    public void testWelcomeMessage() throws Exception {
        WelcomeServlet servlet = new WelcomeServlet();
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        
        servlet.doGet(request, response);
        
        String content = response.getContentAsString();
        assertTrue(content.contains(" Enjoy!"), "응답에 'Enjoy!' 메시지가 포함되어야 합니다");
    }
}