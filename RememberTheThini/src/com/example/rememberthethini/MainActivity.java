package com.example.rememberthethini;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {
	private List<ItemsList> myItems = new ArrayList<ItemsList>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        populateTaskList();
        populateListView();
    }


	private void populateTaskList() {
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
		myItems.add(new ItemsList("tamar", false));
	}

	private void populateListView() {
		ArrayAdapter<ItemsList> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.myListView);
		list.setAdapter(adapter);
	}
	
	private class MyListAdapter extends ArrayAdapter<ItemsList>{
		
		public MyListAdapter(){
			
			super(MainActivity.this, R.layout.list_view_item, myItems);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View itemView = convertView;
			
			//make sure we have a view to work with
			if(itemView == null){
				itemView = getLayoutInflater().inflate(R.layout.list_view_item, parent, false);
				
			}
			
			//find an Item to work with
			ItemsList currItem = myItems.get(position);
			
			//fill the view
			return itemView;
		}
		
	}

}
