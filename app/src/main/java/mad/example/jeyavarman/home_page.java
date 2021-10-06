package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home_page extends AppCompatActivity {
public ImageButton imgprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        imgprofile = findViewById(R.id.imgprofile);
        imgprofile.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(home_page.this, profile.class);
                                         startActivity(intent);
                                         finish();

                                     }
                                 }

        );
    }
}