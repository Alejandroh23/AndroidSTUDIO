package mx.edu.cetys.alejandroh.pojos;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.content.Intent;
        import android.view.View;
        import android.widget.EditText;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_press = (Button) findViewById(R.id.btn_press);
        final EditText text_write = (EditText) findViewById(R.id.text_write);
        Button btn_listView = (Button) findViewById(R.id.btn_listView);


        btn_listView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Movies oMovie = new Movies();
                oMovie.setName("Test");
                Intent intent = new Intent(getApplicationContext(), ListView.class);
                intent.putExtra("miLlave",oMovie);
                startActivity(intent);
            }
        });
        Intent intent = new Intent(Movies.this, MoviesActivity.class);
        Object[] object = new Object();
        intent.putExtra("Object ", object);
        startActivity(intent);

    }
    Object[] object = (Object[]) getIntent().getExtras().getParcelable("object");
}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActinButton fab = (FloatingActionButton9 findViewById)
    }
}
