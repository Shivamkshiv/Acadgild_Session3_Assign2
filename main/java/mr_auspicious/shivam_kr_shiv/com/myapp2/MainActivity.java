package mr_auspicious.shivam_kr_shiv.com.myapp2;


import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.opengl.Visibility;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                   startActivity(i);


            }
        });

    }
}
