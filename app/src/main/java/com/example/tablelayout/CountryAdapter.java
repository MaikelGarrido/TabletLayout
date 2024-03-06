package com.example.tablelayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    Context context;

    List<Country> countryList;

    private final OnItemClickListener listener;

    int selectedPosition = -1;

    public CountryAdapter(Context context, List<Country> countryList, OnItemClickListener listener) {
        this.context = context;
        this.countryList = countryList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        if (countryList != null && !countryList.isEmpty()) {
            Country country = countryList.get(position); // Pais

            holder.operador.setText(country.getsName()); // Operador
            holder.plan.setText(country.getsISOCode()); // Plan

            holder.checkBox.setOnClickListener(view -> {
                listener.onItemClick(country);
                selectedPosition = holder.getAdapterPosition();
                notifyDataSetChanged();
            });

            holder.checkBox.setChecked(selectedPosition == position);

        } else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;
        TextView operador, plan, cargo_fijo, datos_movil, minutos_plan;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.check_box);
            operador = itemView.findViewById(R.id.operador);
            plan = itemView.findViewById(R.id.plan);
            cargo_fijo = itemView.findViewById(R.id.cargo_fijo);
            datos_movil = itemView.findViewById(R.id.datos_movil);
            minutos_plan = itemView.findViewById(R.id.minutos_plan);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Country country);
    }

}
