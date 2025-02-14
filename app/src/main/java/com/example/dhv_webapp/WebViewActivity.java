package com.example.dhv_webapp;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true); // Bật JavaScript
        webSettings.setAllowFileAccess(true); // Cho phép truy cập tệp
        webSettings.setAllowFileAccessFromFileURLs(true); // Cho phép WebView truy cập file từ URL nội bộ
        webSettings.setAllowUniversalAccessFromFileURLs(true); // Cần thiết nếu video không tải từ thư mục assets
        webSettings.setMediaPlaybackRequiresUserGesture(false); // Cho phép phát nhạc/video tự động

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient()); // Hỗ trợ media trong WebView

        webView.loadUrl("file:///android_asset/index.html"); // Tải trang HTML từ assets
    }
}