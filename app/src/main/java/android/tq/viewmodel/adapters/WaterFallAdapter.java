package android.tq.viewmodel.adapters;

import android.app.Activity;
import android.content.Context;
import android.tq.viewmodel.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WaterFallAdapter  extends RecyclerView.Adapter<WaterFallAdapter.BaseViewHolder> {
    private List<String> datalists = new ArrayList<>();
    List<Integer> heights = new ArrayList<>();
    Context context = null;

    public WaterFallAdapter(Context context,List<String> datalists){
        this.datalists = datalists;
        this.context = context;
        this.datalists = datalists;

        //通过获取随机数存入集合
        for (int i = 0; i < datalists.size(); i++) {
            int x = new Random().nextInt(200) + 400;
            heights.add(x);
        }


    }

    @Override
    public WaterFallAdapter.BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_griditem, parent, false));
    }
    @Override
    public void onBindViewHolder(WaterFallAdapter.BaseViewHolder holder, int position) {
        //获取控件原本高度，拿随机数集合赋值
        ViewGroup.LayoutParams layoutParams = holder.layout_params.getLayoutParams();
        layoutParams.height = heights.get(position);
        layoutParams.width = context.getResources().getDisplayMetrics().widthPixels/3;
        holder.layout_params.setLayoutParams(layoutParams);
        holder.text_position.setText(datalists.get(position));


    }
    @Override
    public int getItemCount() {
        return datalists.size();
    }
    public class BaseViewHolder extends RecyclerView.ViewHolder {

        private ImageView image_img;
        RelativeLayout layout_params;
        TextView text_position;
        public BaseViewHolder(View view) {
            super(view);
            image_img = (ImageView) view.findViewById(R.id.image_img);
            text_position = (TextView) view.findViewById(R.id.text_position);
            layout_params = (RelativeLayout) view.findViewById(R.id.layout_params);

        }

    }

}
