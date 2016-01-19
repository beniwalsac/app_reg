package aurora.teamcop;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutPage extends AppCompatActivity {

    private Button towebpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        towebpage = (Button) findViewById(R.id.webpage);
    }

    public void OnClick(View view) {
        if (view == towebpage) {
            Uri url = Uri.parse("https://docs.google.com/document/d/1UDYSaeB0RJVeDF-_ZYYH_Zi9Gl9iqICKlaO1-wf4mNg/pub");
            Intent intent = new Intent(Intent.ACTION_VIEW, url);
            startActivity(intent);
        }
    }
}
