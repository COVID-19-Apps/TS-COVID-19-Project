package com.tscovid19project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.tscovid19project.Adapter.GridAdapter;

public class HealthCareActivity extends AppCompatActivity {


    private GridView Grid_View;

    String[] web = {
            "Isolation Centres",
            "Quarantine Centres"

    };
    int[] imageId = {
            R.drawable.healthcarecenters,
            R.drawable.healthcarecenters

    };

    private ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);
        Back = findViewById(R.id.toolbar_icon);

        Grid_View = findViewById(R.id.grid_view);
        GridAdapter adapter = new GridAdapter(HealthCareActivity.this, web, imageId);
        Grid_View.setAdapter(adapter);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Grid_View.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(HealthCareActivity.this, HealthCareListActivity.class);
                        intent0.putExtra("type", "ic");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent = new Intent(HealthCareActivity.this, HealthCareListActivity.class);
                        intent.putExtra("type", "qc");
                        startActivity(intent);
                        break;

                }

            }
        });


    }
}