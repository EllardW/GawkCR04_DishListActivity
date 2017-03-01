package com.example.dralle.gawkcr04_dishlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DishList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_list);

        getRestaurantName();
        getDishes();
    }

    //Get and display the selected restaurant name.
    private void getRestaurantName(){


    }

    private void getDishes(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, DishData.retrieveData());

        ListView dishList = (ListView) findViewById(R.id.dish_list);
        dishList.setAdapter(adapter);

        dishList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Log.d("onClick" , parent.toString());
                Log.d("onClick" , v.toString());
                Log.d("onClick" , Integer.toString(position));
                Log.d("onClick" , Long.toString(id));

                showDishForm(v);
            }

        });

    }

    //call to move to the Dish Data Form
    private void showDishForm(View View){

        Intent intent = new Intent(this, DishForm.class);
        startActivity(intent);
    }
}
