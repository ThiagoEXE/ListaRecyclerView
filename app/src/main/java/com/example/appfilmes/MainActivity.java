package com.example.appfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaDados[] listaDados = new ListaDados[]{
          new ListaDados("Thiago", R.drawable.pessoa),
                new ListaDados("Rafael", R.drawable.pessoa), new ListaDados("Thiago", R.drawable.pessoa),
                new ListaDados("Alisson", R.drawable.pessoa), new ListaDados("Thiago", R.drawable.pessoa),
                new ListaDados("Douglas", R.drawable.pessoa), new ListaDados("Rafael", R.drawable.pessoa),
                new ListaDados("Erick", R.drawable.pessoa),new ListaDados("Rafael", R.drawable.pessoa),
                new ListaDados("Márcio", R.drawable.pessoa),new ListaDados("Rafael", R.drawable.pessoa)
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(MainActivity.this, listaDados);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}