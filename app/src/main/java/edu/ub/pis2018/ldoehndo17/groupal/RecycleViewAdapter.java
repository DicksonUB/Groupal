package edu.ub.pis2018.ldoehndo17.groupal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by deathcode on 01/01/18.
 */

public class RecycleViewAdapter extends  RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private Context context;
    private List<Grupo> grupos;

    RecycleViewAdapter(Context context, List<Grupo> grupos){
        this.context = context;
        this.grupos = grupos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.targeta_grupo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Grupo grupo = grupos.get(position);
        holder.portada.setImageResource(grupo.getLinkPortada());
        holder.titulo.setText(grupo.getTitulo());
        holder.nAsistentes.setText(grupo.getNumAsistentes());
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
            portada = itemView.findViewById(R.id.poster);
            titulo = itemView.findViewById(R.id.movie_name);
            nAsistentes = itemView.findViewById(R.id.rating);
        }
    }

}