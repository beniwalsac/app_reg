package aurora.teamcop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    private Button Login;
    private Button About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        Login = (Button) findViewById(R.id.login_page);
        About = (Button) findViewById(R.id.about);
    }

    public void OnClick(View view) {
        if (view == Login) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }
        if (view == About) {
            Intent intent = new Intent(this, AboutPage.class);
            startActivity(intent);
        }
    }

}