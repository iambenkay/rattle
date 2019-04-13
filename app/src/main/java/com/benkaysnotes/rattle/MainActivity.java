package com.benkaysnotes.rattle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
        Toolbar actionBar = findViewById(R.id.main_toolbar);
        setSupportActionBar(actionBar);

        if(getSupportFragmentManager().findFragmentById(R.id.content) == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content, new FeedsFragment()).commit();
        }

        BottomNavigationView bottom_nav = findViewById(R.id.bottom_nav);
        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.feeds:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content, new FeedsFragment()).commit();
                        break;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content, new SearchFragment()).commit();
                        break;
                    case R.id.discover:
                        break;
                    case R.id.notifications:
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        bottom_nav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.feeds:
                        break;
                    case R.id.search:
                        break;
                    case R.id.notifications:
                        break;
                    case R.id.discover:
                        break;
                    default:
                        break;
                }
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        final DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        actionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        switch(item.getItemId()){
            case R.id.profile:
                Intent in = new Intent(this, ProfileActivity.class);
                startActivity(in);
                break;
            default:
                break;
        }
        return true;
    }
}
