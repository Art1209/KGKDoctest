package ru.albutov.kgkdoctest.views.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import ru.albutov.kgkdoctest.R;
import ru.albutov.kgkdoctest.views.activities.PortFragmentContainerActivity;


public class MapFragment extends Fragment {
    Button btn1, btn2, btn3,btn4,btn5,btn6;
    Button[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6};
    int itemIndex = 0;
    int i;
    Activity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_map, container, false);
        initViews(view);
        initBtnsBehaviour();
        return view;
    }
    private void initBtnsBehaviour() {
        //// TODO: 01.06.2017 вылетает null надо проверить и сделать в цикле
//        for (i=0; i<getResources().getStringArray(R.array.buttons).length; i++){
//           buttons[i]. setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View v) {
//                   buttons[i].setBackground(getResources().getDrawable(R.drawable.yellow_circle));
//                   AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//                   builder.setMessage(getResources().getStringArray(R.array.buttons)[i]);
//                   builder.setCancelable(true);
//                   builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
//                       @Override
//                       public void onClick(DialogInterface dialog, int which) {
//                           buttons[i].setBackground(getResources().getDrawable(R.drawable.white_circle));
//                           dialog.dismiss(); // Отпускает диалоговое окно
//                       }
//                   });
//                   AlertDialog dialog = builder.create();
//                   dialog.show();
//               }
//           });
//        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setBackground(getResources().getDrawable(R.drawable.yellow_circle));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(getResources().getStringArray(R.array.buttons)[0]);
                builder.setCancelable(true);
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn1.setBackground(getResources().getDrawable(R.drawable.white_circle));
                        dialog.dismiss(); // Отпускает диалоговое окно
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setBackground(getResources().getDrawable(R.drawable.yellow_circle));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(getResources().getStringArray(R.array.buttons)[1]);
                builder.setCancelable(true);
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn2.setBackground(getResources().getDrawable(R.drawable.white_circle));
                        dialog.dismiss(); // Отпускает диалоговое окно
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackground(getResources().getDrawable(R.drawable.yellow_circle));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(getResources().getStringArray(R.array.buttons)[2]);
                builder.setCancelable(true);
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn3.setBackground(getResources().getDrawable(R.drawable.white_circle));
                        dialog.dismiss(); // Отпускает диалоговое окно
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setBackground(getResources().getDrawable(R.drawable.yellow_circle));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(getResources().getStringArray(R.array.buttons)[3]);
                builder.setCancelable(true);
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn4.setBackground(getResources().getDrawable(R.drawable.white_circle));
                        dialog.dismiss(); // Отпускает диалоговое окно
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setBackground(getResources().getDrawable(R.drawable.yellow_circle));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(getResources().getStringArray(R.array.buttons)[4]);
                builder.setCancelable(true);
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn5.setBackground(getResources().getDrawable(R.drawable.white_circle));
                        dialog.dismiss(); // Отпускает диалоговое окно
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setBackground(getResources().getDrawable(R.drawable.yellow_circle));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(getResources().getStringArray(R.array.buttons)[5]);
                builder.setCancelable(true);
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn6.setBackground(getResources().getDrawable(R.drawable.white_circle));
                        dialog.dismiss(); // Отпускает диалоговое окно
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
    public void onBackPressedCircleColorChanger(){ // пока не используется
        for (int i=0; i<getResources().getStringArray(R.array.buttons).length; i++){
            buttons[i].setBackground(getResources().getDrawable(R.drawable.white_circle));
        }
    }

    private void initViews(View view) {
        btn1 = (Button)view.findViewById(R.id.btn1);
        btn2 = (Button)view.findViewById(R.id.btn2);
        btn3 = (Button)view.findViewById(R.id.btn3);
        btn4 = (Button)view.findViewById(R.id.btn4);
        btn5 = (Button)view.findViewById(R.id.btn5);
        btn6 = (Button)view.findViewById(R.id.btn6);

    }
    public static void setFragment(int index, Activity activity){
        MapFragment fragment = new MapFragment();
        fragment.setItemIndex(index);
        fragment.activity=activity;
        android.app.FragmentTransaction trans = activity.getFragmentManager().beginTransaction();
        trans.replace(R.id.fragment , fragment);
        trans.commit();
    }

    private void setItemIndex(int index) {
        this.itemIndex=index;
    }
}
