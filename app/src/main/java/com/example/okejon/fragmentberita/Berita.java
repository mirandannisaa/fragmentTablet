package com.example.okejon.fragmentberita;

public class Berita {
    private String judul_berita;
    private String tanggal;
    private String detail_berita;
    private int gambar;
    private String author;

    public static final Berita[] beritaku = {
            new Berita("Kekeringan, Warga di Blora Gali Dasar Embung untuk Dapatkan Air", "Blora - Kekeringan melanda sejumlah wilayah di Kabupaten Blora, Jawa Tengah. Warga Dusun Jelubang Desa Ngampon, Kecamatan Jepon, Blora terpaksa membuat sebuah lubang di dasar embung yang telah mengering. Mereka menggali tanah untuk membuat sumur gali, sebagai sumber air pada musim kekeringan ini. \n" +
                    "\n" +
                    "Salah seorang warga setempat, Ngasih, mengaku, terdapat air di dalam sumur buatan tersebut. Sumber air itulah yang menjadi satu-satunya sumber air saat ini. \n" +
                    "\n" +
                    "Mereka harus naik turun embung yang sudah mengering, sedalam 8 meter, sedangkan untuk mengambil air di dalam sumur galian itu, warga juga harus ekstra hati-hati, karena dibuat tanpa adanya alat pengaman.\n" +
                    "\n" +
                    "\"Biasanya kalau ambil air ya pas pagi atau sore hari, kalau siang seperti ini ya panas. Ini airnya ya buat mandi, mencuci, buat ngombor ternak juga. Tapi kalau terpaksa ya buat masak juga tapi prosesnya ya lebih lama,\" kata Ngasih saat ditemui, Senin (1/9/18).\n" +
                    "Baca juga: Pemprov Jateng Kirim Dokter Spesialis ke Palu dan Donggala\n" +
                    "\n" +
                    "Warga lainnya, Sumadi mengakui, warga juga menggali beberapa sumur galian di lokasi sekitar, namun cenderung hanya mengeluarkan air sedikit. Sehingga satu galian sumur yang mengeluarkan air cukup banyak, membuat warga harus mengantri ketika hendak mengambil air. \n" +
                    "\n" +
                    "\"Musim kemarau tahun ini sangat menyulitkan warga, bantuan dari pemkab juga belum bisa mengatasi keeringan yang terjadi, sehingga warga harus mencari sumber air yang layak di kosumsi,\" katanya. \n" +
                    "\n" +
                    "Dampak dari kekeringan yang melanda pada tahun ini, menurutnya juga membuat sektor pertanian menjadi lumpuh. Ia bersama warga lainnya pun berharap agar musim kemarau segera berakhir. Mereka juga berharap agarpPemkab dapat menambah suplai air bersih di wilayah tersebut karena penyaluran masih kurang. \n" +
                    "Baca juga: Mahasiswa Palu di Semarang Gabung Relawan untuk Cari Keluarganya\n" +
                    "\n" +
                    "\"Embungnya saja kering, jadi kegiatan pertanian juga terhambat. Akibatnya, banyak ladang pertanian yang tak bisa di garap. Kami berharap ada bantuan air lagi yang cukup. Baik dari Pemerintah maupun pengusaha kepada warga Dukuh Jelubang ini,\" imbuhnya. \n" +
                    "\n" +
                    "Kepala BPBD Blora, Sri Rahayu saat dikonfirmasi menyebutkan, berdadarkan prakiraan cuaca BMKG, untuj sebagian wilayah Blora baru akan diguyur hujan pada pekan kedua bulan November mendatang.\n" +
                    "\n" +
                    "\"Berdasarkan data yang kami terima dari Stasiun Klimatologi BMKG Semarang, musim hujan di Jawa Tengah akan dimulai pada awal Oktober di Kabupaten Purbalingga, Banjarnegara dan sekitarnya. Sedangkan Blora baru akan mulai hujan pada pertengahan November,\" katanya.", R.drawable.kekeringan, "Johan Diaz", "15 Oktober 2018"),
            new Berita("Di Jogja Bisa Santai Mencicip Kopi Lokal Enak di Sini", "Jogja - Mampir ke Jogja bisa cicip kopi lokal di 4 tempat ini. Masing-masing tempat menawarkan racikan kopi lokal enak.\n" +
                    "\n" +
                    "Jogja memang jadi surga kuliner bagi para penikmat makanan. Khusus untuk pencinta kopi, Jogja juga punya kedai kopi yang menawarkan kopi lokal dan tradisional sebagai menu utamanya. Seperti 5 kedai kopi lokal berikut.\n" +
                    "\n" +
                    "1. Klinik Kopi" +
                    "2. Warung Kopi Klotok" +
                    "3. Warung Kopi Blandongan" +
                    "4. Angkringan Lik Man", R.drawable.jogjakopi, "Miranda Maulidiyah", "20 Semptember 2018"),

            new Berita("Cerita Korban Gempa Palu: 48 Jam Terjebak dalam Reruntuhan", "Minum... minum,” ujar Nurul Istikharah, 15 tahun, dengan suara pelan kepada anggota Badan SAR Nasional yang ada di depannya.\n" +
                    "\n" +
                    "\"Argh... argh...\" Sesekali rintihan Nurul terdengar di balik suara mesin genset yang berada tepat di atas kepalanya.\n" +
                    "\n" +
                    "Ia sempat tak sadarkan diri. Dengan sigap, anggota Basarnas menepuk bagian leher belakang Nurul dan memberikan minyak kayu putih agar Nurul kembali sadar. Kondisinya lemas. Tangannya putih pucat.\n" +
                    "\n" +
                    "Sudah 48 jam Nurul tertimbun reruntuhan bangunan Perumahan Nasional Balaroa, Palu Barat, Kota Palu. Seluruh badannya tertimbun reruntuhan rumah. Tepat di sampingnya, sang ibu, Risni, 42 tahun meninggal dunia dengan posisi yang sama seperti Nurul, tertimbun reruntuhan bangunan. \n" +
                    "\n" +
                    "Badan SAR Nasional sejak Minggu (30/9/2018) pukul 4 dini hari berupaya mengevakuasi Nurul dari reruntuhan bangunan Perumnas Balaroa. Selama itu pula, upaya Tim SAR dan para relawan belum membuahkan hasil. Kaki Nurul terjepit beton. Seluruh tubuhnya tertimbun lumpur dengan genangan air yang terus membanjiri hingga leher.\n" +
                    "\n" +
                    "Sesekali, lantunan ayat-ayat Alquran terdengar seiring upaya Tim SAR mengangkat badan Nurul dari timbunan lumpur, di antara bangunan bangunan rumah yang roboh di komplek Perumnas Balaroa. Bau anyir jenazah sang ibu sudah tercium.\n" +
                    "\n" +
                    "Namun, hingga Minggu sore, upaya menyelamatkan Nurul dari reruntuhan masih belum membuahkan hasil. Tangannya mulai putih dan mengeriput. \n" +
                    "\n" +
                    "“Bismillah,\" teriak tim Basarnas yang berupaya mengevakuasi Nurul. \n" +
                    "\n" +
                    "Nurul merupakan satu korban selamat dan masih hidup dari bencana gempa dan tsunami yang menerjang Perumnas Balaroa di Kecamatan Palu Selatan. Bersamaan dengan tertimbunnya Nurul, 90 orang tetangganya dilaporkan hilang dan masih belum ditemukan. \n" +
                    "\n" +
                    "Baca juga: Gempa Palu: Perumahan Balaroa \"Hilang\" Ditelan Lumpur\n" +
                    "\n" +
                    "Kesaksian Sang Ayah\n" +
                    "Yusuf, ayah Nurul, masih terlihat limbung. Sesekali, lelaki berumur 42 tahun ini mengalihkan pandangannya. Ia mencoba menghadapi kenyataan dengan mengobrol dengan para tetangganya. Kejadian Jumat sore lalu tak ia sangka sebagai pertemuan terakhir dengan istri dan anak keduanya, Istiqomah, 13 tahun.\n" +
                    "\n" +
                    "“Semua serba cepat. Tanah langsung amblas,” kata Yusuf dengan suara parau. \n" +
                    "\n" +
                    "Saat kejadian, Yusuf kebetulan tak ada di dalam rumah. Ia sedang berkunjung ke rumah pamannya, tepat dua bangunan dari kediamannya di Jalan Kenanga, Perumnas Balaroa. \n" +
                    "\n" +
                    "Seketika, gempa menghantam Kota Palu. Dentuman seperti bom terdengar beriringan dengan amblesnya tanah di atas perumahan yang ia tinggali. Tanah terus bergerak berbarengan dengan teriakan tetangganya meminta pertolongan. Tiba tiba, gemuruh air disertai reruntuhan rumah datang dari arah bagian barat Perumnas Balaroa. \n" +
                    "\n" +
                    "Yusuf mencari tanah lapang bersama dengan puluhan tetangganya yang juga ikut menyelamatkan diri. Ia berhasil selamat. Setelah gempa mereda, Yusuf berteriak mencari istri dan dua anaknya, limbung di tengah kegelapan. \n" +
                    "\n" +
                    "“Saya menemukan anak saya tertimbun reruntuhan dan genangan air,” kata Yusuf bercerita. \n" +
                    "\n" +
                    "Semalaman, Yusuf menunggu Nurul yang masih tertimbun reruntuhan dan hanya tinggal kepala yang terlihat. Ia menggali lumpur bercampur serpihan tembok agar anaknya bisa selamat. Ahad dini hari, Yusuf memanggil Tim SAR. Dua jam setelahnya, Basarnas mendatangi lokasi Nurul tertimbun.\n" +
                    "\n" +
                    "Namun, hingga saat berita ini ditulis (Ahad, 30/9/2018 pukul 22.24 WIB), upaya mengangkat tubuh Nurul belum membuahkan hasil meski berbagai cara telah dilakukan. Semua orang yang datang di lokasi Nurul dievakuasi berharap ia bisa diselamatkan dan cepat mendapat pertolongan tim medis. \n" +
                    "\n" +
                    "Baca juga: Situasi Palu Terkini: Perekonomian Lumpuh, Logistik Belum Merata\n" +
                    "\n" +
                    "Korban Meninggal Capai 832 Jiwa\n" +
                    "Hingga Ahad siang (30/9/2018) pukul 13.00 WIB, Badan Nasional Penanggulangan Bencana (BNPB) mengumumkan jumlah korban tewas akibat gempa sekaligus tsunami di Palu dan Donggala, Sulawesi Tengah, sementara ini mencapai 832 orang. Sebanyak 821 korban jiwa ditemukan di Kota Palu, sementara 11 korban tewas dari Donggala. \n" +
                    "\n" +
                    "“Korban yang meninggal umumnya karena tertimpa bangunan dan diterjang tsunami. Untuk itu, korban meninggal akan segera dimakamkan secara layak dan massal. Ini karena pertimbangan kesehatan,” kata Kepala Pusat Data, Informasi, dan Humas BNPB Sutopo Purwo Nugroho dalam jumpa pers di kantornya, Jakarta pada Minggu (30/9/2018). \n" +
                    "\n" +
                    "Menurut Sutopo, jumlah korban jiwa akibat bencana ini masih sangat mungkin bertambah. Ada sejumlah titik lokasi korban yang proses evakuasinya belum selesai. Selain korban meninggal, kata dia, BNPB mendata sebanyak 540 orang dirawat di rumah sakit. Sementara jumlah pengungsi hingga Minggu siang tercatat 16.732 jiwa yang tersebar di 24 titik. ", R.drawable.palu, "Annisa Miranda", "09 Agustus 2018"),
    };
    public Berita(String nama, String detail, int gambar, String author, String tanggal){
        this.judul_berita = nama;
        this.detail_berita = detail;
        this.gambar = gambar;
        this.author = author;
        this.tanggal = tanggal;
    }

    public String getDetail_berita() {

        return detail_berita;
    }

    public String getNama_berita() {

        return judul_berita;
    }

    public String get_author() {

        return author;
    }

    public String get_date() {

        return tanggal;
    }

    public int getGambar(){

        return gambar;
    }

    @Override
    public String toString() {

        return this.judul_berita;
    }
}
