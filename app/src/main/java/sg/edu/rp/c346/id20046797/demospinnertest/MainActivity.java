package sg.edu.rp.c346.id20046797.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spinner);
        tvDisplay = findViewById(R.id.textView);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        tvDisplay.setText("Yes is Selected.");
                        Toast.makeText(MainActivity.this, "Yes was selected.\nSelected Spinner", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        tvDisplay.setText("No is Selected.");
                        Toast.makeText(MainActivity.this, "No was selected.\nSelected Spinner", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Nothing is Selected.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}