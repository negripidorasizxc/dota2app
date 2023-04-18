package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class GuideActivity extends AppCompatActivity {
    Button btn;

    private String[][] packages =
            {
                    {"Package 1 :  Советы, ", "", "", "", "322"},
                    {"Package 2 :  Фарм, ", "", "", "", "322"},
                    {"Package 3 :  Вардинг, ", "", "", "", "322"},
                    {"Package 4 :  Слэнг, ", "", "", "", "322"},
                    {"Package 5 :  Роли героев, ", "", "", "", "322"},
            };
    private String[] package_details = {
            "Фарм\n" +
                    "Complete \n" +
                    "viggers \n" +
                    "siggers \n" +
                    "viggers \n" +
                    "siggers \n" +
                    "siggers \n" +
                    "liver func test",
            "Фарм",
            "Вардинг",
            "Слэнг",
            "complete \n" +
                    "Complete \n" +
                    "viggers \n" +
                    "siggers \n" +
                    "viggers \n" +
                    "viggers \n" +
                    "siggers",

    };
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        listView = findViewById(R.id.listViewLT);


        btn = findViewById(R.id.buttonGuideBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuideActivity.this,HomeActivity.class));
            }

        });

        list = new ArrayList();
        for (int i=0;i<packages.length;i++){
            item = new HashMap<String, String>();
            item.put("line 1", packages[i][0]);
            item.put("line 2", packages[i][1]);
            item.put("line 3", packages[i][2]);
            item.put("line 4", packages[i][3]);
            item.put("line 5", "total cost"+packages[i][4]+"/-");
            list.add(item);

        }

        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String [] {"line 1","line 2","line 3","line 4","line 5",},
                new int[] {R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e});
        listView.setAdapter(sa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(GuideActivity.this,DetailsActivity.class);
                it.putExtra("text1",packages[i][0]);
                it.putExtra("text2",package_details[i]);
                it.putExtra("text3",packages[i][4]);
                startActivity(it);
            }
        });
    }
}