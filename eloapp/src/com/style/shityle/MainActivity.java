package com.style.shityle;


import com.style.shityle.GatherFrag;
import com.style.shityle.MapFrag;
//import com.style.shityle.TeachingFrag;
//import com.style.shityle.HealthFrag;
import com.style.shityle.R;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	TextView tvGather;
	TextView tvMap;
	//TextView tvTeaching;
	//TextView tvHealth;
	FragmentManager fm;
	
	GatherFrag gatherFrag;
	MapFrag mapFrag;
	//TeachingFrag teachingFrag;
	//HealthFrag healthFrag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏

		setContentView(R.layout.activity_main);
		initViews();
		initEvent();
	}
	private void initViews()
	{
		tvGather = (TextView)findViewById(R.id.text_gather);//响应事件
		tvMap = (TextView)findViewById(R.id.text_map);//响应事件
		//tvTeaching = (TextView)findViewById(R.id.text_teaching);//响应事件
		//tvHealth = (TextView)findViewById(R.id.text_health);//响应事件
		
		gatherFrag = new GatherFrag();
		mapFrag = new MapFrag();
		//teachingFrag = new TeachingFrag();
		//healthFrag = new HealthFrag();
		
		fm=getFragmentManager();
		FragmentTransaction tran =fm.beginTransaction();
		tran.replace(R.id.container, gatherFrag);//初始页面显示
		tran.commit();//提交事务
	}
	private void initEvent()
	{
		tvGather.setOnClickListener(this);
		tvMap.setOnClickListener(this);
		//tvTeaching.setOnClickListener(this);
		//tvHealth.setOnClickListener(this);
	}
	
	public void onClick(View v)
	{
		FragmentTransaction tran =fm.beginTransaction();
		if(v==tvGather)
		{
			tran.replace(R.id.container, gatherFrag);
		}
		else if(v==tvMap)
		{
			tran.replace(R.id.container, mapFrag);
		}
		/*
		else if(v==tvTeaching)
		{
			tran.replace(R.id.container, teachingFrag);
		}
		else if(v == tvHealth)
		{
			tran.replace(R.id.container, healthFrag);
		}
		*/
		tran.commit();//提交事务
	}
	
}
