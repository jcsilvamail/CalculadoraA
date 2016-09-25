package pt.ipca.calculadora;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button bAdd, bSub, bMul, bDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.editText1);
        ed2 = (EditText) findViewById(R.id.editText2);
        bAdd = (Button) findViewById(R.id.buttonAdd);
        bSub = (Button) findViewById(R.id.buttonSub);
        bMul = (Button) findViewById(R.id.buttonMul);
        bDiv = (Button) findViewById(R.id.buttonDiv);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ed1.getText().toString());
                double num2 = Double.parseDouble(ed2.getText().toString());
                double sum = num1 + num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Result");
                dialogo.setMessage("Result is " + sum);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ed1.getText().toString());
                double num2 = Double.parseDouble(ed2.getText().toString());
                double sub = num1 - num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Result");
                dialogo.setMessage("Result is " + sub);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ed1.getText().toString());
                double num2 = Double.parseDouble(ed2.getText().toString());
                double mul = num1 * num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Result");
                dialogo.setMessage("Result is " + mul);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ed1.getText().toString());
                double num2 = Double.parseDouble(ed2.getText().toString());
                double div=0;
                if (num2 != 0) div = num1 / num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Result");
                if (num2 !=0) dialogo.setMessage("Result is " + div);
                else dialogo.setMessage("Divide by zero exception!");
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}
