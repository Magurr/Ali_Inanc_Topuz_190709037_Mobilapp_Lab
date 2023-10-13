package aliinanctopuz.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    Button btnArrayAdapter;
    Button btnCustomAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArrayAdapter = (Button) findViewById(R.id.btnArrayAdapter);
        btnCustomAdapter = (Button) findViewById(R.id.btnCustomAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });
        btnCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}