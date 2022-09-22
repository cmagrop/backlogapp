package com.example.backlogapp.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.backlogapp.R

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    lateinit var productModel:ArrayList<ProductModel>

    constructor(productModel:ArrayList<ProductModel>)
    {
        this.productModel=productModel

    }




    class ViewHolder:RecyclerView.ViewHolder{
        lateinit  var nombre:TextView
        lateinit  var fechaDeRecepcion:TextView
        lateinit  var codigoProducto:TextView
        lateinit  var stockMinimo:TextView
        lateinit  var categoriaProducto:TextView
        lateinit  var precioUnitario:TextView
        lateinit  var observaciones:TextView

        constructor(itemView: View) : super(itemView) {

            nombre = itemView.findViewById(R.id.nombre)
            fechaDeRecepcion = itemView.findViewById(R.id.fechaDeRecepcion)
            codigoProducto= itemView.findViewById(R.id.codigoProducto)
            stockMinimo =itemView.findViewById(R.id.stockMinimo)
            categoriaProducto= itemView.findViewById(R.id.categoriaProducto)
            precioUnitario = itemView.findViewById(R.id.precioUnitario)
            observaciones = itemView.findViewById(R.id.observaciones)



            /*Java
            ViewHolder(View itemView)
            {
                super(itemView)
            }

             */

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.listproductos,null,false)
        //return new ViewHolder(view)
        return ViewHolder(view)
    } //listo

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.setText(productModel.get(position).nombre)
        holder.fechaDeRecepcion.setText(productModel.get(position).fechaDeRecepcion)
        holder.codigoProducto.setText(productModel.get(position).codigoProducto)
        holder.stockMinimo.setText(productModel.get(position).stockMinimo)
        holder.categoriaProducto.setText(productModel.get(position).categoriaProducto)
        holder.precioUnitario.setText(productModel.get(position).precioUnitario)
        holder.observaciones.setText(productModel.get(position).observaciones)
    }

    override fun getItemCount(): Int {
        return productModel.size
    }//listo

}


/*

class ProductAdapter{


class ViewHolder{

}

}

* */