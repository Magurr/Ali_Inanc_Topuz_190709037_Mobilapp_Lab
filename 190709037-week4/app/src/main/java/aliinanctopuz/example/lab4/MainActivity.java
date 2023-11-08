package aliinanctopuz.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        TextView txtAddress = (TextView) findViewById(R.id.address);
        Button btnGo = (Button) findViewById(R.id.go);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                webview.loadUrl("http://"+ txtAddress.getText());
            }
        });
        if (getIntent() != null && getIntent().getData() != null) {
            txtAddress.setText(getIntent().getData().toString());
            webview.loadUrl(getIntent().getData().toString());
        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}