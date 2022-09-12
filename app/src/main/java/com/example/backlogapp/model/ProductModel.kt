package com.example.backlogapp.model



import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName="product")
data class ProductModel(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val nombre:String,
    val fechaDeRecepcion:String,
    val codigoProducto:Int,
    val stockMinimo:Int,
    val categoriaProducto:String,
    val precioUnitario:Int,
    val observaciones:String

): Parcelable