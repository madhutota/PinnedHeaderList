package bornbaby.com.pinnedheaderlist;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import bornbaby.com.pinnedheaderlist.helper.PinnedHeaderListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inItUI();
    }

    private void inItUI() {

        PinnedHeaderListView pinned_header_list_view = findViewById(R.id.pinned_header_list_view);


        LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout header1 = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        ((TextView) header1.findViewById(R.id.textItem)).setText("HEADER 1");
        LinearLayout header2 = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        ((TextView) header2.findViewById(R.id.textItem)).setText("HEADER 2");
        LinearLayout footer = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        ((TextView) footer.findViewById(R.id.textItem)).setText("FOOTER");
       /* pinned_header_list_view.addHeaderView(header1);
        pinned_header_list_view.addHeaderView(header2);*/
        pinned_header_list_view.addFooterView(footer);
        TestSectionedAdapter sectionedAdapter = new TestSectionedAdapter();
        pinned_header_list_view.setAdapter(sectionedAdapter);
    }
}
