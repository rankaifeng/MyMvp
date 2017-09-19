package time.rkf.com.mymvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity<ILoginView, IPrenster> implements ILoginView {
    private Button btnLogin;
    private IPrenster iPrenster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPrenster = new IPrenster(this);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iPrenster.Ilogin();
            }
        });
    }

    @Override
    protected IPrenster createPresenter() {
        return new IPrenster(this);
    }

    @Override
    public void showTost(String msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
    }
}
