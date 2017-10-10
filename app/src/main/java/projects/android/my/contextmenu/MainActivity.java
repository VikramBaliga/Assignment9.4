package projects.android.my.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button contextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contextView = (Button) findViewById(R.id.contextBtn);
        registerForContextMenu(contextView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
         super.onContextItemSelected(item);

        switch (item.getItemId())
        {
            case R.id.opt1:
                Toast.makeText(this,"Option 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt2:
                Toast.makeText(this,"Option 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt3:
                Toast.makeText(this,"Option 3",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
