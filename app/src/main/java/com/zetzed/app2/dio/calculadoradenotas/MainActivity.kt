package com.zetzed.app2.dio.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = Calcular
        val resultado = Resultado

        btCalcular.setOnClickListener{

            val Nota1 = Integer.parseInt(Nota1.text.toString())
            val Nota2 = Integer.parseInt(Nota2.text.toString())
            val Media = (Nota1 + Nota2) / 2
            val Faltas = Integer.parseInt(Faltas.text.toString())

            if (Media >=6 && Faltas <=10){

                Resultado.setText("Aluno foi APROVADO!" + "\n" + "Nota Final: " + Media + "\n" + "Faltas: " + Faltas)
                Resultado.setTextColor(Color.GREEN)
            }
            else{
                Resultado.setText("Aluno foi REPROVADO!" + "\n" + "Nota Final: " + Media + "\n" + "Faltas: " + Faltas)
                Resultado.setTextColor(Color.RED)
            }

        }

    }
}