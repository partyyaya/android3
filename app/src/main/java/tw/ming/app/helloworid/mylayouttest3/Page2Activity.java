package tw.ming.app.helloworid.mylayouttest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static tw.ming.app.helloworid.mylayouttest3.MainApp.data4;

public class Page2Activity extends AppCompatActivity {
    private long lastKeyTime;
    private MainApp mainApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        lastKeyTime = System.currentTimeMillis();
        mainApp=(MainApp) getApplication();
        Log.i("ming","MainApp:username = "+mainApp.username);
        Log.i("ming","MainApp:data3 = "+mainApp.data3);
        Log.i("ming","MainApp:data4= "+data4);
    }
    public void doExit(View view){
        finish();
    }

    @Override
    public void finish() {
        Log.i("ming","page2 finish");
        if(System.currentTimeMillis()-lastKeyTime<=3*1000){
            super.finish();
        }else{
            Toast.makeText(this,"press one more time",Toast.LENGTH_SHORT).show();
        }
        lastKeyTime = System.currentTimeMillis();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ming","page2 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ming","page2 onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ming","page2 onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ming","page2 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ming","page2 onDestroy");
    }
}
