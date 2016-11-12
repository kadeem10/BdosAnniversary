package testlab.example.kadeem.bdosanniv;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(new ImageAdapter(this));



        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                    Intent i;
                    switch (position){
                        case 0:
                            //Toast.makeText(MainActivity.this, "First", Toast.LENGTH_SHORT).show();
                            i = new Intent(mContext, FirstActivity.class);
                            startActivity(i);
                            break;
                        case 1:
                            i = new Intent(mContext, SecondActivity.class);
                            startActivity(i);
                            break;

                        case 2:
                            i = new Intent(mContext, ThirdActivity.class);
                            startActivity(i);
                            break;
                        case 3:
                            i = new Intent(mContext, FourthActivity.class);
                            startActivity(i);
                            break;

                        case 4:
                            i = new Intent(mContext, FifthActivity.class);
                            startActivity(i);
                            break;
                        case 5:
                            i = new Intent(mContext, SixthActivity.class);
                            startActivity(i);
                            break;
                        default:
                            Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
            }
        });

    }
}
