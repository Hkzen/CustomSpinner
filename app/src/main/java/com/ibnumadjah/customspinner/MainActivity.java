package com.ibnumadjah.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner1);

        List<String> negeraList = new ArrayList<>();
        negeraList.add("Albania");
        negeraList.add("Belgia");
        negeraList.add("Hungary");
        negeraList.add("Iran");
        negeraList.add("Slovenia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negeraList);
        spinner1.setAdapter(na);
    }
}