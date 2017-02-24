package com.example.winstar_softwareeng.matsiko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.AndroidCharacter;
import android.widget.Toast;

public class MYSIMPLEAPP extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysimpleapp);


    }

    public	void	sendMessage(View	view)	{
        EditText message	=	(EditText)findViewById(R.id.message);
        Toast.makeText (this,	"Delivering	your details"	+	message.getText().toString(), Toast.LENGTH_SHORT).show();


        EditText a	=	(EditText)findViewById(R.id.a);
        Toast.makeText (this,	"Delivering	your details"	+	a.getText().toString(), Toast.LENGTH_LONG).show();

}

}
