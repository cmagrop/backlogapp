package com.example.backlogapp.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.backlogapp.database.BacklogDatabase
import com.example.backlogapp.repository.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewRep(application: Application):AndroidViewModel(application) {

    val leerTodosLosDatos: LiveData<List<ProductModel>> = TODO()
    private val repository:ProductRepository
    init
    {
        val productDAO = BacklogDatabase.obtenerBaseDeDatos(application).productDao()
        repository = ProductRepository(productDAO) //creando un objeto personalizado
        leerTodosLosDatos = repository.leerTodosLosDatos
            /*

             ProductRepository repository = new ProductRepository(productDAO);
            * */
    }

    fun agregarProducto(product:ProductModel)
    {
        viewModelScope.launch(Dispatchers.IO) {

            repository.agregarProducto(product)

        }

    }

    fun actualizarProducto(product: ProductModel)
    {

        viewModelScope.launch(Dispatchers.IO) {

            repository.actualizarProducto(product)
        }

    }

    fun eliminarProducto(product: ProductModel)
    {

        viewModelScope.launch(Dispatchers.IO) {

            repository.eliminarProducto(product)
        }

    }




}