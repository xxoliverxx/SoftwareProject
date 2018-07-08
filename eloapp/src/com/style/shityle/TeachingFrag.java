package com.style.shityle;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class TeachingFrag extends Fragment{
	TextView txtTeachingFrag;
	WebView WebView1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//使用inflater引入布局文件
		View view = inflater.inflate(R.layout.frag_teaching, null);
		//txtTeachingFrag=(TextView)view.findViewById(R.id.txt_te);
		WebView1 = (WebView)view.findViewById(R.id.webView);
		init(WebView1);
		WebView1.onResume();
		return view;
		//return super.onCreateView(inflater, container, savedInstanceState);
	}
	public void init(WebView WebView1)
	{
		
		WebView1.loadUrl("http://39.106.71.125:8080/shityletest/teaching");
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
}
