package com.example.backlogapp.repository

import androidx.lifecycle.LiveData
import com.example.backlogapp.model.ProductDAO
import com.example.backlogapp.model.ProductModel

class ProductRepository(val productDAO: ProductDAO) {


    val leerTodosLosDatos:LiveData<List<ProductModel>> = productDAO.leerTodosLosDatos()

    fun agregarProducto(product:ProductModel)
    {
        productDAO.insertarProducto(product)
    }

    fun actualizarProducto(product:ProductModel)
    {
        productDAO.actualizarProducto(product)

    }

    fun eliminarProducto(product:ProductModel)
    {
        productDAO.eliminarProducto(product)
    }


}


/*

class ProductRepository<ProductDAO productdao>{

 ProductRepository(ProductDAO product)
 {
    this.productdao = product;
 }

}



* */