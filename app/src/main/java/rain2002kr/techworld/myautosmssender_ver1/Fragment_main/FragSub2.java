package rain2002kr.techworld.myautosmssender_ver1.Fragment_main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import rain2002kr.techworld.myautosmssender_ver1.Define_Constant.UC;
import rain2002kr.techworld.myautosmssender_ver1.MainActivity;
import rain2002kr.techworld.myautosmssender_ver1.R;
import rain2002kr.techworld.myautosmssender_ver1.Tel_Item.telItem;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class FragSub2 extends Fragment {
    MainActivity mainActivity;
    Button homebtn,sub1btn,sub2btn,sub3btn,sub4btn;
    RecyclerView recycler1;
    recyclerAdpater adpater;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach( context );
        mainActivity = (MainActivity) getActivity();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate( R.layout.frag_sub2,container,false );


        recycler1 = (RecyclerView) view.findViewById( R.id.recycler1 );
        recycler1.setLayoutManager( new LinearLayoutManager( getContext() ) );
        adpater = new recyclerAdpater();

        adpater.addItem( new telItem( R.drawable.ic_launcher_foreground,"name","phone" ) );
        adpater.addItem( new telItem( R.drawable.ic_launcher_foreground,"name1","phone" ) );
        adpater.addItem( new telItem( R.drawable.ic_launcher_foreground,"name2","phone" ) );
        adpater.addItem( new telItem( R.drawable.ic_launcher_foreground,"name3","phone" ) );
        adpater.addItem( new telItem( R.drawable.ic_launcher_foreground,"name4","phone" ) );

        recycler1.setAdapter( adpater );
        return view;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
    class recyclerAdpater extends RecyclerView.Adapter<recyclerAdpater.ViewHolder> {
        ArrayList<telItem> items = new ArrayList<telItem>(  );
        public void addItem(telItem item){
            items.add( item );


        }
        public class ViewHolder extends RecyclerView.ViewHolder{
            EditText editName,editPhone;
            ImageView imageView;


            public ViewHolder(@NonNull View itemView) {
                super( itemView );
                imageView = itemView.findViewById( R.id.imageView );
                editName = itemView.findViewById( R.id.editText );
                editPhone = itemView.findViewById( R.id.editText2 );

            }
        }


        @NonNull
        @Override
        public recyclerAdpater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( LAYOUT_INFLATER_SERVICE );
            View view = inflater.inflate( R.layout.tellist, parent, false );
            recyclerAdpater.ViewHolder vh = new recyclerAdpater.ViewHolder( view );

            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull recyclerAdpater.ViewHolder holder, int position) {
            telItem item = items.get( position );
            holder.imageView.setImageResource( item.getResId() );
            holder.editPhone.setText( item.getPhone() );
            holder.editName.setText( item.getName() );

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

}
