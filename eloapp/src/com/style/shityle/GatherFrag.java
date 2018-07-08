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
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;

public class GatherFrag extends Fragment implements OnClickListener{
	TextView txtRecommend;
	TextView txtTeaching;
	TextView txtHealth;
	
	RecommendFrag recommendFrag;
	TeachingFrag teachingFrag;
	HealthFrag healthFrag;
	
	FragmentManager fm;
	//public WebView WebView1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//使用inflater引入布局文件
		//setContentView(R.layout.frag_gather);
		View view = inflater.inflate(R.layout.frag_gather, null);
		//initViews();
		//initEvents();
		//txtRecommendFrag=(TextView)view.findViewById(R.id.txt_re);
		
		txtRecommend = (TextView)view.findViewById(R.id.text_recommend);//响应事件
		txtTeaching = (TextView)view.findViewById(R.id.text_teaching);//响应事件
		txtHealth = (TextView)view.findViewById(R.id.text_health);
		
		recommendFrag = new RecommendFrag();
		teachingFrag = new TeachingFrag();
		healthFrag = new HealthFrag();
		
		fm=getFragmentManager();
		FragmentTransaction tran =fm.beginTransaction();
		tran.replace(R.id.container1, recommendFrag);//初始页面显示
		tran.commit();//提交事务
	
		txtRecommend.setOnClickListener(this);
		txtTeaching.setOnClickListener(this);
		txtHealth.setOnClickListener(this);
		
		return view;
		//return super.onCreateView(inflater, container, savedInstanceState);
	}
	/*
	private void initViews()
	{
		txtRecommend = (TextView)findViewById(R.id.text_recommend);//响应事件
		txtTeaching = (TextView)findViewById(R.id.text_teaching);//响应事件
		txtHealth = (TextView)findViewById(R.id.text_teaching);
		//tvTeaching = (TextView)findViewById(R.id.text_teaching);//响应事件
		//tvHealth = (TextView)findViewById(R.id.text_health);//响应事件
		
		recommendFrag = new RecommendFrag();
		teachingFrag = new TeachingFrag();
		healthFrag = new HealthFrag();
		//teachingFrag = new TeachingFrag();
		//healthFrag = new HealthFrag();
		
		fm=getFragmentManager();
		FragmentTransaction tran =fm.beginTransaction();
		tran.replace(R.id.container, recommendFrag);//初始页面显示
		tran.commit();//提交事务
	}
	private void initEvents()
	{
		txtRecommend.setOnClickListener(this);
		txtTeaching.setOnClickListener(this);
		txtHealth.setOnClickListener(this);
	}
	*/
	public void onClick(View v)
	{
		FragmentTransaction tran =fm.beginTransaction();
		if(v==txtRecommend)
		{
			tran.replace(R.id.container1, recommendFrag);
		}
		else if(v==txtTeaching)
		{
			tran.replace(R.id.container1, teachingFrag);
		}
		else if(v==txtHealth)
		{
			tran.replace(R.id.container1, healthFrag);
		}
		tran.commit();
	}
	
	
}

