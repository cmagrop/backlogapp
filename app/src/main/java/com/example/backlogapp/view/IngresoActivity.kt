package com.example.backlogapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.backlogapp.R

class IngresoActivity : AppCompatActivity(),AdapterView.OnItemClickListener,
    AdapterView.OnItemSelectedListener {

    var categorias = arrayOf<String>("Tecnología","Línea blanca","Deporte","Calzado","Otro")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)
        //llamar al id de nuestro Spinner y guardarlo en un objeto
        val spinner = findViewById<Spinner>(R.id.spinner_categoria)
        spinner.onItemSelectedListener=this
        //crear Adapter
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categorias)
        //esteblecer el adapter a cada uno de los items obtenidos desde categorias
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //esteblecer el ArrayAdapter en el Spinner, vamos colocar la data en el spinner
        spinner.adapter = adapter

    }

    override fun onItemSelected(parent: AdapterView<*>,view: View,position:Int,id:Long) {
        Toast.makeText(applicationContext,categorias[position],Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>) {

    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }


}

/*

public class Turista extends Persona{

}

class Turista:Persona{

}

public class Control implements Volante,Boton
{

}

class Control : Volante,Boton
{

}


super()

parent: AdapterView


 */