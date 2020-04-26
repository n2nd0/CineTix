package com.e.uas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_page);

        Button SignUp = (Button)findViewById(R.id.SignUp);
        Button Login = (Button)findViewById(R.id.Login);











        SignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SignUp frag1 = new SignUp ();
                frag1.setArguments (getIntent ().getExtras ());

                FragmentManager fragmentManager = getSupportFragmentManager ();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();

                fragmentTransaction.add (R.id.frame, frag1);
                fragmentTransaction.replace (R.id.frame, new SignUp ());
                fragmentTransaction.commit();

            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Login frag2 = new Login ();
                frag2.setArguments (getIntent ().getExtras ());

                FragmentManager fragmentManager = getSupportFragmentManager ();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();

                fragmentTransaction.add (R.id.frame, frag2);
                fragmentTransaction.replace (R.id.frame, new Login ());
                fragmentTransaction.commit();

            }
        });
    }
}
