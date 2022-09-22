package com.example.backlogapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.backlogapp.R
import com.example.backlogapp.model.ProductModel
import com.example.backlogapp.model.ProductViewRep

class ActualizarActivity : AppCompatActivity(), AdapterView.OnItemClickListener,
    AdapterView.OnItemSelectedListener {

    var categorias = arrayOf<String>("Tecnología","Línea blanca","Deporte","Calzado","Otro")

    lateinit var oProductViewRep: ProductViewRep//objeto de ProductViewRep


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar)

        //llamar al id de nuestro Spinner y guardarlo en un objeto
        val spinner = findViewById<Spinner>(R.id.spinner_categoria)
        spinner.onItemSelectedListener=this
        //crear Adapter
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categorias)
        //esteblecer el adapter a cada uno de los items obtenidos desde categorias
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //esteblecer el ArrayAdapter en el Spinner, vamos colocar la data en el spinner
        spinner.adapter = adapter
        //obtener vistas de activity_ingreso
        var nombreProducto = findViewById<EditText>(R.id.ingreso_producto)
        var ingresoFecha = findViewById<EditText>(R.id.ingreso_fecha)
        var ingresoCodigoProducto = findViewById<EditText>(R.id.ingreso_codigo_producto)
        var ingresoStockMinimo = findViewById<EditText>(R.id.ingreso_stock_minimo)
        var ingresoPrecioUnitario = findViewById<EditText>(R.id.ingreso_precio_unitario)
        var ingresoObservaciones = findViewById<EditText>(R.id.ingreso_observaciones)
        //conversiones
        var nomProducto = nombreProducto.text.toString()
        var inFecha = ingresoFecha.text.toString()
        var inCodigoProducto = ingresoCodigoProducto.text.toString().toInt()
        var inStockMinimo = ingresoStockMinimo.text.toString().toInt()
        //pendiente Spinner
        var desplegableCategoria = spinner.selectedItem.toString()
        //sigue el codigo
        var inPrecioUnitario = ingresoPrecioUnitario.text.toString().toInt()
        var inObservaciones = ingresoObservaciones.text.toString()
        //llenar objeto producto
        var producto = ProductModel(0,nomProducto,inFecha,
            inCodigoProducto,inStockMinimo,desplegableCategoria,
            inPrecioUnitario,inObservaciones)

    }


    override fun onItemSelected(parent: AdapterView<*>,view: View,position:Int,id:Long) {
        Toast.makeText(applicationContext,categorias[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>) {

    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    fun actualizarProducto(product:ProductModel){

        oProductViewRep.actualizarProducto(product)
    }




    fun accederActualizar(view: View) {


    }
}