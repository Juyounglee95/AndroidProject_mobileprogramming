package com.example.user.articlefragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 2017-09-20.
 */

public class ArticleFragment extends Fragment {
    final static String ARG_POSITION="position";
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.article_view, container, false);
    }
}
