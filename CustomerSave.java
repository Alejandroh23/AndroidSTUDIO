/**
 * Created by PC on 27/09/2017.
 */
package mx.edu.cetys.alejandroh.bancoalex.Utilities;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

import java.util.ArrayList;

public class CustomerSave extends Activity implements OnClickListener
{
    private Button btnAdd;
    private EditText et;
    private ListView CustomerHelper;
    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        btnAdd = (Button)findViewById(R.id.addTaskBtn); //Busca el cliente
        btnAdd.setOnClickListener(this);
        et = (EditText)findViewById(R.id.editText);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list); //Hace la nueva lista

        CustomerHelper=(ListView)findViewById(R.id.list);
        CustomerHelper.setAdapter(adapter);

        CustomerHelper.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id)  //Se desea confirmar que cliente borrar
            {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Cliente ha sido borrado");
                alertDialogBuilder.setMessage("¿Esta seguro que quiere borrar al cliente seleccionado?");
                alertDialogBuilder.setCancelable(false);
                alertDialogBuilder.setPositiveButton("Si", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        adapter.remove(adapter.getItem(position));
                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        }); //Cuando el usuario elija si borrar o no un cliente
    }
    public  void onClick(View v)
    {
        String input = et.getText().toString();
        if(input.length() > 0)
        {
            adapter.add(input);
            et.setText("");
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.main__to_do_list, menu);
        return true;
    }
}
