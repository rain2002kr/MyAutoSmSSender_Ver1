package rain2002kr.techworld.myautosmssender_ver1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import rain2002kr.techworld.myautosmssender_ver1.Define_Constant.UC;
import rain2002kr.techworld.myautosmssender_ver1.Fragment_main.FragMain;
import rain2002kr.techworld.myautosmssender_ver1.Fragment_main.FragSub1;
import rain2002kr.techworld.myautosmssender_ver1.Fragment_main.FragSub2;
import rain2002kr.techworld.myautosmssender_ver1.Fragment_main.FragSub3;
import rain2002kr.techworld.myautosmssender_ver1.Fragment_main.FragSub4;
import rain2002kr.techworld.myautosmssender_ver1.Tel_Item.Frag_Tel_Item;

public class MainActivity extends AppCompatActivity {

    FragMain fragMain;
    FragSub1 fragSub1;
    FragSub2 fragSub2;
    FragSub3 fragSub3;
    FragSub4 fragSub4;
    Frag_Tel_Item fragTelItem;

    FragmentManager manager;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       getMenuInflater().inflate( R.menu.main_menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();
        switch (curId){
            case R.id.refresh:
                Toast.makeText( getApplicationContext(), "새로고침 메뉴 선택됨",Toast.LENGTH_LONG ).show();
                break;
            case R.id.home:
                Toast.makeText( getApplicationContext(), "홈 메뉴 선택됨",Toast.LENGTH_LONG ).show();
                manager.beginTransaction().replace( R.id.container,fragMain ).commit();
                break;
            case R.id.serch:
                Toast.makeText( getApplicationContext(), "검색 메뉴 선택됨",Toast.LENGTH_LONG ).show();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected( item );
    }

    //TODO (1) onCreateView
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        fragMain = new FragMain();
        fragSub1 = new FragSub1();
        fragSub2 = new FragSub2();
        fragSub3 = new FragSub3();
        fragSub4 = new FragSub4();
        fragTelItem = new Frag_Tel_Item();

        manager = getSupportFragmentManager();
        manager.beginTransaction().replace( R.id.container, fragMain).commit();

        //ActionBar abar = getSupportActionBar();
        //abar.hide();

    }

    private void getSupportActionBar(Toolbar toolbar) {
    }



    public void setFragchange(int index){
        switch (index){
            case UC.FRAG_SCR_MAIN :
                manager.beginTransaction().replace( R.id.container,fragMain ).commit();
                break;
            case UC.FRAG_SCR_SUB1:
                manager.beginTransaction().replace( R.id.container,fragSub1 ).commit();
                break;
            case UC.FRAG_SCR_SUB2:
                manager.beginTransaction().replace( R.id.container,fragSub2 ).commit();
                break;
            case UC.FRAG_SCR_SUB3:
                manager.beginTransaction().replace( R.id.container,fragSub3 ).commit();
                break;
            case UC.FRAG_SCR_SUB4:
                manager.beginTransaction().replace( R.id.container,fragSub4 ).commit();
                break;

        }

    }
}
