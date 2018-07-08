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
		//ʹ��inflater���벼���ļ�
		//setContentView(R.layout.frag_gather);
		View view = inflater.inflate(R.layout.frag_gather, null);
		//initViews();
		//initEvents();
		//txtRecommendFrag=(TextView)view.findViewById(R.id.txt_re);
		
		txtRecommend = (TextView)view.findViewById(R.id.text_recommend);//��Ӧ�¼�
		txtTeaching = (TextView)view.findViewById(R.id.text_teaching);//��Ӧ�¼�
		txtHealth = (TextView)view.findViewById(R.id.text_health);
		
		recommendFrag = new RecommendFrag();
		teachingFrag = new TeachingFrag();
		healthFrag = new HealthFrag();
		
		fm=getFragmentManager();
		FragmentTransaction tran =fm.beginTransaction();
		tran.replace(R.id.container1, recommendFrag);//��ʼҳ����ʾ
		tran.commit();//�ύ����
	
		txtRecommend.setOnClickListener(this);
		txtTeaching.setOnClickListener(this);
		txtHealth.setOnClickListener(this);
		
		return view;
		//return super.onCreateView(inflater, container, savedInstanceState);
	}
	/*
	private void initViews()
	{
		txtRecommend = (TextView)findViewById(R.id.text_recommend);//��Ӧ�¼�
		txtTeaching = (TextView)findViewById(R.id.text_teaching);//��Ӧ�¼�
		txtHealth = (TextView)findViewById(R.id.text_teaching);
		//tvTeaching = (TextView)findViewById(R.id.text_teaching);//��Ӧ�¼�
		//tvHealth = (TextView)findViewById(R.id.text_health);//��Ӧ�¼�
		
		recommendFrag = new RecommendFrag();
		teachingFrag = new TeachingFrag();
		healthFrag = new HealthFrag();
		//teachingFrag = new TeachingFrag();
		//healthFrag = new HealthFrag();
		
		fm=getFragmentManager();
		FragmentTransaction tran =fm.beginTransaction();
		tran.replace(R.id.container, recommendFrag);//��ʼҳ����ʾ
		tran.commit();//�ύ����
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

