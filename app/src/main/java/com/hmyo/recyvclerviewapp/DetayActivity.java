package com.hmyo.recyvclerviewapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetayActivity extends AppCompatActivity {

    TextView dTitleTextView;
    TextView dDescriptionTextView;
    TextView dRatingTextView;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detay);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        extras = getIntent().getExtras();

        dTitleTextView = (TextView) findViewById(R.id.dTitleTextViewId);
        dDescriptionTextView = (TextView) findViewById(R.id.dDescriptionTextViewId);
        dRatingTextView = (TextView) findViewById(R.id.dImdbTextViewId);

        if(extras!=null) {
            dTitleTextView.setText(extras.getString("title"));
            dDescriptionTextView.setText(extras.getString("description"));
            dRatingTextView.setText(extras.getString("rating"));
        }




    }
}