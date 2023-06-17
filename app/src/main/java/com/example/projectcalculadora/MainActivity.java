package com.example.projectcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declarar botones y text por id
        EditText mensajeNumero1 = findViewById(R.id.editTextNumero1);
        EditText mensajeNumero2 = findViewById(R.id.editTextNumero2);
        Button botonSumar = findViewById(R.id.buttonSumar);
        Button botonRestar = findViewById(R.id.buttonRestar);
        Button botonMultiplicar = findViewById(R.id.buttonMultiplicar);
        Button botonDividir = findViewById(R.id.buttonDividir);
        Button botonSalir = findViewById(R.id.buttonSalir);
        TextView resultado = findViewById(R.id.calculoResultado);

        //Le da comportamientoa los botones al hacer el click
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mensajeNumero1.getText().toString().trim().isEmpty() || mensajeNumero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),  "Falta ingresar números " , Toast.LENGTH_SHORT).show();
                    return;
                }
                String num1 = mensajeNumero1.getText().toString();
                String num2 = mensajeNumero2.getText().toString();
                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);
                double sumar = numero1 + numero2;
                resultado.setText("Resultado " + sumar);
                Toast.makeText(getBaseContext(), "Se realizó una Suma ", Toast.LENGTH_LONG).show();
            }
        });
        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mensajeNumero1.getText().toString().trim().isEmpty() || mensajeNumero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),  "Falta ingresar números " , Toast.LENGTH_SHORT).show();
                    return;
                }
                String num1 = mensajeNumero1.getText().toString();
                String num2 = mensajeNumero2.getText().toString();
                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);
                double restar = numero1 - numero2;
                resultado.setText("Resultado " + restar);
                Toast.makeText(getBaseContext(), "Se realizó una Resta ", Toast.LENGTH_LONG).show();
            }
        });
        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mensajeNumero1.getText().toString().trim().isEmpty() || mensajeNumero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),  "Falta ingresar números " , Toast.LENGTH_SHORT).show();
                    return;
                }
                String num1 = mensajeNumero1.getText().toString();
                String num2 = mensajeNumero2.getText().toString();
                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);
                double multiplicar = numero1 * numero2;
                resultado.setText("Resultado " + multiplicar);
                Toast.makeText(getBaseContext(), "Se realizó una Multiplicación ", Toast.LENGTH_LONG).show();
            }
        });
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mensajeNumero1.getText().toString().trim().isEmpty() || mensajeNumero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),  "Falta ingresar números " , Toast.LENGTH_SHORT).show();
                    return;
                }
                if(Double.parseDouble(mensajeNumero2.getText().toString()) == 0){
                    Toast.makeText(getBaseContext(),  "Debe ingresar un número distinto a 0 en el divisor " , Toast.LENGTH_SHORT).show();
                    return;
                }
                String num1 = mensajeNumero1.getText().toString();
                String num2 = mensajeNumero2.getText().toString();
                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);
                double dividir = numero1 / numero2;
                resultado.setText("Resultado " + dividir);
                Toast.makeText(getBaseContext(), "Se realizó una División ", Toast.LENGTH_LONG).show();
            }
        });
        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}