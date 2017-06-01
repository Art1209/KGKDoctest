package ru.albutov.kgkdoctest.views.activities;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import ru.albutov.kgkdoctest.R;
import ru.albutov.kgkdoctest.views.fragments.DescriptionFragment;
import ru.albutov.kgkdoctest.views.adapters.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        initViews();
        setRecycler();
        setFragment(0);
    }

    private void setRecycler() {
        RecyclerAdapter recadapter = new RecyclerAdapter(this);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rec.setLayoutManager(manager);
        rec.setAdapter(recadapter);
    }

    private void initViews() {
        rec = (RecyclerView) findViewById(R.id.list);
    }
    private void setFragment(int index){
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            DescriptionFragment.setFragment(index,this);
        }

    }
}
