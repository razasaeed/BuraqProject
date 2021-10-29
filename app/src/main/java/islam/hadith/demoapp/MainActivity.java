package islam.hadith.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOne; // declaration
    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne); // initialization
        btnTwo = findViewById(R.id.btnTwo);

        // click listener below
        btnOne.setOnClickListener(->{
            Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_SHORT).show();
        });

        btnTwo.setOnClickListener(->{
            Toast.makeText(MainActivity.this, "hello world two", Toast.LENGTH_SHORT).show();
        });

    }
}