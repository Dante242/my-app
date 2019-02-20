package dante.notepad.com.appblockdenotas.Activities;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import dante.notepad.com.appblockdenotas.R;

public class MainActivity extends AppCompatActivity {

    //definimos el boton para abrir otra app
    Button botonopn;
    //widget .7
   android.support.v7.widget.Toolbar toolbar;
    //regla para trabajar con el toolbar: siempre hay que definirlo
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //nuevo
        botonopn=findViewById(R.id.button);
        botonopn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);
            }
        });

        //definimos el toolbar - 100% necesario
    toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        navigationView = (NavigationView) findViewById(R.id.navigationView);

    navigationView.setNavigationItemSelectedListener(
            new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    if(item.isChecked()) item.setChecked(false);
                    else item.setChecked(true);

                    //inicia con el menú oculto
                    drawerLayout.closeDrawers();

                    switch (item .getItemId()){
                         case R.id.prinicipal:

                             break;
                        case R.id.supermercado:
                            break;
                        case R.id.pendientes:
                             break;
                        case R.id.vacaciones:
                            break;
                    }
                    return false;
                }
            });


        ActionBarDrawerToggle actionBarDrawerToggle =
                new ActionBarDrawerToggle(this,drawerLayout, toolbar,R.string.open,R.string.close){
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        super.onDrawerOpened(drawerView);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        super.onDrawerClosed(drawerView);
                    }
                };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //action bar drawer - sincronizacion de estado?
        actionBarDrawerToggle.syncState();



    }
}





