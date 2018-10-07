package com.example.kyrah.aaflightday;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

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
        thisLayout.setBackground(getDrawable(R.drawable.login_bg));
        ImageView picture = new ImageView(this);
        picture.setImageResource(R.drawable.login_backg);
        picture.setY(100);
        picture.setX(200);
        thisLayout.addView(picture);
        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.logo);
        logo.setY(1300);
        logo.setX(60);
        thisLayout.addView(logo);
        TextView welcome = new TextView(this);
        welcome.setText("Welcome to the American Airlines Flight Day Manager");
        welcome.setTextSize(36);
        welcome.setY(190);
        welcome.setX(375);
        welcome.setWidth(850);
        welcome.setTextAlignment(View.TEXT_DIRECTION_FIRST_STRONG_RTL);
        welcome.setTypeface(Typeface.SANS_SERIF);
        welcome.setTextColor(-65550);
        thisLayout.addView(welcome);
        TextView command = new TextView(this);
        command.setText("Please enter your flight confirmation number:");
        command.setY(1000);
        command.setX(100);
        command.setTextSize(18);
        command.setTextColor(-65550);
        command.setTypeface(Typeface.SANS_SERIF);
        command.setTypeface(Typeface.DEFAULT_BOLD);
        thisLayout.addView(command);
        confirm = new EditText(this);
        confirm.setHint("Confirmation #");
        confirm.setY(1200);
        confirm.setX(500);
        confirm.setTextSize(20);
        thisLayout.addView(confirm);
        final Button next = new Button(this);
        next.setY(1450);
        next.setX(600);
        next.setText("Login");
        next.setEnabled(false);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent();
                intent.setClass(LoginActivity.this, ResponseActivity.class);
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
                next.setEnabled(true);
            }
        });
        setContentView(thisLayout);
    }

}
