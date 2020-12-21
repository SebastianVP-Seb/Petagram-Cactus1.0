package com.iamseb.boundstone;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {
    //(1)SE GENERARÁ UN MÉTODO PARA ESTABLECER LA FORMA EN LA QUE SERÁ PRESENTADO EL RECYCLERVIEW
    //ESTABA EN EL MAINACTIVITY
    public void generarLinearLayoutVertical();

    //ESTE DEVOLVERÁ UN CACTUS ADAPTADOR
    public CactusAdaptador crearAdaptador(ArrayList<Cactus> cacti);

    public void inicializarAdaptadorDelRecyclerView(CactusAdaptador adaptador);
}
