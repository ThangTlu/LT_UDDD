package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan211SecondActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_second);
        tv1=findViewById(R.id.tuan211tv1);
        //don du lieu
        Intent i1 = getIntent();
        //dỡ hangf
        String chuoi1 = i1.getExtras().getString("so1");
        String chuoi2 = i1.getExtras().getString("so2");
        //---------
        float so1 = Float.parseFloat(chuoi1);//chuyen sang so
        float so2 = Float.parseFloat(chuoi2);
        float tong = so1 +so2;
        //hiển thị kết quả
        tv1.setText(String.valueOf(tong));

    }
}