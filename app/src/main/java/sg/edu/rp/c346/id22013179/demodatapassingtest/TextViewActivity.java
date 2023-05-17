package sg.edu.rp.c346.id22013179.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        tvAnswer2 = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value",99.99);
        tvAnswer2.setText("Double value received is: " + value);

    }
}
