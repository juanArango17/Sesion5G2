package com.programacionmoviles.juanpabloarangoa.sesion5g2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            ft = fm.beginTransaction();
            switch (item.getItemId()) {
                case R.id.mSuperman:
                    SupermanFragment fSuperman = new SupermanFragment();
                    ft.replace(R.id.frame1,fSuperman).commit();
                    return true;
                case R.id.mBatman:
                    BatmanFragment fBatman = new BatmanFragment();
                    ft.replace(R.id.frame1,fBatman).commit();
                    return true;
                case R.id.mFlash:
                    FlashFragment fFlash = new FlashFragment();
                    ft.replace(R.id.frame1,fFlash).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        SupermanFragment fSuperman = new SupermanFragment();
        ft.add(R.id.frame1,fSuperman).commit();
    }

}
