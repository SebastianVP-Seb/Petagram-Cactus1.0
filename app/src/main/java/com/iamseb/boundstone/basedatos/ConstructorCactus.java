package com.iamseb.boundstone.basedatos;

import android.content.Context;

import com.iamseb.boundstone.Cactus;
import com.iamseb.boundstone.R;

import java.util.ArrayList;

//ESTA CLASE SERÁ EL INTERACTOR ENTRE LA CLASE QUE CONSULTA LA BASE DE DATOS
//ESTA ES LA CLASE CLAVE PARA LA BASE
public class ConstructorCactus {

    //DECLARAR CONSTRUCTOR
    Context context;
    public ConstructorCactus(Context context){
        this.context=context;
    }

    //PARA OBTENER LOS DATOS, ÉSTOS DEBEN VENIR EN UN ARRAYLIST
    //PARA CREARLO SE PONE PRIMERO LO QUE DEVUELVE EL MÉTODO Y LUEGO CÓMO SE LLAMA
    public ArrayList<Cactus> obtenerDatos(){
        ArrayList<Cactus> cactus = new ArrayList<Cactus>();
        cactus.add(new Cactus("Mary",R.drawable.mary,3,5));
        cactus.add(new Cactus("Sebastian",R.drawable.sebastian,5,4));
        cactus.add(new Cactus("Maricela",R.drawable.maricela,7,75));
        cactus.add(new Cactus("Argelia",R.drawable.argelia,4,19));
        cactus.add(new Cactus("Argel", R.drawable.argel,2,30));
        //     cactus.add(new Cactus("Yonahandy",R.drawable.yonahandy,3));
       // cactus.add(new Cactus("Moira",R.drawable.moira,3,13));

        return cactus;
    }
}
