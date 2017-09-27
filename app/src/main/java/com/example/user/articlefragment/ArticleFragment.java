package com.example.user.articlefragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 2017-09-20.
 */

public class ArticleFragment extends Fragment {
    final static String ARG_POSITION="position";
    int mCurrentPosition= -1;
    public void onStart(){
        super.onStart();
        Bundle args = getArguments();
        if(args!= null){
            updateArticleView(args.getInt(ARG_POSITION));

        }else if(mCurrentPosition!=-1)
        {
            updateArticleView(mCurrentPosition);
        }

    }
    public void updateArticleView(int position){
        TextView article = (TextView)getActivity().findViewById(R.id.article);
        article.setText(Ipsum.Articles[position]);
        mCurrentPosition=position;
    }
    public void onSaveInstanceState(Bundle outState){

        super.onSaveInstanceState(outState);
        outState.putInt(ARG_POSITION,mCurrentPosition);
    }
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.article_view, container, false);
    }
}
