package android.tq.viewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bnt_vertical,bnt_recy,bnt_pickerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnt_vertical = findViewById(R.id.bnt_vertical);
        bnt_vertical.setOnClickListener(onClickListener);
        bnt_recy = findViewById(R.id.bnt_recy);
        bnt_recy.setOnClickListener(onClickListener);
        bnt_pickerView = findViewById(R.id.bnt_pickerView);
        bnt_pickerView.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id==R.id.bnt_vertical)
            {
                startActivity(new Intent(MainActivity.this,VerticalVideoActivity.class));
            }
            if (id ==R.id.bnt_recy)
                startActivity(new Intent(MainActivity.this,RecyclerVerticalVideosActivity.class));
            if (id ==R.id.bnt_pickerView)
                startActivity(new Intent(MainActivity.this,PickerViewActivity.class));

        }
    };
}