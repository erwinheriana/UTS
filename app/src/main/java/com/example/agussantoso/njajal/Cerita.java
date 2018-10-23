package com.example.agussantoso.njajal;

public class Cerita {
    private String judul_cerita;
    private String nama_pengarang;
    private String nama_editor;
    private String isi;



    public static final Cerita[] resepmakanan= {
            new Cerita("Salah Tempat", "Pengarang : Khonita Fitri","Editor : Nurul Aprilianti",
                    "Suatu hari ada seorang ibu yang tergesa-gesa masuk ke suatu ruangan. Dengan paniknya ia berkata, “Dokter….dokter! Saya butuh kacamata!”\n" +
                            "Orang-orang yang melihatnya pun panik. Lalu seorang pria mendekatinya sambil berkata, “Pasti bu. Ibu memang butuh kacamata. Ini adalah tempat cukur rambut.”\n"),
            new Cerita("YOGA???", "Pengarang : Tak dikenal","Editor : Orang gak jelas",
                    "Istri : “Aku boleh ikut yoga?”\n" +
                            "Suami : “Boleh, terserah kamu aja, kalau itu bermanfaat untuk kesehatanmu”\n" +
                            "Kemudian mereka bercerai karena si istri  lebih memilih ikut Yoga, selingkuhannya.\n"),
            new Cerita("Cari Cowok Setia", "Pengarang : Tak dikenal","Editor : Orang gak jelas",
                    "Nisa - nur... Nyari cowok yang setia itu zaman sekarang susah ya...?\n" +
                            "Nuri - ada ko kamu aja yang gak tahu..?\n" +
                            "Nisa - kaya gimana.-?\n" +
                            "Nuri - coba aja kamu cari cowok yang sudah ngejomblo selama 3 tahun ???\n" +
                            "Nisa - emang kalau jomblo sudah 3tahun di jamin setia gitu ..?\n" +
                            "Nuri - ya iyalah dia cari pacar saja susah apalagi selingkuh ...?\n"),
            new Cerita("Perampokan", "Pengarang : Tak dikenal","Editor : Orang gak jelas",
                    "wartawan ~ ini kejadian sekitar jam berapa pak ..?\n" +
                            "polisi ~ kejadian di perkiraan jam 1 malam  wartawan ~ kasus apa pak ?\n" +
                            "polisi ~ belum di ketahui , korban pingsan dan hanya di temukan celana dalam saja ...?\n" +
                            "wartawan ~ kira -kira motifnya ap pak ?\n" +
                            "polisi ~ kira kira motifnya kembang-kembang ada rendanya .... \n"),
            new Cerita("HP ku yang China", "Pengarang : Tak dikenal","Editor : Orang gak jelas",
                    "Bowet  :\"ci entar imlek kerumah saya ya ...?\n" +
                            "Ci amoy  :\"ok wet  .you open house ya?\n" +
                            "Bowet  :\"iya ci..kan setaun skali...\"\n" +
                            "Ci amoy :\"ngomong2...si¬¬¬apa yg cina? Bapak ato Ibu mu??\"\n" +
                            "Bowet . : bukan!!!?\n" +
                            "Ci amoy. : trus spaaa...???\n" +
                            "Bowet :\"HP ku ci... :P \"\n" +
                            "Ci amoy : @##@#@#@#@@#@##@\n"),
            new Cerita("Ujian di Tunda", "Pengarang : Tak dikenal","Editor : Orang gak jelas",
                    "guru ~ saya perhatikan kamu dari tadi kok lesu banget \"kamu ngantuk ya ?\n" +
                            "murid ~ maaf pak saya semalem gak bisa tidur pak , makanya saya lesu banget dan ngantux .\n" +
                            "guru ~ kalau begitu khusus buat kamu ujian di tunda minggu depan saja ?\n" +
                            "murid ~ kenapa emangnya pak , kenapa di tunda ?\n" +
                            "guru ~ untuk tidur saja kamu gak bisa apalagi untuk mengerjakan soal ujian ?\n" +
                            "murid ~ @#@##@@@###@#@##@\n"),



    };

    private Cerita(String judul_cerita, String nama_pengarang, String nama_editor, String isi){
        this.judul_cerita = judul_cerita;
        this.nama_pengarang = nama_pengarang;
        this.nama_editor = nama_editor;
        this.isi = isi;

    }

    public String getIsi() {
        return isi;
    }

    public String getNama_pengarang() {
        return nama_pengarang;
    }

    public String getNama_editor() {
        return nama_editor;
    }

    public String getJudul_cerita() {
        return judul_cerita;
    }
    public String toString() {
        return this.judul_cerita;
    }
}
