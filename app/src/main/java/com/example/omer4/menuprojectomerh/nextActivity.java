package com.example.omer4.menuprojectomerh;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class nextActivity extends AppCompatActivity {
    LinearLayout screen;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        screen = findViewById(R.id.Screen2);
        btn = findViewById(R.id.button2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 40, "red");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String title = item.getTitle().toString();
        int id = item.getItemId();
        if (id == R.id.menuBlack) {
            screen.setBackgroundColor(Color.BLACK);
        }
        if (id == R.id.menuWhite) {
            screen.setBackgroundColor(Color.WHITE);
        }
        if (id == R.id.menuGray) {
            screen.setBackgroundColor(Color.GRAY);
        }
        if (id == R.id.menuRed) {
            screen.setBackgroundColor(Color.RED);
        }
        if (title.equals("red")) {
            screen.setBackgroundColor(Color.RED);
        }
        return true;

}

    public void back(View view) {
        Intent t=new Intent(this,MainActivity.class);
        startActivity(t);
    }
}
