package com.craigdavidellis.droid1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DroidActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_droid, menu);
        return true;
    }
}
