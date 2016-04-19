package bubtjobs.com.icare.Fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bubtjobs.com.icare.Activity.Home;
import bubtjobs.com.icare.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Add_Profile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_add__profile, container, false);

        ButterKnife.bind(this,view);

        return view;
    }

    @OnClick(R.id.cancel_bt)
    public void cancel(){
       // startActivity(new Intent(getActivity(), Home.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        Intent intent=new Intent(getActivity(),Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }


}
