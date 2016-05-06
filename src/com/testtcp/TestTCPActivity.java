package com.testtcp;

import android.app.Activity;
import android.os.Bundle;

public class TestTCPActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Thread cThread = new Thread(new TCPClient());
        
        cThread.start();
    }
}