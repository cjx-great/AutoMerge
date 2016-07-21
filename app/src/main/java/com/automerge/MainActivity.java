package com.automerge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView = null;
    private ArrayAdapter<String> adapter = null;
    private String[] data = {"武汉1","武汉2","武汉3"};

    private MultiAutoCompleteTextView multiAutoCompleteTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto);

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        autoCompleteTextView.setAdapter(adapter);

        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.mul);
        //设置","分隔符实现多次匹配(发邮件)
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(adapter);
    }
}
