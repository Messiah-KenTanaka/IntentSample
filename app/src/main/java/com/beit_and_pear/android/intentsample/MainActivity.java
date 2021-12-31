package com.beit_and_pear.android.intentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMenu = findViewById(R.id.lvMenu);
        List<Map<String, String>> menuList = new ArrayList<>();
        Map<String, String> menu = new HashMap<>();

        menu.put("name", "唐揚げ定食");
        menu.put("price", "800円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "900円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "人間定食");
        menu.put("price", "10000円");
        menuList.add(menu);

        String[] form = {"name", "price"};
        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, menuList, android.R.layout.simple_list_item_2, form, to);
        lvMenu.setAdapter(adapter);

        // リストタップのリスナクラス登録
        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Map<String, String> item = (Map<String, String>) parent.getItemAtPosition(position);
            String menuName = item.get("name");
            String menuPrice = item.get("price");

            Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
            intent.putExtra("menuName", menuName);
            intent.putExtra("menuPrice", menuPrice);

            startActivity(intent);
        }
    }
}