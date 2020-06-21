package com.tscovid19project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tscovid19project.Models.Meals;
import com.tscovid19project.R;

import java.util.List;

public class MealsAdapter extends RecyclerView.Adapter<MealsAdapter.ImageViewHolder> {

    private Context mContext;
    private List<Meals> mMeals;

    public MealsAdapter(Context context, List<Meals> list) {
        mContext = context;
        mMeals = list;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_meals, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {

        final Meals meals = mMeals.get(position);

        holder.Name.setText(meals.getSno()+". "+meals.getName());
        holder.Meals.setText(meals.getMeals());
    }

    @Override
    public int getItemCount() {
        return mMeals.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView Name, Meals;
        public ImageViewHolder(View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.name);
            Meals = itemView.findViewById(R.id.meals);
        }
    }

}