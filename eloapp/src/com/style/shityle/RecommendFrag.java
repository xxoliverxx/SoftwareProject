package com.style.shityle;

import android.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;


public class RecommendFrag extends Fragment{
	TextView txtRecommendFrag;
	public WebView WebView1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//ʹ��inflater���벼���ļ�
		View view = inflater.inflate(R.layout.frag_recommend, null);
		//txtRecommendFrag=(TextView)view.findViewById(R.id.txt_re);
		WebView1 = (WebView)view.findViewById(R.id.webView);
		init(WebView1);
		WebView1.onResume();
		
		return view;
		//return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	public void init(WebView WebView1)
	{
		
		WebView1.loadUrl("http://39.106.71.125:8080/shityletest/recommend");
		WebSettings settings = WebView1.getSettings();
		settings.setJavaScriptEnabled(true);
    
		WebView1.setWebViewClient(new WebViewClient(){
    		@Override
    		public boolean shouldOverrideUrlLoading(WebView view, String url) {
    			view.loadUrl(url);
    			return true;
    		}
    	});
    }
	/*
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if ((keyCode == KEYCODE_BACK) && WebView1.canGoBack()) { 
	        WebView1.goBack();
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}
	*/
}