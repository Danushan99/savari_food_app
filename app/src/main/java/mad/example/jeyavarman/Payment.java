package mad.example.jeyavarman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    private Button donebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        donebtn=findViewById(R.id.donebtn);
        donebtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Payment.this,done.class);
                Toast.makeText(getApplicationContext()," sucessfully orderd",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }



        });
    }
}