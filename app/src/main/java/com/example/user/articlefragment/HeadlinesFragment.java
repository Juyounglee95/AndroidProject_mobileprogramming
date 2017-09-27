package com.example.user.articlefragment;

import android.app.Activity;
import android.support.v4.app.ListFragment;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by user on 2017-09-20.
 */

public class HeadlinesFragment extends ListFragment {
    OnHeadlineSelectedListener mCallback;
    public interface OnHeadlineSelectedListener{
        public void onArticleSelected(int position);
    }
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try{
            mCallback = (OnHeadlineSelectedListener)activity;


        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+"must implement onHeadlineSeletedListner");
        }
    }
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        int layout = Build.VERSION.SDK_INT>= Build.VERSION_CODES.HONEYCOMB?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_expandable_list_item_1;
        ListAdapter adapter = new ArrayAdapter<String>(getActivity(), layout, Ipsum.Headlines);
        setListAdapter(adapter);

    }
   public void onListItemClick(ListView l, View v, int position, long id)
   {
       mCallback.onArticleSelected(position);
       getListView().setItemChecked(position,true);

   }
}
