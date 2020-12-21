package com.iamseb.boundstone;

import android.content.Context;

import com.iamseb.boundstone.basedatos.ConstructorCactus;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{
    //IMPLEMENTAR LA INTERFAZ, SOLICITA CREAR LOS MÉTODOS
//AGREGAR CONSTRUCTOR
    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    //OBJETO DEL CONSTRUCTOR
    private ConstructorCactus constructorCactus;
    private ArrayList<Cactus> cactus;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView=iRecyclerViewFragmentView;
        this.context=context;
        obtenerCactusBaseDatos();
    }

    @Override
    public void obtenerCactusBaseDatos() {
        constructorCactus=new ConstructorCactus(context);
       cactus=constructorCactus.obtenerDatos();
       mostrarContactosRecyclerView();
    }

    @Override
    public void mostrarContactosRecyclerView() {
        iRecyclerViewFragmentView.inicializarAdaptadorDelRecyclerView(iRecyclerViewFragmentView.crearAdaptador(cactus));
        //DEFINIR LA FORMA EN QUE SE MOSTRARÁ LA LISTA, SI NO NO SE MOSTRARÁ
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
