package com.akbar.rumahadatuas.ModalData;

import java.util.ArrayList;

public class Data {

    public static String[][] data = new String[][]{
            {"Rumah Adat Aceh (Krong Bade)","Rumah adat Sumatera yang pertama adalah rumah adat Aceh atau krong bade. Rumah adat aceh adalah rumah dengan menggunakan struktur panggung yang memiliki tinggi 2-3 meter dari permukaan tanah. Secara keseluruhan rumah ini terbuat dari bahan kayu kecuali bagian atapnya dan bagian lantainya.", "https://karyapemuda.com/wp-content/uploads/2017/10/384-rumah-krong-bade-aceh.jpg"},
            {"Rumah Adat Sumatera Barat (Rumah Gadang)","Rumah adat Sumatera yang kedua adalah rumah adat Sumatera Barat atau rumah gadang. Pada dasarnya rumah ini adalah rumah adat suku minagnkabau, yang juga memiliki sebutan lain, yaitu rumah godang. Rumah ini adalah salah satu rumah panggung yang memiliki ukuran yang besar dan berbentuk persegi panjang.", "https://karyapemuda.com/wp-content/uploads/2017/10/rumah-gadang2.jpg"},
            {"Rumah Adat Sumatera Utara (Rumah Bolon)","Rumah adat Sumatera yang ketiga adalah rumah adat Sumatera Utara atau rumah bolon. Rumah bolon adalah salah satu budaya yang dimiliki oleh suku batak di Sumatera Utara. Sama seperti rumah lainnya rumah ini juga terbuat dari bahan yang ada di alam sekitar.", "https://karyapemuda.com/wp-content/uploads/2017/10/rumah-bolon.jpg"},
            {"Rumah Adat Sumatera Selatan (Rumah Limas)","Rumah adat Sumatera yang keempat adalah rumah adat Sumatera Selatan atau rumah limas. Seperti namanya rumah ini memiliki bangunan yang berbentuk seperti bangun limas. Rumah lilmas adalah salah satu rumah adat yang berukuran besar, karena luasnya bisa mencapai 400 sampai 1000 meter persegi.", "https://karyapemuda.com/wp-content/uploads/2017/10/Rumah-Limas-sumatera-selatan-1024x618.jpg"},
            {"Rumah Adat Lampung (Nuwou Sesat)","Rumah adat yang kelima adalah rumah adat Lampung atau nuwou sesat. Seperti rumah adat Sumatera lainnya, rumah adat lampung adalah rumah panggung yang terbuat dari bahan kayu atau papan. Rumah ini difungsikan masyarakat sekitar sebagai balai atau tempat pertemuan masyarakat kampung.", "https://karyapemuda.com/wp-content/uploads/2017/10/nama-rumah-adat-Lampung.jpg"},
            {"Rumah Adat Bangka Belitung (Rumah Panggung)","Rumah adat Sumatera yang keenam adalah rumah adat Bangka Belitung atau rumah panggung. Bangka Belitung adalah salah satu provinsi yang memiliki kebudayaan seperti halnya orang melayu. Termasuk juga dengan rumah adat Bangka Belitung, juga menggunkan desain seperti orang melayu.", "https://karyapemuda.com/wp-content/uploads/2017/10/rumah-adat-Bangka-Belitung.jpg"},
            {"Rumah Adat Bengkulu (Bubungan Lima)","Rumah adat Sumatera yang ketujuh adalah rumah adat Bengkulu atau bubungan lima. Bubungan lima adalah rumah panggung yang didesain agar dapat menahan dari getaran gempa bumi. Mengingat, karena Provinsi Bengkulu adalah salah satu daerah yang rawan terjadi gempa bumi.", "https://karyapemuda.com/wp-content/uploads/2017/10/Rumah-Adat-Rakyat-Bengkulu-jadhomes.jpg"},
            {"Rumah Adat Jambi (Kajang Leko)","Rumah adat Sumatera yang kedelapan adalah rumah adat Jambi atau kajang leko. Seperti rumah adat pulau sumatera lainnya, rumah ini memiliki desain rumah dengan panggung. Selain itu kajang leko merupakan rumah dengan desain tertua yang ada di Jambi.", "https://karyapemuda.com/wp-content/uploads/2017/10/jambi-bungo.jpg"},
            {"Rumah Adat Riau (Balai Salaso Jatuh)","Rumah adat Sumatera yang kesembilan adalah rumah adat Riau. Apabila kita hidup di Pulau Jawa, nama ini terdengar aneh dan asing di telinga kita. Akan tetapi bagi penduduk Riau mereka pasti tau betul tentang arti dari nama rumah balai salaso jatuh tersebut.", "https://karyapemuda.com/wp-content/uploads/2017/10/Mengenal-Kebudayaan-Provinsi-Riau-rumah-adat-provinsi-riau.jpg"},
            {"Rumah Adat Kepulauan Riau (Rumah Melayu Atap Lontik)","Rumah adat Sumatera yang selanjutnya adalah rumah adat Kepulauan Riau atau rumah melayu atap lontik. Rumah melayu atap lontik berasal dari Kab. Kampar Provinsi Riau. Disebut dengan rumah melayu atap lontik karena rumah ini memiliki hiasan pada dinding bagian depan.", "https://karyapemuda.com/wp-content/uploads/2017/10/kepri.jpg"},
    };
    public static ArrayList<ModelData> getDataRUmahAdat(){
        ArrayList<ModelData> modaldata = new ArrayList<>();
        for (String[] varData : data){
            ModelData model = new ModelData();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setUrl(varData[2]);

            modaldata.add(model);
        }
        return modaldata;
    }
}
