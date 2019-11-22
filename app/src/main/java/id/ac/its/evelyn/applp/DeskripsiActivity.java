package id.ac.its.evelyn.applp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DeskripsiActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        getSupportActionBar().hide();
    }
    public void HalamanEdit(View view){
        Intent intent= new Intent(this, EditActivity.class);
        startActivity(intent);
    }
    public void back(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
