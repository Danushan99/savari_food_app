package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class add_address extends AppCompatActivity {
    private Button sign2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);


        sign2 = findViewById(R.id.addaddress1);
        sign2.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(add_address.this, home_page.class);
                                         Toast.makeText(getApplicationContext(),"Regsiterd",Toast.LENGTH_SHORT).show();
                                         startActivity(intent);

                                     }
                                 }
        );
    }
}