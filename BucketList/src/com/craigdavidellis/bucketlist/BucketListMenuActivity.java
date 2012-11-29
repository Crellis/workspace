package com.craigdavidellis.bucketlist;

import android.os.Bundle;

public class BucketListMenuActivity extends BucketListActivity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
}
