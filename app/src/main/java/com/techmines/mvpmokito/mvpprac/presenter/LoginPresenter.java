package com.techmines.mvpmokito.mvpprac.presenter;


import com.techmines.mvpmokito.R;
import com.techmines.mvpmokito.mvpprac.model.User;
import com.techmines.mvpmokito.mvpprac.service.LoginService;

/**
 * Created by vivekjain on 5/31/15.
 */
public class LoginPresenter {
    private ILoginView view;
    private User mUser;
    private LoginService mLoginService;


    public LoginPresenter(ILoginView view) {
        this.view = view;
        mLoginService = new LoginService();
    }

    public void onLoginClicked() {
        String username = view.getUsername();
        if (username.isEmpty()) {
            view.showUsernameError(R.string.username_error);
            return;
        }
        String password = view.getPassword();
        if (password.isEmpty()) {
            view.showPasswordError(R.string.password_error);
            return;
        }

        if (mLoginService.login(username, password)) {
            view.startMainActivity();
            return;
        } else {

            view.showLoginError(R.string.login_failed);
        }
    }
}
