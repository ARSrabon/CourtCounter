package com.cyborn.msrabon.courtcounter;

// Project : Court Counter (Android Study jam 2015 : Assignment-2)
// Author : Md. Abu Raihan Srabon
// Email : M.arsrabon@gmail.com


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView score_team_A;
    TextView score_team_B;

    Button A_point_3;
    Button A_point_2;
    Button A_point_f;
    Button B_point_3;
    Button B_point_2;
    Button B_point_f;
    Button Rset;

    int A_count = 0;
    int B_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score_team_A = (TextView) findViewById(R.id.txt_a);
        score_team_B = (TextView) findViewById(R.id.txt_b);

        A_point_3 = (Button) findViewById(R.id.btn_a_3);
        A_point_2 = (Button) findViewById(R.id.btn_a_2);
        A_point_f = (Button) findViewById(R.id.btn_a_f);
        B_point_3 = (Button) findViewById(R.id.btn_b_3);
        B_point_2 = (Button) findViewById(R.id.btn_b_2);
        B_point_f = (Button) findViewById(R.id.btn_b_f);
        Rset = (Button) findViewById(R.id.btn_rset);

        A_point_3.setOnClickListener(this);
        A_point_2.setOnClickListener(this);
        A_point_f.setOnClickListener(this);
        B_point_3.setOnClickListener(this);
        B_point_2.setOnClickListener(this);
        B_point_f.setOnClickListener(this);
        Rset.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == A_point_3) {
            A_count = A_count + 3;
            score_team_A.setText(String.valueOf(A_count));
        } else if (v == A_point_2) {
            A_count = A_count + 2;
            score_team_A.setText(String.valueOf(A_count));
        } else if (v == A_point_f) {
            Toast.makeText(MainActivity.this, "A team Free Throw", Toast.LENGTH_SHORT).show();
        } else if (v == B_point_3) {
            B_count = B_count + 3;
            score_team_B.setText(String.valueOf(B_count));
        } else if (v == B_point_2) {
            B_count = B_count + 2;
            score_team_B.setText(String.valueOf(B_count));
        } else if (v == B_point_f) {
            Toast.makeText(MainActivity.this, "B team Free Throw", Toast.LENGTH_SHORT).show();
        } else if (v == Rset) {
            A_count = 0;
            B_count = 0;
            score_team_A.setText(String.valueOf(A_count));
            score_team_B.setText(String.valueOf(B_count));
        }
    }
}
