package bagaskara.satria.catatanpenyemangat;



import android.content.DialogInterface;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class DialogFragment1 extends Fragment implements  View.OnClickListener {
    private TextView puisi;

    private Button btnpilih, btntutup;
    private RadioGroup rgoption;
    private RadioButton rbnegri, rbuntukmu, rbnama;

    public DialogFragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dialog1, container, false);
        btnpilih = (Button) view.findViewById(R.id.btnPilih);
        btnpilih.setOnClickListener(this);
        btntutup = (Button) view.findViewById(R.id.btnTutup);
        btntutup.setOnClickListener(this);

        rbuntukmu = (RadioButton) view.findViewById(R.id.rbUntukmu);
        rbuntukmu.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTutup:

                
                break;
            case R.id.btnPilih:
                int checkedRadioButtonId = rgoption.getCheckedRadioButtonId();
                if (checkedRadioButtonId != -1) switch (checkedRadioButtonId) {
                    case R.id.rbUntukmu:
                        FragmentManager fragmentManager=getChildFragmentManager();

                        break;

                    case R.id.rbNegri:
                        break;
                }
        }
    }
}