package com.example.rmdhnshopemployeefinances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SlipGajiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slip_gaji);

        findViewById(R.id.btnWa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsApp();
            }
        });
    }

    private void openWhatsApp(){
        String phoneNumber = "62895422854995";
        String message = "Selamat pagi, maaf menganggu waktu bapak. Disini saya ingin mengambil gaji saya pak. Berikut bukti screenshotnya";
        Uri uri = Uri.parse("https://wa.me/" + phoneNumber + "?text=" + message);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }
}