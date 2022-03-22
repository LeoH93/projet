package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView mail_affiche;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Recup de la variable de la page 1
        mail_affiche = (TextView)findViewById(R.id.mail_affiche);
        String mail = getIntent().getStringExtra("mail");

        mail_affiche.setText(mail);
        // Fin recup de al variable


    }
}