package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //faculty
        final Spinner faculty = (Spinner) findViewById(R.id.faculty);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.faculty, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(adapter);
        //major
        final Spinner major = (Spinner) findViewById(R.id.major);
        ArrayAdapter<CharSequence> adapterb = ArrayAdapter.createFromResource(this,
                R.array.major, android.R.layout.simple_spinner_item);
        adapterb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        major.setAdapter(adapterb);
        //status
        final Spinner status = (Spinner) findViewById(R.id.status);
        ArrayAdapter<CharSequence> adapterc = ArrayAdapter.createFromResource(this,
                R.array.status, android.R.layout.simple_spinner_item);
        adapterc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        status.setAdapter(adapterc);
        //religion
        final Spinner religion = (Spinner) findViewById(R.id.religion);
        ArrayAdapter<CharSequence> adapterd = ArrayAdapter.createFromResource(this,
                R.array.religion, android.R.layout.simple_spinner_item);
        adapterd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        religion.setAdapter(adapterd);
        //province
        final Spinner province = (Spinner) findViewById(R.id.province);
        ArrayAdapter<CharSequence> adaptere = ArrayAdapter.createFromResource(this,
                R.array.province, android.R.layout.simple_spinner_item);
        adaptere.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        province.setAdapter(adaptere);
        //city
        final Spinner city = (Spinner) findViewById(R.id.city);
        ArrayAdapter<CharSequence> adapterf = ArrayAdapter.createFromResource(this,
                R.array.city, android.R.layout.simple_spinner_item);
        adapterf.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(adapterf);






    }
}