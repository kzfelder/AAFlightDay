package com.example.kyrah.aaflightday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class OldMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildGUI();

    }

    public static String confirmation;
    public static EditText confirm;
    public static Intent intent;

    public void buildGUI(){
        final RelativeLayout thisLayout = new RelativeLayout(this);

        TextView welcome = new TextView(this);
        welcome.setText("Welcome to the American Airlines Flight Day Manager.");
        welcome.setTextSize(36);
        welcome.setX(50);
        thisLayout.addView(welcome);
        TextView command = new TextView(this);
        command.setText("Please enter your flight confirmation number:");
        command.setY(800);
        command.setX(10);
        command.setTextSize(20);
        thisLayout.addView(command);
        confirm = new EditText(this);
        confirm.setHint("Confirmation #");
        confirm.setY(900);
        confirm.setX(400);
        confirm.setTextSize(25);
        thisLayout.addView(confirm);
        final Button next = new Button(this);
        next.setY(1200);
        next.setX(500);
        next.setText("Login");
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent();
                intent.setClass(OldMainActivity.this, OldMain2Activity.class);
                intent.putExtra("confirmation", confirmation);
                startActivity(intent);
            }
        });
        thisLayout.addView(next);
        confirm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                confirmation = String.valueOf(confirm.getText());
            }
        });
        setContentView(thisLayout);
    }

}
