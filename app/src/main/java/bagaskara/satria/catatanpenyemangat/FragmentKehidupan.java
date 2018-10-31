package bagaskara.satria.catatanpenyemangat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKehidupan extends Fragment implements  View.OnClickListener {
    private TextView Kehidupan;

    public FragmentKehidupan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_kehidupan,container,false);
        Kehidupan=(TextView) view.findViewById(R.id.txtkehidupan);
        Kehidupan.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {


    }
}
