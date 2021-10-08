package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usernameLogin extends AppCompatActivity {
    private Button fblogin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username_login);


        fblogin1 = findViewById(R.id.fbloginbtn);
        fblogin1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(usernameLogin.this, home_page.class);
                                           startActivity(intent);

                                       }

                                   }
        );
    }
}