package bubtjobs.com.icare.Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import bubtjobs.com.icare.Adapter.ProfileViewAdapter;
import bubtjobs.com.icare.Model.Profile;
import bubtjobs.com.icare.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class View_All_Profile extends Fragment {

    ArrayList<Profile>profileArrayList;
    @Bind(R.id.profileListView) ListView profileListView;
    Profile profile;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_view__all__profile, container, false);
        ButterKnife.bind(this,view);

        // add data in viewprofile class
        profileArrayList=new ArrayList<>();

        profile=new Profile("1","jalilur rahman");
        profileArrayList.add(profile);

        profile=new Profile("2","Murtuza");
        profileArrayList.add(profile);

        profile=new Profile("3","Torikul");
        profileArrayList.add(profile);

        profile=new Profile("4","Nowrin");
        profileArrayList.add(profile);


        ProfileViewAdapter adapter=new ProfileViewAdapter(view.getContext(),profileArrayList);
        profileListView.setAdapter(adapter);

        profileListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String userId=profileArrayList.get(position).getUserId();
                String username=profileArrayList.get(position).getUserName();
                Toast.makeText(getActivity(), userId+""+username, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }




}
