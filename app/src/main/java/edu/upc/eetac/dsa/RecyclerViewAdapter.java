package edu.upc.eetac.dsa;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<Element> data;

    public void addElements(List<Element> listElements) {
        data.addAll(listElements);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout constraintLayout;
        private TextView nomMunicipiView;
        private TextView ineMunicipiView;
        private ImageView escutMuncipi;

        public ViewHolder(View v) {
            super(v);
            constraintLayout = v.findViewById(R.id.constraintLayout);
            nomMunicipiView = v.findViewById(R.id.municipiName);
            ineMunicipiView = v.findViewById(R.id.ineName);
            escutMuncipi = v.findViewById(R.id.escutMunicipi);
        }
    }

    public RecyclerViewAdapter(Context context) {
        this.data = new ArrayList<>();
        this.context = context;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cityItem, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        Element element = data.get(position);
        holder.ineMunicipiView.setText(element.getIne());
        holder.nomMunicipiView.setText(element.getMunicipiNom());
        Picasso.with(context).load(element.getMunicipiEscut()).into(holder.escutMuncipi);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

