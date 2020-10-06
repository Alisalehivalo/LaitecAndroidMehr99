package ir.laitec.laitecandroidmehr99;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTag","in On Create!!!");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyTag","in On Start!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyTag","in On Resume!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyTag","in On Pause!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyTag","in On Stop!!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MyTag","in On ReStart!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyTag","in On Destroy!!!");
    }
}