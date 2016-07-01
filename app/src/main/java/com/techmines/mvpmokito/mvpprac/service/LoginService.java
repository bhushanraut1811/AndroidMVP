package com.techmines.mvpmokito.mvpprac.service;

public class LoginService {
  public boolean login(String username, String password) {
    return "abc123".equals(username) && "abc123".equals(password);
  }
}
