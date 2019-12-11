package rain2002kr.techworld.myautosmssender_ver1.Tel_Item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import rain2002kr.techworld.myautosmssender_ver1.R;

public class Tel_ItemView extends LinearLayout {
    public Tel_ItemView(Context context) {
        super( context );
        init(context);
    }

    public Tel_ItemView(Context context, @Nullable AttributeSet attrs) {
        super( context, attrs );
        init(context);
    }
    private void init (Context context){
       // LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
     //   inflater.inflate( R.layout.tellist, this, true );
;

    }
}
