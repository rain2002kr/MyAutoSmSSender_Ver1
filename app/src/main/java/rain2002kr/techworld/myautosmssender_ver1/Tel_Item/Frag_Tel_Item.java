package rain2002kr.techworld.myautosmssender_ver1.Tel_Item;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import rain2002kr.techworld.myautosmssender_ver1.MainActivity;
import rain2002kr.techworld.myautosmssender_ver1.R;

import static android.content.Context.MODE_PRIVATE;

public class Frag_Tel_Item extends Fragment {
    MainActivity mainActivity;
    EditText editName,editMoblie;
    ImageView imageView;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach( context );
        mainActivity = (MainActivity) getActivity();

        Toast.makeText( context,"onAttach 호출됨", Toast.LENGTH_LONG ).show();

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =(View) inflater.inflate( R.layout.tellist, container,false );
        editName = (EditText) view.findViewById( R.id.editText );
        editMoblie = (EditText) view.findViewById( R.id.editText2 );
        imageView = (ImageView) view.findViewById( R.id.imageView );

        Context context = getContext();
        Toast.makeText( context,"onCreateView 호출됨", Toast.LENGTH_LONG ).show();
        if(savedInstanceState != null){
            String test = savedInstanceState.getString( "test" );
            editName.setText(test  );
            Toast.makeText( context,"savedInstanceState 내에 데이터 호출됨"+ test, Toast.LENGTH_LONG ).show();
        }

        return view;
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState( outState );
        outState.putString( "test","test" );
        Context context = getContext();
        Toast.makeText( context,"onSaveInstanceState 호출됨", Toast.LENGTH_LONG ).show();

    }
//TODO (2) FragTel item


    @Override
    public void onPause() {
        super.onPause();
        Context context = getContext();
        Toast.makeText( context,"onPause 호출됨", Toast.LENGTH_LONG ).show();
        Bundle bundle = new Bundle(  );
        bundle.putString( "test","test signal" );
        //onSaveInstanceState(bundle);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Context context = getContext();
        Toast.makeText( context,"onDetach 호출됨", Toast.LENGTH_LONG ).show();

    }
}
