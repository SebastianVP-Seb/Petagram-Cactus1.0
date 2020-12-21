package com.iamseb.boundstone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


//NOTA: EL RECYCLER VIEW QUE ESTÁ EN EL MAIN ACTIVITY.XML, HAY QUE CORTARLO Y PEGARLO EN EL fragment_recyclerview.xml
//SE PEGA DENTRO DEL MÉTODO onCreateView

//(1) INIDICAR DE DÓNDE HEREDA ESTA CLASE, VERIFICAR EL SOPORTE DEL FRAGMENT (POR SI HAY ERRORES)
public class RecyclerviewFragment extends Fragment implements IRecyclerViewFragmentView{
//(*)PARA EL RECYCLERVIEW
    ArrayList<Cactus> cactus;
    RecyclerView RecyclerViewMain;
    IRecyclerViewFragmentPresenter presenter;

    //(2) SOBRE-ESCRIBIR EL MÉTODO onCreateView
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //ESTE MÉTODO INFLARÁ EL LAYOUT CON EL FRAGMENT
        //LA LÍNEA DE ARRIBA EQUIVALE AL SETCONTENT VIEW DE UN ACTIVITY, SE SETEA LA VISTA CON EL ARCHIVO JAVA

//ESTE RECYCLERVIEW SE TRAJO DEL MAINACTIVITY
        View view=inflater.inflate(R.layout.fragment_recyclerview,container,false);
//(*)AGREGAR view ANTES DE find

        RecyclerViewMain=(RecyclerView)view.findViewById(R.id.ReciclerViewMain);

        //MANDAR A LLAMAR AL PRESENTER
        presenter=new RecyclerViewFragmentPresenter(this,getContext());

        //CAMBIAR EL RETURN, DEVOLVERÁ EL OBJETO VIEW
        return view;
    }
/*
    public void inicializarListaCactus(){
        cactus=new ArrayList<Cactus>();
        cactus.add(new Cactus("Mary",R.drawable.mary,3));
        cactus.add(new Cactus("Sebastian",R.drawable.sebastian,3));
        cactus.add(new Cactus("Maricela",R.drawable.maricela,3));
        cactus.add(new Cactus("Argelia",R.drawable.argelia,3));
        cactus.add(new Cactus("Argel",R.drawable.argel,3));
        //     cactus.add(new Cactus("Yonahandy",R.drawable.yonahandy,3));
        cactus.add(new Cactus("Moira",R.drawable.moira,3));
    }

 */

    @Override
    public void generarLinearLayoutVertical() {
        //LAS SIG 3 LÍNEAS SIN PARA MOSTRAR EL RECYCLERVIEW
        //CAMBIAR THIS POR getActivity()
        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerViewMain.setLayoutManager(llm);
    }

    @Override
    public CactusAdaptador crearAdaptador(ArrayList<Cactus> cactus) {
        CactusAdaptador adaptador=new CactusAdaptador(cactus,getActivity());

        return adaptador;
    }

    @Override
    public void inicializarAdaptadorDelRecyclerView(CactusAdaptador adaptador) {
        RecyclerViewMain.setAdapter(adaptador);
    }
}
