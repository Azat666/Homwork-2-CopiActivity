package com.example.student.copiactyvity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class copi extends AppCompatActivity {
   private   Button nextButton;
    private EditText editText;
     private TextView textView;
    private String maseige;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copi);
        nextButton = (Button) findViewById(R.id.nextButton);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.text_view);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(copi.this, SecondActivity.class);
                intent.putExtra("KAY",editText.getText().toString());
                startActivityForResult(intent,100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            if (requestCode == RESULT_OK && data != null ){
                Toast.makeText(copi.this,"55",Toast.LENGTH_LONG).show();
                maseige =data.getStringExtra("KAY");
                Toast.makeText(copi.this,maseige,Toast.LENGTH_LONG).show();
                textView.setText(maseige);
            }
        }
    }
}
