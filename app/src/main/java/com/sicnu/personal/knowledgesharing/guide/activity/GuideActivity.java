package com.sicnu.personal.knowledgesharing.guide.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;

import com.sicnu.personal.knowledgesharing.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/3/5 0005.
 */

public class GuideActivity extends Activity {

    @BindView(R.id.guide_main_viewpage)
    ViewPager guideMainViewpage;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_main);
        ButterKnife.bind(this);
    }
}
