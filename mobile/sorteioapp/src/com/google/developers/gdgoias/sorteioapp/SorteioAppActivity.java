package com.google.developers.gdgoias.sorteioapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SorteioAppActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorteio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sorteio, menu);
        return true;
    }
}
