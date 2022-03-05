package com.akbar.rumahadatuas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akbar.rumahadatuas.ModalData.ModelData;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.DataViewHolder> {
    private ArrayList<ModelData> DataRumahAdat;

    public AdapterData(ArrayList<ModelData> dataRumahAdat) {
        DataRumahAdat = dataRumahAdat;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        ModelData data = DataRumahAdat.get(position);

        holder.nama.setText(data.getNama());
        holder.tentang.setText(data.getTentang());
        Glide.with(holder.itemView.getContext())
                .load(data.getUrl())
                .apply(new RequestOptions().override(450, 225))
                .into(holder.url);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = DataRumahAdat.get(holder.getAdapterPosition()).getNama();
                String tentang = DataRumahAdat.get(holder.getAdapterPosition()).getTentang();
                String url = DataRumahAdat.get(holder.getAdapterPosition()).getUrl();

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("nama",nama);
                intent.putExtra("tentang",tentang);
                intent.putExtra("gambar",url);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return DataRumahAdat.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder{
        ImageView url;
        TextView nama, tentang;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tv_nama);
            tentang = itemView.findViewById(R.id.tv_tentang);
            url = itemView.findViewById(R.id.iv_url);
        }
    }
}
