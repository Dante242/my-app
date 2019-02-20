package dante.notepad.com.appblockdenotas.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import dante.notepad.com.appblockdenotas.R;

public class SplashActivity extends Activity {

    //METODO PARA EL TIEMPO DE CARGA            //LUEGO SE DEFINE LA DURACION
    private static final long SPLASH_SCREEN_DELAY = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //HILO DEL EVENTO TAREA
        //TIMERTASK TEMPORIZADOR PARA LAS TAREAS
        //NO SE PUEDE TRABAJAR EN EL MISMO HILO VARIAS COSAS
        //TASK PERMITE TRABAJAR VARIAS COSAS
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };
        //METODO TIMER PARA EL SPLASH
        Timer timer = new Timer();
        timer.schedule(timerTask,SPLASH_SCREEN_DELAY);
    }
}
