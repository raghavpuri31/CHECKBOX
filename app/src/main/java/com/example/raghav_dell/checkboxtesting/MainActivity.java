package com.example.raghav_dell.checkboxtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e ,e1;
    Button b;
    CheckBox c,c2,c3 ;
    double total=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }
    public void show()

    {
        e=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
        c=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basic= Integer.parseInt(e.getText().toString());
                if (c.isChecked())
                {
                    total+=basic +0.2*basic ;

                }
                if(c2.isChecked())
                {
                    total+=basic + 0.5*basic ;
                }
                if(c3.isChecked())
                {
                    total+=basic+0.1*basic ;
                }
                Toast.makeText(MainActivity.this, String.valueOf(total), Toast.LENGTH_SHORT).show();}

        });
    }
}
