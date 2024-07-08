package zank.udb.calculadorabasica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var number1: EditText
lateinit var number2: EditText
lateinit var enviar: Button
lateinit var resultado: TextView
lateinit var resta: TextView
lateinit var multiplicacion: TextView
lateinit var divicion: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById(R.id.numero1)
        number2 = findViewById(R.id.numero2)
        enviar = findViewById(R.id.btnEnviar)
        resultado = findViewById(R.id.resultado)
        resta = findViewById(R.id.resta)
        multiplicacion = findViewById(R.id.multiplicacion)
        divicion = findViewById(R.id.divicion)

        enviar.setOnClickListener {

            val num1 = number1.text.toString().toFloatOrNull() ?: 0f
            val num2 = number2.text.toString().toFloatOrNull() ?: 0f

            val suma = num1 + num2
            val restaResultado = num1 - num2
            val multiplicacionResultado = num1 * num2
            val divisionResultado =
                if (num2 != 0f)
                    num1 / num2 else "No se puede dividir por 0"

            resultado.text = "suma: $suma"
            resta.text = "resta: $restaResultado"
            multiplicacion.text = "multiplicacion: $multiplicacionResultado"
            divicion.text = "división: $divisionResultado"

        }
    }
}
