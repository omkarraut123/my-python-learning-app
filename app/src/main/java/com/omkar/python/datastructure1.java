package com.omkar.python;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class datastructure1 extends AppCompatActivity {
    private Bundle extras;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastructure1);
        webView = (WebView) findViewById(R.id.web_view4);
        extras = getIntent().getExtras();
        if (!extras.equals(null)) {

            String data = extras.getString("title");
            //  Toast.makeText(this,"data recevied",Toast.LENGTH_SHORT).show();
            String url = "file:///android_asset/datastructures/" + data + ".html";
            webView.loadUrl(url);
            WebSettings webSettings = webView.getSettings();

            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(true);
            webSettings.setJavaScriptEnabled(true);


        }

    }
}
