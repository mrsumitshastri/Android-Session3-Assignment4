package helloworld.iconikindia.com.android_session3_assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
    }

    public void loginClicked(View v)
    {
        if(email.getText().length() <=0)
        {
            Toast.makeText(this, "Enter Email address", Toast.LENGTH_SHORT).show();

        }
        else if(password.getText().length() <=0)
        {
            Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"Validate Successfully",Toast.LENGTH_SHORT).show();
        }
    }
}
