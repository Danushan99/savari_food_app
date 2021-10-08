package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class main_login extends AppCompatActivity {
private Button fb,gl,gml,phn,skip;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        Objects.requireNonNull(getSupportActionBar()).hide();

        fb = findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_login.this, usernameLogin.class);
                startActivity(intent);

            }
        }
        );


       gl = findViewById(R.id.gl);
       gl.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(main_login.this, google.class);
               startActivity(intent);



                                  }
                              }

        );

        skip = findViewById(R.id.skip1);
        skip.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(main_login.this, home_page.class);
                                      startActivity(intent);



                                  }
                              }

        );

       gml = findViewById(R.id.gml);
        gml.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(main_login.this, gmail.class);
                                      startActivity(intent);



                                  }
                              }


        );


        phn = findViewById(R.id.phn);
        phn.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(main_login.this, otp.class);
                                      startActivity(intent);



                                  }
                              }


        );
    }
}