package rain2002kr.techworld.myautosmssender_ver1.Fragment_main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import rain2002kr.techworld.myautosmssender_ver1.Define_Constant.UC;
import rain2002kr.techworld.myautosmssender_ver1.MainActivity;
import rain2002kr.techworld.myautosmssender_ver1.R;

public class FragSub4 extends Fragment {
    MainActivity mainActivity;
    Button homebtn,sub1btn,sub2btn,sub3btn,sub4btn;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach( context );
        mainActivity = (MainActivity) getActivity();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate( R.layout.frag_sub4,container,false );

        return view;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
}
