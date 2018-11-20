package com.example.lena.my_app_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.textView1);
        textView1.setText("Hello World!");

    }

    public void sendText(View view) {
        editText=findViewById(R.id.editText);
        textView1.setText(editText.getText());
    }
}
