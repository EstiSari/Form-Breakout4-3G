package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        //province
        final Spinner province = (Spinner) findViewById(R.id.parentProvince);
        ArrayAdapter<CharSequence> adaptere = ArrayAdapter.createFromResource(this,
                R.array.province, android.R.layout.simple_spinner_item);
        adaptere.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        province.setAdapter(adaptere);
        //city
        final Spinner city = (Spinner) findViewById(R.id.parentsCity);
        ArrayAdapter<CharSequence> adapterf = ArrayAdapter.createFromResource(this,
                R.array.city, android.R.layout.simple_spinner_item);
        adapterf.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(adapterf);
    }
}