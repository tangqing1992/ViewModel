package android.tq.viewmodel.fragments;

import android.content.Context;
import android.os.Bundle;
import android.tq.viewmodel.R;
import android.tq.viewmodel.views.FullScreenVideoView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VideoFragment extends Fragment {

    String url = "";
    Context context = null;
    View view = null;
    FullScreenVideoView fullscrentvideo;
    TextView text_title;

    public VideoFragment(Context context, String url) {
        this.context = context;
        this.url = url;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.layout_videoitem, null);
            text_title = view.findViewById(R.id.text_title);
            text_title.setText(url);
        }
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);


        if (isVisibleToUser) {
            /*可见播放*/
        } else {
            /*不可见暂停*/
        }

    }

    @Override
    public void onResume() {

        super.onResume();


    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

}
