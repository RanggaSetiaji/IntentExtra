package com.thonie.intentextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calling(View view) {
        String no = "088881818567";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", no, null));
        startActivity(panggil);
    }

    public void BukaSpada (View view){
        String url = "https://spada.teknokrat.ac.id";
        Intent spada = new Intent (Intent.ACTION_VIEW);
        spada.setData(Uri.parse(url));
        startActivity(spada);
    }

    public void sendData (View view){
        EditText editext = findViewById(R.id.usermessage);
        String message = editext.getText().toString();

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }
}