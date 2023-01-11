package com.example.listview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.listview.R;
import com.example.listview.activity.model.RecyclerItemClickListener;
import com.example.listview.activity.adapter.Adapter;
import com.example.listview.activity.model.Filmes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filmes> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.recyclerView);

    //Listagem de filmes
    this.criarFilmes();

    // configurar adapter - formata e retorna linha a linha do recycler view.
        Adapter adapter = new Adapter(listaFilmes);


    // configurar Recycleview

    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true); // usado para melhorar e otimizar o recycler view
    recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
    recyclerView.setAdapter( adapter );

    recyclerView.addOnItemTouchListener(
        new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerView,

                new RecyclerItemClickListener.OnItemClickListener(){
                @Override
                public void onItemClick (View view, int position){
                    Filmes filme = listaFilmes.get ( position);
                    Toast.makeText(
                            getApplicationContext(),
                            "Filme selecionado: " + filme.getFilme(),
                            Toast.LENGTH_SHORT
                    ).show();
                }
                @Override
                public void onLongItemClick (View view, int position){
                    Filmes filme = listaFilmes.get ( position);
                    Toast.makeText(
                            getApplicationContext(),
                            "Você pode achar " + filme.getFilme() + " no Netflix",
                            Toast.LENGTH_SHORT
                    ).show();

                }
                @Override
                public void onItemClick (AdapterView<?> adapterView, View view, int i, long id) {

                }

                }
        )
    );

    }
public void criarFilmes(){
        Filmes filme = new Filmes("Interestelar", "Ficção Científica", "2014");
        listaFilmes.add(filme);

        filme = new Filmes("Clube da Luta", "Drama/Suspense", "1999");
        listaFilmes.add(filme);

        filme = new Filmes("O Regresso", "Drama/Aventura", "2015");
        listaFilmes.add(filme);

        filme = new Filmes("Segurando as Pontas", "Comédia", "2008");
        listaFilmes.add(filme);

        filme = new Filmes("Se7en", "Crime/Mistério", "1995");
        listaFilmes.add(filme);

        filme = new Filmes("Superbad:É Hoje", "Comédia", "2007");
        listaFilmes.add(filme);

        filme = new Filmes("Millennium", "Suspense/Drama", "2011");
        listaFilmes.add(filme);

        filme = new Filmes("Prenda-Me se For Capaz", "Crime/Drama", "2002");
        listaFilmes.add(filme);

        filme = new Filmes("Jumanji", "Fantasia", "1996");
        listaFilmes.add(filme);

        filme = new Filmes("Corra!", "Suspense Psicológico", "2017");
        listaFilmes.add(filme);

}

}
