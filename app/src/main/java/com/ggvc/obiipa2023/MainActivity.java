package com.ggvc.obiipa2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //VARIABLES GLOBALES QUE REPRESENTAN SUS EQUIVALENTES DEL FRONTEND
    EditText edNum1,edNum2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //GUARDAR LAS INSTANCIAS DE ESTADOS DEL CICLO DE VIDA DE UNA ACTIVIDAD
        super.onCreate(savedInstanceState);
        //RELACIONANDO LA ACTIVIDAD(BACKEND) CON UN LAYOUT(FRONTEND)
        setContentView(R.layout.activity_main);
        //COMUNICANDO LAS VARIABLES DEL BACKEND CON LOS
        // OBJETOS LÓGICOS EN EL FRONTEND
        edNum1=findViewById(R.id.txtNum1);
        edNum2=findViewById(R.id.txtNum2);
        tvResultado=findViewById(R.id.lblResultado);
    }

    //MÉTODO DE SUMA (VIEW HACE REFERENCIA A LA VISTA DEL FRONTEND)
    public void calcularSuma(View v){
        //ALMACENANDO EN VARIABLES LOS VALORES DE CADA ELEMENTO
        double num1=Double.parseDouble(edNum1.getText().toString());
        int num2=Integer.parseInt(edNum2.getText().toString());
        double resultado=num1+num2;
        tvResultado.setText(resultado+"");

    }
}