package com.vidya.testingdemo.login;

public class LoginService {
  public boolean login(String username, String password) {
    return "vidya".equals(username) && "jejurkar".equals(password);
  }
}
