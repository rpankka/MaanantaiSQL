package com.example.ttyporiuser.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static com.example.ttyporiuser.hello.R.id.tulos;

public class MainActivity extends AppCompatActivity {

    public final static String TAG="LaskukoneEsimerkki";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void summaLasku(View view) {
        Log.d(TAG, "Laske-nappulaa painettiin");
        EditText editTextNumero1 =(EditText)findViewById(R.id.numero1);
        EditText editTextNumero2 =(EditText)findViewById(R.id.numero2);
        EditText editTextTulos =(EditText)findViewById(R.id.tulos);

        //luetaan arvo ruudusta
        String arvo1=editTextNumero1.getText().toString();

        //muunnetaan arvo kokonaisluvuksi
        int luku1=Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku2=Integer.parseInt(editTextNumero2.getText().toString());

        Log.d(TAG, "numero1="+luku1+ " ja numero2="+luku2);
        int tulos=luku1+luku2;

        //kirjoitetaan luku1 näyttöön
        editTextTulos.setText(""+tulos);
            }

    public void vahLasku(View view) {
        Log.d(TAG, "Laske-nappulaa painettiin");
        EditText editTextNumero1 =(EditText)findViewById(R.id.numero3);
        EditText editTextNumero2 =(EditText)findViewById(R.id.numero4);
        EditText editTextTulos =(EditText)findViewById(R.id.tulos);

        //luetaan arvo ruudusta
        String arvo1=editTextNumero1.getText().toString();

        //muunnetaan arvo kokonaisluvuksi
        int luku1=Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku2=Integer.parseInt(editTextNumero2.getText().toString());

        Log.d(TAG, "numero3="+luku1+ " ja numero4="+luku2);
        int tulos2=luku1+luku2;

        //kirjoitetaan luku1 näyttöön
        editTextTulos.setText(""+tulos2);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() -metodia kutsuttiin");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() -metodia kutsuttiin");
            }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() -metodia kutsuttiin");
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume() -metodia kutsuttiin");

    }
}
