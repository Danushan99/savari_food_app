package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class home_page extends AppCompatActivity  implements View.OnClickListener {
    public ImageButton imgprofile;
    public CardView card1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        card1 = findViewById(R.id.tastpie);
        card1.setOnClickListener(this);




        imgprofile = findViewById(R.id.imgprofile);
        imgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this, profile.class);
                startActivity(intent);



            }
        }

        );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tastpie:
                startActivity(new Intent(this, Customer.class));
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                break;
        }
    }


}