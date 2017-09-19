package time.rkf.com.mymvp;

/**
 * Created by rankaifeng on 2017/9/19.
 */

public class ILoginModelImp implements ILoginModel {

    @Override
    public void login(LoginLisiter loginLisiter) {
        loginLisiter.suess("登陆成功");
    }
}
