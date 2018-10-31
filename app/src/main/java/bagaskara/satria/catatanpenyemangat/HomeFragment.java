package bagaskara.satria.catatanpenyemangat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home,container,false);

        Button btnCategori=(Button)view.findViewById(R.id.btn_categori);
        btnCategori.setOnClickListener(this);

        Button btnAbout=(Button) view.findViewById(R.id.btn_about);
        btnAbout.setOnClickListener(this);

        Button btnBiodata=(Button)view.findViewById(R.id.btn_biodata);
        btnBiodata.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_categori){
            CategoryFragment_1 mCategoryFragment1=new CategoryFragment_1();
            FragmentManager mFragmentManager=getFragmentManager();
            FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container,mCategoryFragment1,CategoryFragment_1.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
        }
        if(v.getId()==R.id.btn_about){
            Categoryfragment2 mCategoryfragment2=new Categoryfragment2();
            FragmentManager mFragmentManager=getFragmentManager();
            FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container,mCategoryfragment2,Categoryfragment2.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
        }
        if(v.getId()==R.id.btn_biodata){
            CategoryFragment3 mCategoryfragment3=new CategoryFragment3();
            FragmentManager mFragmentManager=getFragmentManager();
            FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container,mCategoryfragment3,CategoryFragment3.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
        }

    }
}
