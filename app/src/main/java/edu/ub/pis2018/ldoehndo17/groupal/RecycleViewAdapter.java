package edu.ub.pis2018.ldoehndo17.groupal;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecycleViewAdapter extends  RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private Context context;
    private List<Grupo> grupos;
    private static final String TAG = "RecycleViewAdapter";
    private AppCompatActivity main;

    RecycleViewAdapter(Context context, List<Grupo> grupos, AppCompatActivity main){
        this.main = main;
        this.context = context;
        this.grupos = grupos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.targeta_grupo, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Grupo grupo = grupos.get(position);
        holder.portada.setImageResource(grupo.getLinkPortada());
        holder.titulo.setText(grupo.getTitulo());
        holder.nAsistentes.setText(grupo.getNumAsistentes());
        holder.portada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick a la imatge");
                Intent intent = new Intent(main,GrupoActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(main,main.findViewById(R.id.portada),"portada");
                main.startActivity(intent,optionsCompat.toBundle());


            }
        });

    }

    @Override
    public int getItemCount() {
        return grupos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView portada;
        TextView titulo;
        TextView nAsistentes;

        public ViewHolder(View itemView) {
            super(itemView);
            portada = itemView.findViewById(R.id.portada);
            titulo = itemView.findViewById(R.id.titulo);
            nAsistentes = itemView.findViewById(R.id.participantes);
        }
    }

}