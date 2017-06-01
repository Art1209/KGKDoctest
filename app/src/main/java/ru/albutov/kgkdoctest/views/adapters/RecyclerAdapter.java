package ru.albutov.kgkdoctest.views.adapters;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.albutov.kgkdoctest.R;
import ru.albutov.kgkdoctest.views.activities.PortFragmentContainerActivity;
import ru.albutov.kgkdoctest.views.fragments.DescriptionFragment;
import ru.albutov.kgkdoctest.views.fragments.MapFragment;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ListHolder> {
    Activity activity;

    public RecyclerAdapter(Activity activity) {
        this.activity = activity;
    }
    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_line, parent, false);
        return new ListHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListHolder holder, int position) {
        String sortedString;
        if (activity.getResources().getStringArray(R.array.content_strings)[position].startsWith("LVL-2_")){ //Плохая реализация обработки строкового ресурса (ищем подуровни меню)
            sortedString = activity.getResources().getStringArray(R.array.content_strings)[position].substring (6); //Строки которые являются подпунктами меню начинаются с префикса LVL-2_
            holder.lineStartPoint.setImageResource(R.drawable.ic_label_outline_black_24dp);
            holder.contentName.setTextColor(activity.getResources().getColor(R.color.secondary_text_color));
            holder.contentName.setTextSize(TypedValue.COMPLEX_UNIT_PX, activity.getResources().getDimension(R.dimen.small_text_size));
        } else {
            sortedString = activity.getResources().getStringArray(R.array.content_strings)[position];
            holder.lineStartPoint.setImageResource(R.drawable.ic_label_black_24dp);
        }
        holder.contentName.setText(sortedString);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                   setFragment(holder.getAdapterPosition());
                }
                if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    PortFragmentContainerActivity.openActivity(holder.getAdapterPosition(), activity);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return activity.getResources().getStringArray(R.array.content_strings_text).length;
    }

    public class ListHolder extends RecyclerView.ViewHolder{
        TextView contentName;
        ImageView lineStartPoint;
        public ListHolder(View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            contentName = (TextView) itemView.findViewById(R.id.recycler_line_text);
            lineStartPoint = (ImageView) itemView.findViewById(R.id.recycler_line_image);
        }
    }
    private void setFragment(int index) {
        if (index==2){
            MapFragment.setFragment(index, activity);
        }else {
            DescriptionFragment.setFragment(index, activity);
        }
    }
}
