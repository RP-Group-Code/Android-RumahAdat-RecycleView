package com.akbar.rumahadatuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private TextView nama, tentang;
    private ImageView url;
    private String title, keterangan, gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = findViewById(R.id.nama);
        tentang = findViewById(R.id.tentang);
        url = findViewById(R.id.gambar);

        Intent intent = getIntent();
        title = intent.getStringExtra("nama");
        keterangan = intent.getStringExtra("tentang");
        gambar = intent.getStringExtra("gambar");

        nama.setText(title);
        tentang.setText(keterangan);
        Glide.with(this).load(gambar).into(url);
    }
}