package time.rkf.com.mymvp.presenter;

import time.rkf.com.mymvp.base.BasePresenter;
import time.rkf.com.mymvp.view.ILoginView;
import time.rkf.com.mymvp.model.ILoginModel;
import time.rkf.com.mymvp.model.imp.ILoginModelImp;

/**
 * Created by rankaifeng on 2017/9/19.
 */

public class ILoginPresenter extends BasePresenter<ILoginView> {
    private ILoginModel iLoginModel;
    private ILoginView iLoginView;

    public ILoginPresenter(ILoginView iLoginView) {
        this.iLoginModel = new ILoginModelImp();
        this.iLoginView = iLoginView;
    }

    public void Ilogin() {
        iLoginModel.login(new ILoginModel.LoginLisiter() {
            @Override
            public void suess(String msg) {
                iLoginView.showTost(msg);
            }
        });
    }
}
