package bornbaby.com.pinnedheaderlist.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.pinnedlistview.SearchablePinnedHeaderListViewAdapter;

import java.util.ArrayList;

/**
 * Created by madhu on 02-Dec-17.
 */

public class SamplePinnedAdapter extends SearchablePinnedHeaderListViewAdapter {
    @Override
    public boolean doFilter(Object o, CharSequence charSequence) {
        return false;
    }

    @Override
    public ArrayList getOriginalList() {
        return null;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
