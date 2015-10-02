package com.example.numero.numero;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void numero1(View view)
    {
        TextView num1=(TextView) findViewById(R.id.textView);
        num1.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero2(View view)
    {
        TextView num2=(TextView) findViewById(R.id.textView2);
        num2.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero3(View view)
    {
        TextView num3=(TextView) findViewById(R.id.textView3);
        num3.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero4(View view)
    {
        TextView num4=(TextView) findViewById(R.id.textView4);
        num4.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero5(View view)
    {
        TextView num5=(TextView) findViewById(R.id.textView5);
        num5.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero6(View view)
    {
        TextView num6=(TextView) findViewById(R.id.textView6);
        num6.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero7(View view)
    {
        TextView num7=(TextView) findViewById(R.id.textView7);
        num7.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero8(View view)
    {
        TextView num8=(TextView) findViewById(R.id.textView8);
        num8.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }

    public void numero9(View view)
    {
        TextView num9=(TextView) findViewById(R.id.textView9);
        num9.setVisibility(View.VISIBLE);
        //num1.setText("1");

        //Button boton1 = (Button) findViewById(R.id.button);
        //boton1.setVisibility(View.INVISIBLE);
    }
}
