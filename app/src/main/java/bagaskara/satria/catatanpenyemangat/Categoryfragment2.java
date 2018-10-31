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
public class Categoryfragment2 extends Fragment implements View.OnClickListener {
private TextView tujuan;

    public Categoryfragment2() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_category2,container,false);
        tujuan=(TextView) view.findViewById(R.id.txttujuan);
        tujuan.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        }
    }

