package com.akbar.rumahadatuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.akbar.rumahadatuas.ModalData.Data;
import com.akbar.rumahadatuas.ModalData.ModelData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvdatarumahadar;
    private ArrayList<ModelData> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvdatarumahadar = findViewById(R.id.rv_rumah_adat);
        rvdatarumahadar.setHasFixedSize(true);
        data.addAll(Data.getDataRUmahAdat());
        readdata();
    }

    private void readdata(){
        rvdatarumahadar.setLayoutManager(new LinearLayoutManager(this));
        AdapterData adapterData = new AdapterData(data);
        rvdatarumahadar.setAdapter(adapterData);
    }
}