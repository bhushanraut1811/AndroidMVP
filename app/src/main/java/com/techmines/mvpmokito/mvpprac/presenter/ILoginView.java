package com.techmines.mvpmokito.mvpprac.presenter;

/**
 * Created by vivekjain on 5/31/15.
 */
public interface ILoginView {

    //to get userName from UI
    String getUsername();

    //to show userName from UI
    void showUsernameError(int resId);

    //to get password from UI
    String getPassword();

    //to show password from UI
    void showPasswordError(int resId);

    void startMainActivity();

    void showLoginError(int resId);
}
