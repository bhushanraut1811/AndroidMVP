package com.techmines.mvpmokito.mvpprac.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.techmines.mvpmokito.R;


/**
 * Activity which display UI but all business logic is handles by presenter class,it implements
 * an IView Interface which has necessary methods to update UI.
 */
public class MainActivity extends AppCompatActivity {


    //UI components


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

