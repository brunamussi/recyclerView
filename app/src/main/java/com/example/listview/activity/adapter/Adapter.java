package com.example.listview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listview.R;
import com.example.listview.activity.model.Filmes;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filmes> listaFilmes;

    public Adapter(List<Filmes> lista) {
        this.listaFilmes = lista;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // para criar visualizações
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list, parent, false); // transformando meu arquivo XML em um objeto do tipo VIEW, que seria meu  listItem.

        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { // criar a exibição do meu Objeto View Holder abaixo deste método.
        Filmes filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
    }

    @Override
    public int getItemCount() { // retorna a quantidade de itens da lista

        return  listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);

        }
    }

}
