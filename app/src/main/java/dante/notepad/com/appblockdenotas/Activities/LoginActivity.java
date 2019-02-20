package dante.notepad.com.appblockdenotas.Activities;
//Vamos a crear el login
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//IMPORTAMOS EL R QUE ANTES LO ENCONTRABA YA QUE CAMBIAMOS DE LOS ACTIVITIES DE PAQUETE
import dante.notepad.com.appblockdenotas.R;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //opcion para insertar un dato predefinido
        //esta preferencia se mantiene ya para siempre :)
        SharedPreferences   sharedPreferences = getSharedPreferences("usuarios",Context.MODE_PRIVATE); //tiee que ser en modo privado para que ningun otra app pueda jalar la info
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("usuario","daniel");
        editor.putString("password","123");
        //commint para que grabe todooo!!
        editor.commit();


        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        login = (Button) findViewById(R.id.login);
        register= (Button) findViewById(R.id.registrar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                SharedPreferences preferences = getSharedPreferences("usuarios",Context.MODE_PRIVATE);
                //aqui vemos si el usuario existe.
                if(user.equals(preferences.getString("usuario","x"))){
                    if(pass.equals(preferences.getString("password","y"))) {
                        Intent intent = new Intent (LoginActivity.this,MainActivity.class);
                            startActivity (intent);


                    } else{
                            Toast.makeText(LoginActivity.this, "Clave incorrecta", Toast.LENGTH_SHORT).show();

                    }

                }else{
                    //toast manda el mensaeje
                    Toast.makeText(LoginActivity.this,"Usario incorrecto", Toast.LENGTH_LONG).show();

                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    }
