package com.vidya.testingdemo;

import com.vidya.testingdemo.login.LoginService;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);


    }

    @Test
    public void login_isSuccessfull() {

        LoginService loginService = new LoginService();
        loginService.login("vidya","jejurkar");
        assertTrue(loginService.login("vidya","jejurkar"));
    }

    @Test
    public void incorrectUsername() {

        LoginService loginService = new LoginService();
        loginService.login("vidya","jejurkar");
        assertFalse(loginService.login("Vidya","jejurkar"));
    }

    @Test
    public void incorrectPassword() {

        LoginService loginService = new LoginService();
        loginService.login("vidya","jejurkar");
        assertFalse("sorry please check your password",loginService.login("vidya","Jejurkar"));
    }

}