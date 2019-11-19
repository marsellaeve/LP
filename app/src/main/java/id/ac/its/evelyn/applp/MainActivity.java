package id.ac.its.evelyn.applp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private ListAdapter adapter;
        private ArrayList<Doing> TodoArrayList;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getSupportActionBar().hide();

            addData();
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            adapter = new ListAdapter(TodoArrayList);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }
        void addData(){
            TodoArrayList = new ArrayList<>();
            TodoArrayList.add(new Doing("Oprec Admin", "Noel", "12 Januari 2019"));
            TodoArrayList.add(new Doing("Oprec Admin1", "Nada", "15 Januari 2019"));
            TodoArrayList.add(new Doing("Oprec Admin2", "Paya", "20 Januari 2019"));
            TodoArrayList.add(new Doing("Oprec Admin3", "Teja", "10 Februati 2019"));
        }
}
