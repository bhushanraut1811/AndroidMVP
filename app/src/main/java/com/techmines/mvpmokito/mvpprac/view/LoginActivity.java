package com.techmines.mvpmokito.mvpprac.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.techmines.mvpmokito.R;
import com.techmines.mvpmokito.mvpprac.presenter.ILoginView;
import com.techmines.mvpmokito.mvpprac.presenter.LoginPresenter;

import static android.widget.Toast.LENGTH_SHORT;


public class LoginActivity extends AppCompatActivity implements ILoginView {
    private EditText usernameView;
    private EditText passwordView;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameView = (EditText) findViewById(R.id.username);
        passwordView = (EditText) findViewById(R.id.password);

        mPresenter = new LoginPresenter(this);
    }


    public void onLoginClicked(View view) {
        mPresenter.onLoginClicked();
    }

    @Override
    public String getUsername() {
        return usernameView.getText().toString();
    }

    @Override
    public void showUsernameError(int resId) {
        usernameView.setError(getString(resId));
    }

    @Override
    public String getPassword() {
        return passwordView.getText().toString();
    }

    @Override
    public void showPasswordError(int resId) {
        passwordView.setError(getString(resId));
    }

    @Override
    public void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void showLoginError(int resId) {
        Toast.makeText(this, getString(resId), LENGTH_SHORT).show();
    }
}
