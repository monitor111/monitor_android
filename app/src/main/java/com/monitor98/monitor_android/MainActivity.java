package com.monitor98.monitor_android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTelegram = findViewById(R.id.btn_tlg);
        Button btnFacebook = findViewById(R.id.btn_fb);
        Button btnYoutube = findViewById(R.id.btn_yt);

        // Устанавливаем обработчик событий для кнопки Telegram
        btnTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ваши действия при нажатии на кнопку Telegram
                // Например, открытие Telegram
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.telegram.org/k/"));
                startActivity(intent);
            }
        });

        // Устанавливаем обработчик событий для кнопки Facebook
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ваши действия при нажатии на кнопку Facebook
                // Например, открытие Facebook
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100041708588501"));
                startActivity(intent);
            }
        });

        // Устанавливаем обработчик событий для кнопки YouTube
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ваши действия при нажатии на кнопку YouTube
                // Например, открытие YouTube
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCB8fJdGj_XAdmDCn_uUz76w"));
                startActivity(intent);
            }
        });
    }
}
