package com.omkar.python;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DataActivity extends AppCompatActivity {
    private static final String TAG = "DataActivity";
    private Bundle extras;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        webView = (WebView) findViewById(R.id.web_view);
        extras = getIntent().getExtras();
        if (!extras.equals(null)) {

            String data = extras.getString("title");
            //  Toast.makeText(this,"data recevied",Toast.LENGTH_SHORT).show();
            String url = "file:///android_asset/" + data + ".html";
            webView.loadUrl(url);
            WebSettings webSettings = webView.getSettings();

            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(true);
            webSettings.setJavaScriptEnabled(true);


        }

    }
}
