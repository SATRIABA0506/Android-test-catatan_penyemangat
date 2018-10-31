package bagaskara.satria.catatanpenyemangat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment_1 extends Fragment implements View.OnClickListener {
    private Button btnPuisi;
    private Button btnCurahan;
    private Button btnKehidupan;


    public CategoryFragment_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_category1,container,false);
        btnPuisi=(Button)view.findViewById(R.id.btn_puisi);
        btnPuisi.setOnClickListener(this);

        btnCurahan=(Button)view.findViewById(R.id.btn_curahan);
        btnCurahan.setOnClickListener(this);

        btnKehidupan=(Button)view.findViewById(R.id.btn_kehidupan);
        btnKehidupan.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_puisi){
            DialogFragment1 mdialogFragment1=new DialogFragment1();
            FragmentManager mFragmentManager=getFragmentManager();
            FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container,mdialogFragment1,DialogFragment1.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();

        }

        if(v.getId()==R.id.btn_curahan){
                FragmentCurahan mfragmentCurahan=new FragmentCurahan();
                FragmentManager mFragmentManager=getFragmentManager();
                FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frame_container,mfragmentCurahan,FragmentCurahan.class.getSimpleName());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
        }

        if(v.getId()==R.id.btn_kehidupan){
            FragmentKehidupan mfragmentKehidupan=new FragmentKehidupan();
            FragmentManager mFragmentManager=getFragmentManager();
            FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container,mfragmentKehidupan,FragmentKehidupan.class.getSimpleName());
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
        }
    }
}
