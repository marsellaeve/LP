package id.ac.its.evelyn.applp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        getSupportActionBar().hide();
    }
    public void Home(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
