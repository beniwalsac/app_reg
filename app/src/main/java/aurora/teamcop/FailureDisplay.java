package aurora.teamcop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FailureDisplay extends AppCompatActivity {

    private Button try_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure_display);

        try_again = (Button) findViewById(R.id.try_again);

    }

    //try again button lets you go back to the welcome page
    public void OnClick(View view) {
        if(view == try_again) {
            Intent intent = new Intent(this, WelcomePage.class);
            startActivity(intent);
        }
    }

}
