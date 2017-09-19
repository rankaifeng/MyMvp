package time.rkf.com.mymvp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import time.rkf.com.mymvp.R;
import time.rkf.com.mymvp.base.BaseActivity;
import time.rkf.com.mymvp.presenter.ILoginPresenter;
import time.rkf.com.mymvp.view.ILoginView;

public class MainActivity extends BaseActivity<ILoginView, ILoginPresenter> implements ILoginView {
    private Button btnLogin;
    private ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iLoginPresenter = new ILoginPresenter(this);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iLoginPresenter.Ilogin();
            }
        });
    }

    @Override
    protected ILoginPresenter createPresenter() {
        return new ILoginPresenter(this);
    }

    @Override
    public void showTost(String msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
    }
}
