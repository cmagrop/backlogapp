package com.example.backlogapp.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductDAO {
    @Insert
    fun insertarProducto(product:ProductModel)

    @Update

    fun actualizarProducto(product:ProductModel)

    @Delete

    fun eliminarProducto(producto:ProductModel)

    @Query("select * from product ")
    fun leerTodosLosDatos(): LiveData<List<ProductModel>> //retornar una respuesta de tipo
    //LiveData<List<ProductModel>>

            /*
            public Dato leerTodosLosDatos();
            * */


}