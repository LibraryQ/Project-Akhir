package com.dicoding.picodiploma.mylibraryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBookAdapter extends RecyclerView.Adapter<ListBookAdapter.ListViewHolder> {
    private ArrayList<Book> listBook;

    public ListBookAdapter(ArrayList<Book> list) {
        this.listBook = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_book, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Book book = listBook.get(position);

        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvBook.setText(book.getBook());
        holder.tvAuthor.setText(book.getAuthor());
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvBook, tvAuthor;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvBook = itemView.findViewById(R.id.tv_item_book);
            tvAuthor = itemView.findViewById(R.id.tv_item_author);
        }
    }
}