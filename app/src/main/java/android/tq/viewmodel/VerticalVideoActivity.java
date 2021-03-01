package android.tq.viewmodel;

import android.os.Bundle;
import android.tq.viewmodel.fragments.FragmentsAdapter;
import android.tq.viewmodel.fragments.VideoFragment;
import android.tq.viewmodel.views.VerticalViewPager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class VerticalVideoActivity extends AppCompatActivity {

    List<String> urlList = new ArrayList<>();
    List<Fragment> fragments = new ArrayList<>();
    FragmentsAdapter fragmentsAdapter = null;
    VerticalViewPager viewpager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_videos);
        initData();
    }

    private void initData(){
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201805/100651/201805181532123423.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803151735198462.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803150923220770.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803150922255785.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803150920130302.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803141625005241.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803141624378522.mp4");
        urlList.add("http://chuangfen.oss-cn-hangzhou.aliyuncs.com/public/attachment/201803/100651/201803131546119319.mp4");
        for (int i = 0;i<urlList.size();i++)
        {
            VideoFragment videoFragment = new VideoFragment(VerticalVideoActivity.this,urlList.get(i));
            fragments.add(videoFragment);
        }
        fragmentsAdapter = new FragmentsAdapter(getSupportFragmentManager(),fragments);
        viewpager = findViewById(R.id.viewpager);
        viewpager.setAdapter(fragmentsAdapter);
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}
