package ru.albutov.kgkdoctest.views.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.albutov.kgkdoctest.R;
import ru.albutov.kgkdoctest.views.fragments.DescriptionFragment;
import ru.albutov.kgkdoctest.views.fragments.MapFragment;

public class PortFragmentContainerActivity extends AppCompatActivity {
    Fragment descriptionFragment;
    int index;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_port_fragment_container);
        initViews();
        index = getIntent().getIntExtra("index",0);
        setFragment(index);
    }

    private void setFragment(int index) {
        if (index==2){
            MapFragment.setFragment(index, this);
        }else {
            DescriptionFragment.setFragment(index, this);
        }
    }

    private void initViews() {
    }

    public static void openActivity(int itemIndex , Activity activity) {
        Intent intent  = new Intent(activity, PortFragmentContainerActivity.class);
        intent.putExtra("index", itemIndex);
        activity.startActivity(intent);
    }
    // // TODO: 01.06.2017 обработать OnBackPressed чтобы изменить цвет кнопки обратно на белый 
//    @Override
//    public void onBackPressed() {
//        if (index==2){
//        }
//        super.onBackPressed();
//    }
}

