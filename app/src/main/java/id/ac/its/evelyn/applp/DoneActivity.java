package id.ac.its.evelyn.applp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class DoneActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DoneListAdapter adapter;
    private ArrayList<Doing> TodoArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        getSupportActionBar().hide();

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DoneListAdapter(TodoArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DoneActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    void addData(){
        TodoArrayList = new ArrayList<>();
        TodoArrayList.add(new Doing("Oprec Admin", "Noel", "12 Januari 2019", 3,2));
        TodoArrayList.add(new Doing("Oprec Admin1", "Nada", "15 Januari 2019",5,2));
        TodoArrayList.add(new Doing("Oprec Admin2", "Paya", "20 Januari 2019",3,1));
        TodoArrayList.add(new Doing("Oprec Admin3", "Teja", "10 Februari 2019",3,2));
    }
    public void deskripsi(View view){
        Intent intent= new Intent(this, DeskripsiActivity.class);
        startActivity(intent);
    }
    public void create(View view){
        Intent intent= new Intent(this, CreateActivity.class);
        startActivity(intent);
    }
    public  void doing(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
