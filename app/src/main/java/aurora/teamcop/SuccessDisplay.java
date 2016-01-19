package aurora.teamcop;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SuccessDisplay extends AppCompatActivity {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_display);

        home = (Button) findViewById(R.id.home);
    }

    public void OnClick(View view) {
        if (view == home) {
            Intent intent = new Intent(this, WelcomePage.class);
            startActivity(intent);
        }
    }
}
