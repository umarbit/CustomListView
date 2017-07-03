package com.example.umar.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    int [] IMAGES = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3};

    String [] NAMES = {"Appetizers", "Speciality Pizzas", "Drinks" };

    String [] DESCRIPTIONS = {"Get Your Taste buds started", "All you can eat", "Specially for you"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView ListView= (ListView)findViewById(R.id.ListView);

        CustomAdapter customerAdapter = new CustomAdapter();

        ListView.setAdapter(customerAdapter);

    }
    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);

          ;
            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView);
            TextView textView_name = (TextView) convertView.findViewById(R.id.textView_name);
            TextView textView_description = (TextView) convertView.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_description.setText(DESCRIPTIONS[position]);

            return convertView;
        }
    }
}
