package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    Login login;

    @BeforeTest
    public void setUp(){
        login = new Login();
    }

    @Test
    public void testIsLogin(){
        Login login = new Login();
        boolean actual = login.isLogin("admin", "password");
        Assert.assertTrue(actual);
    }
}
