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
public class CategoryFragment3 extends Fragment implements View.OnClickListener {
    private TextView biodata;

    public CategoryFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_category_3,container,false);
        biodata=(TextView) view.findViewById(R.id.txtbiodata);
        biodata.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

    }
}
