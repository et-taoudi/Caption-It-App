package com.example.tp2;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextInputEditText firstname,lastname;
        Button caption;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=findViewById(R.id.firstnameEditText);
        lastname=findViewById(R.id.lastnameEditText);
        caption=findViewById(R.id.caption);
        caption.setOnClickListener(v->{
            String firstnameString=firstname.getText().toString();
            String lastnameString=lastname.getText().toString();
            String message="Hey "+firstnameString+" "+lastnameString;
            Toast.makeText(this,message,Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,CaptionScreen.class);
            intent.putExtra("message",message);
            startActivity(intent);
        });

    }
}