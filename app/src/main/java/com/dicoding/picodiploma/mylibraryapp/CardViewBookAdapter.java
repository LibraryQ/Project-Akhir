package com.dicoding.picodiploma.mylibraryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewBookAdapter extends RecyclerView.Adapter<CardViewBookAdapter.CardViewViewHolder> {
    private ArrayList<Book> listBook;

    public CardViewBookAdapter(ArrayList<Book> list) {
        this.listBook = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_book, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Book book = listBook.get(position);

        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvBook.setText(book.getBook());
        holder.tvAuthor.setText(book.getAuthor());
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " + listBook.get(holder.getAdapterPosition()).getBook(), Toast.LENGTH_SHORT).show();
            }

        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Pinjam " + listBook.get(holder.getAdapterPosition()).getBook(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvBook, tvAuthor;
        Button btnFavorite, btnShare;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvBook = itemView.findViewById(R.id.tv_item_book);
            tvAuthor = itemView.findViewById(R.id.tv_item_author);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}

