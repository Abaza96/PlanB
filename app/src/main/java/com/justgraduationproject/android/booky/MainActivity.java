package com.justgraduationproject.android.booky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning Address

        view = (WebView) findViewById(R.id.WebView);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://www.github.com");

        //Web Settings

        WebSettings settings = view.getSettings();
        settings.setJavaScriptEnabled(true);
    }


        //Back Button Method Overriding

    @Override
    public void onBackPressed()
    {
        if(view.canGoBack())
            {

                view.goBack();

            }
        else
            {

                super.onBackPressed();

            }
    }
}
