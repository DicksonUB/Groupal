package edu.ub.pis2018.ldoehndo17.groupal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukaz on 14/03/2018.
 */

public class Tab1Class extends Fragment {

    RecyclerView recyclerView;
    List<Grupo> dataset;
    RecycleViewAdapter adapter;
    AppCompatActivity main;

    public void setMain(AppCompatActivity main) {
        this.main = main;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.activity_tab1, container, false);
        recyclerView = vista.findViewById(R.id.lista_grupos);
        recyclerView.setHasFixedSize(true);
        dataset = new ArrayList<>();
        llenarDataset();
        adapter = new RecycleViewAdapter(getContext(),dataset,main);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        return vista;

    }
    public void llenarDataset(){
        Grupo grupo = new Grupo("Cosmocaixa","3 de 24",R.drawable.f1);
        dataset.add(grupo);
        grupo = new Grupo("Mc.Donalds","1 de 2",R.drawable.f2);
        dataset.add(grupo);
        grupo = new Grupo("Port Aventura","6 de 48",R.drawable.f3);
        dataset.add(grupo);
        grupo = new Grupo("Viñarock","1  de 4",R.drawable.f5);
        dataset.add(grupo);
        grupo = new Grupo("Limpiar playa Barcelona","89 de 100",R.drawable.f4);
        dataset.add(grupo);
        grupo = new Grupo("Limpiar playa Barcelona","89 de 100",R.drawable.f4);
        dataset.add(grupo);
        grupo = new Grupo("Limpiar playa Barcelona","89 de 100",R.drawable.f4);
        dataset.add(grupo);
        grupo = new Grupo("Limpiar playa Barcelona","89 de 100",R.drawable.f4);
        dataset.add(grupo);
        grupo = new Grupo("Limpiar playa Barcelona","89 de 100",R.drawable.f4);
        dataset.add(grupo);
        grupo = new Grupo("Limpiar playa Barcelona","89 de 100",R.drawable.f4);
        dataset.add(grupo);

    }
}
