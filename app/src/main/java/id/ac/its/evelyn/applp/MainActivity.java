package id.ac.its.evelyn.applp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listCreate(View view){
        Intent intent=new Intent(MainActivity.this, CreateActivity.class);
        startActivity(intent);
    }
}
