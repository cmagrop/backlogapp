package com.example.backlogapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.backlogapp.model.ProductDAO
import com.example.backlogapp.model.ProductModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(
    entities = [ProductModel::class],
    version = 1,
    exportSchema = true
)

//es un tipo de clase que no puede crear objetos de si misma
//sólo permitirá crear métodos abstractos: métodos sin cuerpo
abstract class BacklogDatabase : RoomDatabase()  {

     abstract fun productDao():ProductDAO
     companion object
     {
         @Volatile
         var INSTANCE:BacklogDatabase?=null
         @OptIn(InternalCoroutinesApi::class)
         fun obtenerBaseDeDatos(context: Context):BacklogDatabase
         {
            val tempINSTANCE= INSTANCE
             if(tempINSTANCE!=null)
             {
                 return tempINSTANCE
             }

             synchronized(this)
             {
                 val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BacklogDatabase::class.java,
                    "backlog_database"
                 ).build()
                 INSTANCE=instance

                 return instance
             }
         }


     }

     

}

/*

public class Pelota

 {
    public void main(String...)
     {
       mostrar();
      }

     public static void mostrar()
      {

       }

 }


public ProductDAO productDao();


abstract class BacklogDatabase extends RoomDatabase
 {

 }

* */



