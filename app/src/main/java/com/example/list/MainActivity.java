package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] formulas = {"Рассчет амортизационных отчислений", "Фондоотдача",
                "Фондоемкость", "Фондовооруженность", "Среднегодовая стоимость основных средств",
        "Норматив оборотных средств", "Оборачиваемость", "Коэффициент загрузки", "Трудоемкость",
        "Выработка"}; // список формул

        ListView listView = findViewById(R.id.list);
        TextView selection = findViewById(R.id.selection);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, formulas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View itemClicked, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", ((TextView)itemClicked).getText()+".html");
                startActivity(intent);
            }});
    }
}