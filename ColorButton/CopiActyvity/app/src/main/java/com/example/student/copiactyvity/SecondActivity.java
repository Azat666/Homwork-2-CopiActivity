package com.example.student.copiactyvity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = (EditText) findViewById(R.id.editText1);
        String go = getIntent().getExtras().getString("KEY");
        TextView textView = (TextView) findViewById(R.id.textSecond);
        textView.setText(go);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
       intent.putExtra("KAY",editText.getText().toString());
       setResult(RESULT_OK,intent);
       finish();
    }
}
