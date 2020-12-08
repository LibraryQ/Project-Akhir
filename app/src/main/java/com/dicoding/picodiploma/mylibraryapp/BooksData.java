package com.dicoding.picodiploma.mylibraryapp;

import java.util.ArrayList;

public class BooksData {
    public static String[][] data = new String[][]{
            {"Surga yang Harus Kujaga", "Buku yang ditulis oleh Sean Hasyim diterbitkan oleh Euthenia pada tahun 2016 dengan tebal buku 152 halaman. Buku ini bertemakan seorang pria muda yang lebih mementingkan karier dibandingkan pendidikannya dan selalu membantah keinginan ibunya.", "https://3.bp.blogspot.com/-0ilFxnTQERo/WwztzzgiwPI/AAAAAAAAABg/N9_YQFyFfZMxp89YuK-BQ8JDgfKKWPSJgCLcBGAs/s1600/NOVEL.jpeg"},
            {"Senja dan Pagi", "Buku yang diterbitkan oleh Loveable pada tahun 2019 yang ditulis Alffy Rev & Linka Angelia. Buku ini merupakan kisah perjalanan Alffy Rev dan Linka Angelia.Novel ini menceritakan tentang perjalanan cinta mereka yang di awali dengan pertemuan dua pribadi yang berbeda namun memiliki mimpi yang sama.", "https://www.gramedia.com/blog/content/images/2019/06/senja-dan-pagi.jpg"},
            {"Rentang Kisah", "Rentang kisah adalah buku pertama yang ditulis oleh seorang blogger, youtuber, serta influencer yang banyak menginspirasi anak muda di Indonesia dengan kisah kisah yang sangat menarik.  Dibuku ini juga diceritakan kisah Gita Savitri mulai dari kehidupannya yang selalu dikekang oleh orang tuanya sampai menjadi seorang blogger, youtuber serta influencer yang sukses seperti saat ini.", "https://www.gramedia.com/blog/content/images/2018/12/Rentang-Kisah.jpg"},
            {"Kata", "Buku yang ditulis oleh Nadhifa Allya Tsana diterbitkan oleh Gagas Media pada tahun 2018 dengan tebal buku 389 halaman. Kata bercerita tentang kehidupan seorang gadis bernama Binta, seorang mahasiswi ilmu komunikasi kupu-kupu (kuliah-pulang-kuliah-pulang) yang memiliki sifat keras kepala, suka menyendiri, tidak mudah bergaul, dan sulit untuk berkomunikasi dengan orang lain.", "https://www.gramedia.com/blog/content/images/2018/12/Kata-Rintik-Sedu-1.jpg"},
            {"Cantik Itu Luka", "Novel Cantik itu Luka  karya Eka Kurniawan bercerita tentang kehidupan masyarakat Indonesia di zaman penjajahan Belanda, Jepang, dan era-era kemerdekaan di sebuah tempat yaitu Halimunda. Pada novel ini, terdapat kurang lebihnya lima belas tokoh utama yang selalu muncul dan menggerakan cerita dengan alur yang cukup rumit.", "https://www.gramedia.com/blog/content/images/2018/11/Cantik-itu-Luka.jpg"},
            {"Hijabers In Love", "Novel ini menceritakan tentang anak remaja yang terjebak antara cinta dan persahabatannya. Dimana ketika salah satu pemerannya mengalami dilema dengan pilihannya sendiri yang pada akhirnya bisa membuat dirinya menjadi seorang gadis yang tegar dan mendapatkan apa yang ingin dicapainya termasuk cintanya kepada seorang kakak kelas laki-laki yang sudah lama di idolakannya.", "https://images-na.ssl-images-amazon.com/images/I/51eHxK2FjrL.jpg"},
            {"Matt and Mou", "Buku yang ditulis oleh Wulanfadi diterbitkan oleh Gagas Media pada tahun 2016 dengan tebal buku 344 halaman. Matt and Mou bercerita tentang Matt dan Mou yang sudah bersahabat dari kecil. mereka saling memendam rasa tetapi mereka menganggap tidak lebih dari sahabat", "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1476104225l/32528129.jpg"},
            {"Dilan", "Novel yang dituliskan oleh Pidi Baiq ini menceritakan tentang kisah cinta seorang murid baru yang pindah ke Bandung, dia bernama Milea. Pada awalnya Milea tidak peduli, tapi setiap hari cowok itu selalu mengganggu dan mendekati Milea, akhirnya Milea mulai mencaritahu siapa cowok itu.", "https://1.bp.blogspot.com/-an-reTqCDWI/VsWZwYdnYrI/AAAAAAAAAdw/sWB9PHGXvSU/s1600/gsrxhg.jpg"},

    };

    public static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (String[] aData : data) {
            Book book = new Book();
            book.setBook(aData[0]);
            book.setAuthor(aData[1]);
            book.setPhoto(aData[2]);

            list.add(book);
        }

        return list;
    }

}