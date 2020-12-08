package com.dicoding.picodiploma.mylibraryapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoveActivity extends AppCompatActivity {
    private RecyclerView rvBooks;
    private ArrayList<Book> list = new ArrayList<>();
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        rvBooks = findViewById(R.id.rv_books);
        rvBooks.setHasFixedSize(true);
        list.addAll(BooksData.getListData());
        showRecyclerList();
        setActionBarTitle(title);
    }

    private void showRecyclerList() {
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBooks.setAdapter(listBookAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Selamat Datang";
                setActionBarTitle(title);
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Tersedia Berbagai Macam Buku";
                setActionBarTitle(title);
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Pilih Buku Sesuai Keinginan Anda";
                setActionBarTitle(title);
                showRecyclerCardView();
                break;

        }
    }

    private void showRecyclerGrid() {
        rvBooks.setLayoutManager(new GridLayoutManager(this, 2));
        GridBookAdapter gridBookAdapter = new GridBookAdapter(list);
        rvBooks.setAdapter(gridBookAdapter);
    }

    private void showRecyclerCardView() {
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        CardViewBookAdapter cardViewBookAdapter = new CardViewBookAdapter(list);
        rvBooks.setAdapter(cardViewBookAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}