package id.ac.its.evelyn.applp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private AdapterActivity adapter;
        private ArrayList<DoingActivity> TodoArrayList;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            addData();
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            adapter = new AdapterActivity(TodoArrayList);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }
        void addData(){
            TodoArrayList = new ArrayList<>();
            TodoArrayList.add(new DoingActivity("Dimas Maulana", "1414370309", "123456789"));
            TodoArrayList.add(new DoingActivity("Fadly Yonk", "1214234560", "987654321"));
            TodoArrayList.add(new DoingActivity("Ariyandi Nugraha", "1214230345", "987648765"));
            TodoArrayList.add(new DoingActivity("Aham Siswana", "1214378098", "098758124"));
        }
}
