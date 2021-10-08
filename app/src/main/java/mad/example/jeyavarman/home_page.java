package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class home_page extends AppCompatActivity  implements View.OnClickListener
{

    public CardView card1,card2;
    public ImageButton ImageButton,serchbtn,payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ImageButton = (ImageButton) findViewById(R.id.imgprofile1);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(home_page.this, profile.class);
                startActivity(beach);
            }
        });

        serchbtn = (ImageButton) findViewById(R.id.serchbtn1);
        serchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(home_page.this, Select_tastypie.class);
                startActivity(beach);
            }
        });

        payment = (ImageButton) findViewById(R.id.bill1);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(home_page.this, Order.class);
                startActivity(beach);
            }
        });


        card1 = findViewById(R.id.tastpie);
        card1.setOnClickListener(this);

        card2 = findViewById(R.id.sunshine1);
        card2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tastpie:
                startActivity(new Intent(this, Customer.class));
                Toast.makeText(getApplicationContext(),"choosed",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sunshine1:
                startActivity(new Intent(this, Customer.class));
                break;

        }
    }




}