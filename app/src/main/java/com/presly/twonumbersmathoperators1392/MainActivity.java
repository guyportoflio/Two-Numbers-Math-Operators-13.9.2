package com.presly.twonumbersmathoperators1392;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private int firstNumber, secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.firstNumberInput);
        editText2 = (EditText)findViewById(R.id.secondNumberInput);

        //prevent keyboard from jumping when onCreate starts
      this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.menu_options, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void menuAdd(MenuItem item) {
      try{
          String first = editText1.getText().toString();
          String second = editText2.getText().toString();
          firstNumber = Integer.parseInt(first);
          secondNumber = Integer.parseInt(second);
          int result = firstNumber + secondNumber;

          Toast.makeText(this, " " + result, Toast.LENGTH_LONG).show();
      }
      catch (NumberFormatException ex){
          Toast.makeText(this,"enter numbers you idiot!", Toast.LENGTH_LONG).show();
      }

    }

    public void menuSubtract(MenuItem item) {
    try{
        String first = editText1.getText().toString();
        String second = editText2.getText().toString();
        firstNumber = Integer.parseInt(first);
        secondNumber = Integer.parseInt(second);
        int result = firstNumber - secondNumber;

        Toast.makeText(this, " " + result, Toast.LENGTH_LONG).show();
    }
    catch (NumberFormatException ex){
        Toast.makeText(this,"enter numbers you idiot!", Toast.LENGTH_LONG).show();
    }

    }

    public void menuMultiply(MenuItem item) {
      try {
          String first = editText1.getText().toString();
          String second = editText2.getText().toString();
          firstNumber = Integer.parseInt(first);
          secondNumber = Integer.parseInt(second);
          int result = firstNumber * secondNumber;

          Toast.makeText(this, " " + result, Toast.LENGTH_LONG).show();
      }
      catch (NumberFormatException ex){
          Toast.makeText(this,"enter numbers you idiot!", Toast.LENGTH_LONG).show();
      }

    }

    public void menuDivision(MenuItem item) {
      try {
          String first = editText1.getText().toString();
          String second = editText2.getText().toString();
          firstNumber = Integer.parseInt(first);
          secondNumber = Integer.parseInt(second);
          double result = (double) firstNumber / (double) secondNumber;

          Toast.makeText(this, " " + result, Toast.LENGTH_LONG).show();
      }
      catch (NumberFormatException ex){
          Toast.makeText(this,"enter numbers you idiot!", Toast.LENGTH_LONG).show();
      }
    }

    public void menuPower(MenuItem item) {
      try {
          String first = editText1.getText().toString();
          String second = editText2.getText().toString();
          firstNumber = Integer.parseInt(first);
          secondNumber = Integer.parseInt(second);

          double result = Math.pow(firstNumber, secondNumber);
          Toast.makeText(this, " " + result, Toast.LENGTH_LONG).show();
      }
      catch (NumberFormatException ex){
          Toast.makeText(this,"enter numbers you idiot!", Toast.LENGTH_LONG).show();
      }
    }

}
