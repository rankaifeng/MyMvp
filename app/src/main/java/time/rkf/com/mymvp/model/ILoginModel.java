package time.rkf.com.mymvp.model;

/**
 * Created by rankaifeng on 2017/9/19.
 */

public interface ILoginModel {
    void login(LoginLisiter loginLisiter);


    interface LoginLisiter {
        void suess(String msg);
    }
}
