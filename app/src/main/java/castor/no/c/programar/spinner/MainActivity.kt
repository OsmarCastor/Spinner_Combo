package castor.no.c.programar.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var txtTitulo:TextView
    lateinit var txtDescripcion:TextView
    lateinit var spLenguajes:Spinner
    val lenguajes = arrayOf("JAVA","VB","C#","C++","PHP","C","RUBY","SWIFT")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtTitulo = findViewById(R.id.txtTitulo)
        txtDescripcion = findViewById(R.id.txtDescripcion)
        spLenguajes = findViewById(R.id.spLenguajes)

        //Agregando datos al Spinner
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item, lenguajes)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        ///Hacerlo con un when
        Log.e("SPINNER","Seleccionaste krnal")
        val lenguaje:String = lenguajes[p2]
        txtTitulo.text = lenguaje
        txtDescripcion.text = when(p2){
            0 -> {"Java es un lenguaje de programación que usa minecraft"}
            1 -> {"Visual Basic es un lenguaje de programación de microsoft"}
            2 -> {"C# es un lenguaje de programación orientado a objetos"}
            3 -> {"C++ es como C pero con más"}
            4 -> {"PHP se usa para paginas"}
            5 -> {"C es para ancianos"}
            6 -> {"Ruby es el lenguaje de la chaviza"}
            7 -> {"SWIFT O.o?"}
            else -> {"Descripción"}
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}