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

public class MainActivity extends AppCompatActivity {
    LinearLayout Screen;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen=(LinearLayout) findViewById(R.id.Screen);
        btn=(Button)findViewById(R.id.btnActivity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.menuBlack) {
            Screen.setBackgroundColor(Color.BLACK);
        }
         if(id==R.id.menuWhite) {
            Screen.setBackgroundColor(Color.WHITE);
        }
        if(id==R.id.menuGray) {
            Screen.setBackgroundColor(Color.GRAY);
        }
        return true;
    }


    public void go(View view) {
        Intent t=new Intent(this,nextActivity.class);
        startActivity(t);
    }
}



