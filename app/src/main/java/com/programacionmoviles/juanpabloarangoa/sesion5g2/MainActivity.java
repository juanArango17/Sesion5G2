package com.programacionmoviles.juanpabloarangoa.sesion5g2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        SupermanFragment fSuperman = new SupermanFragment();
        ft.add(android.R.id.content,fSuperman).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idFragment = item.getItemId();

        ft = fm.beginTransaction();

        switch (idFragment){
            case R.id.mSuperman:
                SupermanFragment fSuperman = new SupermanFragment();
                ft.replace(android.R.id.content,fSuperman).commit();
                break;
            case R.id.mBatman:
                BatmanFragment fBatman = new BatmanFragment();
                ft.replace(android.R.id.content,fBatman).commit();
                break;
            case R.id.mFlash:
                FlashFragment fFlash = new FlashFragment();
                ft.replace(android.R.id.content,fFlash).commit();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
