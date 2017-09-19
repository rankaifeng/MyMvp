package time.rkf.com.mymvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by rankaifeng on 2017/9/19.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    protected T mPrster;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*创建center*/
        mPrster = createPresenter();
        /*关联view*/
        mPrster.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /*解除关联*/
        mPrster.detachView();
    }

    protected abstract T createPresenter();
}
