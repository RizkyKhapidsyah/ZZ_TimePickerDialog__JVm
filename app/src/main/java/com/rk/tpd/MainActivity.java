package com.rk.tpd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText ET_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_1_IDJAVA = findViewById(R.id.ET_1_IDXML);
        ET_1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar Kalender = Calendar.getInstance();
                int Jam = Kalender.get(Calendar.HOUR_OF_DAY);
                int Menit = Kalender.get(Calendar.MINUTE);

                TimePickerDialog TPD;
                TPD = new TimePickerDialog(getApplicationContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        ET_1_IDJAVA.setText(hourOfDay + " : " + minute);
                    }
                }, Jam, Menit, true);

                TPD.setTitle("Pilih Waktu..");
                TPD.show();
            }
        });

    }
}
