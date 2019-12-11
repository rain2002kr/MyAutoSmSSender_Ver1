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


public class FragMain extends Fragment {
    MainActivity mainActivity;
    Button serviceStartBtn,serviceStopBtn;
    Button homebtn,sub1btn,sub2btn,sub3btn,sub4btn;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach( context );
        mainActivity = (MainActivity) getActivity();

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate( R.layout.frag_main,container,false );
        serviceStartBtn = (Button) view.findViewById( R.id.button );
        serviceStopBtn = (Button)view.findViewById( R.id.button2 );
        //homebtn = (Button)view.findViewById( R.id.button3 );
        sub1btn = (Button)view.findViewById( R.id.button3 );
        sub2btn = (Button)view.findViewById( R.id.button4 );
        sub3btn = (Button)view.findViewById( R.id.button5 );
        sub4btn = (Button)view.findViewById( R.id.button6 );

        sub1btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setFragchange( UC.FRAG_SCR_SUB1 );
            }
        } );
        sub2btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setFragchange( UC.FRAG_SCR_SUB2 );
            }
        } );
        sub3btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setFragchange( UC.FRAG_SCR_SUB3 );
            }
        } );
        sub4btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setFragchange( UC.FRAG_SCR_SUB4 );
            }
        } );


        return view;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
}
