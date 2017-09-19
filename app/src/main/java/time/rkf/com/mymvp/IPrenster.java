package time.rkf.com.mymvp;

/**
 * Created by rankaifeng on 2017/9/19.
 */

public class IPrenster extends BasePresenter<ILoginView>{
    private ILoginModel iLoginModel;
    private ILoginView iLoginView;

    public IPrenster(ILoginView iLoginView) {
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
