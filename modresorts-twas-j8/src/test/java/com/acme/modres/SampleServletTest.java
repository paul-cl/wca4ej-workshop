package com.acme.modres;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class SampleServletTest {

    @Mock
    HttpServletRequest httpServletRequest;

    @Mock
    HttpServletResponse httpServletResponse;

    WelcomeServlet welcomeServlet;

    @Test
    public void testdoGet_WpNK() throws ServletException, IOException {
        welcomeServlet = new WelcomeServlet();

        // Mock the response object
        PrintWriter printWriter = mock(PrintWriter.class);
        when(httpServletResponse.getWriter()).thenReturn(printWriter);

        // Call the doGet method
        welcomeServlet.doGet(httpServletRequest, httpServletResponse);

        // Verify the response
        verify(printWriter).println(" Enjoy!");
    }

  
}
