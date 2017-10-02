package cn.edu.gdmec.android.sampleadapter;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewone extends ListActivity {
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_list_viewone );
        SimpleAdapter adapter=new SimpleAdapter ( this, getData (), R.layout.info, new String[]{"name", "phone", "img"}, new int[]{R.id.name, R.id.phone, R.id.img} );
        setListAdapter ( adapter );
    }
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "凝墨");
        map.put("phone", "13699782346");
        map.put("img", R.drawable.pic1);
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "小棕");
        map.put("phone", "15899034671");
        map.put("img", R.drawable.pic2);
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "花郎");
        map.put("phone", "18677656526");
        map.put("img", R.drawable.pic3);
        list.add(map);
        return list;
    }

//        另一种
//        ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String, String>> ();
//        HashMap<String, String> map1=new HashMap<String, String> ();
//        HashMap<String, String> map2=new HashMap<String, String> ();
//        HashMap<String, String> map3=new HashMap<String, String> ();
//        map1.put ( "name", "凝墨" );
//        map1.put ( "phone", "13699452790" );
//        map2.put ( "name", "小棕" );
//        map2.put ( "phone", "15827980910" );
//        map3.put ( "name", "花郎" );
//        map3.put ( "phone", "18678091166" );
//
//        list.add ( map1 );
//        list.add ( map2 );
//        list.add ( map3 );
//        SimpleAdapter listAdapter=new SimpleAdapter ( this, list, R.layout.info, new String[]{"name", "phone"}, new int[]{R.id.name, R.id.phone} );
//        setListAdapter( listAdapter );
//    }
//
//    protected void onListItemClick(ListView l, View v, int position, long id){
//        super.onListItemClick(l,v,position,id);
//        if (l.getItemIdAtPosition(position)==0)
//        {
//            toast.makeText(getApplicationContext(), "我是凝墨", Toast.LENGTH_SHORT).show();
//        }else if(l.getItemIdAtPosition(position)==1)
//        {
//            toast.makeText(getApplicationContext(), "我是小棕", Toast.LENGTH_SHORT).show();
//        }else if(l.getItemIdAtPosition(position)==2)
//        {
//            toast.makeText(getApplicationContext(), "我是花郎", Toast.LENGTH_SHORT).show();
//        }
//    }
}
