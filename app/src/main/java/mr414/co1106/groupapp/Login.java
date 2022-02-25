package mr414.co1106.groupapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends Activity {

    public Button login;
    public TextView signup_link;
    public static Boolean logged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        signup_link = (TextView) findViewById(R.id.signup);
        signup_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Signup.class);
                startActivity(intent);
            }
        });


        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainApp();
            }
        });

    }

    public void openMainApp() {
        MainActivity.logged = new User();
        MainActivity.logged.logins();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}
