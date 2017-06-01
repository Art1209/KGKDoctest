package ru.albutov.kgkdoctest.views.fragments;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.albutov.kgkdoctest.R;

public class DescriptionFragment extends Fragment {
    TextView descriptionName, descriptionText;
    int itemIndex = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        initViews(view);
        setName();
        setDescription();
        return view;
    }
//todo Обязательно сделать обертку для строк оглавления, лучше всего реализовать rest запрос к службе и менять список в случае обновления
    //todo android.text.Html.fromHtml устарела, надо добавить флаги
    private void setDescription() {

        // Эта конструкция для поддержки Android N
        Spanned text;
        if (Build.VERSION.SDK_INT >= 24) {
            text = Html.fromHtml(getResources().getStringArray(R.array.content_strings_text)[itemIndex], Html.FROM_HTML_MODE_LEGACY);

        } else {
            text = Html.fromHtml(getResources().getStringArray(R.array.content_strings_text)[itemIndex]);
        }
        descriptionText.setText(text);
        System.out.println(text);
    }

    private void setName() {
        descriptionName.setText(getResources().getStringArray(R.array.content_strings)[itemIndex].replaceFirst("LVL-2_", ""));
    }

    private void initViews(View view) {
        descriptionName = (TextView) view.findViewById(R.id.description_name);
        descriptionText = (TextView) view.findViewById(R.id.description_text);

    }
    public static void setFragment(int index, Activity activity){
        DescriptionFragment fragment = new DescriptionFragment();
        fragment.setItemIndex(index);
        android.app.FragmentTransaction trans = activity.getFragmentManager().beginTransaction();
        trans.replace(R.id.fragment , fragment);
        trans.commit();
    }

    private void setItemIndex(int index) {
        this.itemIndex=index;
    }

}