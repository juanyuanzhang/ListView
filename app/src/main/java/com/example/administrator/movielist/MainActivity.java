package com.example.administrator.movielist;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list ;
    ArrayList<MovieList> movielist = null ;
    MovieAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= (ListView) findViewById (R.id.movielist);

        movielist = new ArrayList<MovieList>();    // 建立一個ArrayList  物件型態為Class MovieList   //下方將資料加入ArrayList
        movielist.add(new MovieList(R.mipmap.conon , "名偵探柯南：純黑的惡夢","2016-07-26","★20週年大作，製作成本創新高★原作者青山剛昌親自參與劇本製作工作"));
        movielist.add(new MovieList(R.mipmap.jason , "神鬼認證：傑森包恩","2016-07-25","麥特戴蒙強勢回歸他最具代表性的主角傑森包恩..."));
        movielist.add(new MovieList(R.mipmap.beautifulday , "最酷的一天","2016-07-27","以莫札特作為人生目標，卻苦無成名契機的古怪鋼琴家小安（馬提亞斯史維克福 飾..."));
        movielist.add(new MovieList(R.mipmap.summer ,"夏日情事","2016-07-25","莎夏在柏林意外離世，讓男友勞倫斯與柔伊兩人頓失了一位情人和一位姊姊..."));
        movielist.add(new MovieList(R.mipmap.viva , "變裝皇后萬萬歲","2016-07-25","★2016台北電影節 ★2016美國奧斯卡獎最佳外語片提名決選.."));
        adapter = new MovieAdapter(MainActivity.this,movielist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"電影簡介："+ movielist.get(position).getIntro(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}
