package android.tq.viewmodel;

import android.os.Bundle;
import android.tq.viewmodel.adapters.WaterFallAdapter;
import android.tq.viewmodel.fragments.FragmentsAdapter;
import android.tq.viewmodel.fragments.VideoFragment;
import android.tq.viewmodel.views.VerticalViewPager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class WaterfallActivity extends AppCompatActivity {


   RecyclerView recyclerview;
   WaterFallAdapter waterFallAdapter = null;
   List<String> datas = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grids);
        initData();
    }

    private void initData(){
        for (int i = 0;i<50;i++)
        {
            datas.add((i+1)+"");
        }
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(3,  StaggeredGridLayoutManager.VERTICAL));
        recyclerview.setAdapter(waterFallAdapter = new WaterFallAdapter(this,datas));

    }
}
