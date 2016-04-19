package bubtjobs.com.icare.Fragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bubtjobs.com.icare.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_sign_up, container, false);
        ButterKnife.bind(this,view);

        return view;
    }

    @OnClick(R.id.loginBt)
    public void login(){
        Add_Profile add_profile=new Add_Profile();
        FragmentManager manager= getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.myFragment,add_profile);
        transaction.commit();


    }

}
