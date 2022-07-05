package com.example.projek_uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hewankuList = listOf<hewanku>(
            hewanku(
                R.drawable.aa,
                namehewanku = "Singa",
                deschewanku = "Singa adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa berada di benua Afrika dan sebagian di wilayah India. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan & banyak betina. Kelompok ini menjaga daerah kekuasaannya.",
                desc2hewanku = "Termasuk hewan karnivora"
            ),
            hewanku(
                R.drawable.bb,
                namehewanku = "Panda",
                deschewanku = "Panda Raksasa atau diringkas Panda, adalah seekor mamalia yang biasanya diklasifikasikan ke dalam keluarga beruang, Ursidae, yang merupakan hewan asli Tiongkok Tengah. Panda Raksasa tinggal di wilayah pegunungan, seperti Sichuan dan Tibet.",
                desc2hewanku = "Hewan yang berasal dari keluarga beruang ini merupakan herbivora atau pemakan tumbuhan"
            ),
            hewanku(
                R.drawable.cc,
                namehewanku = "Zebra",
                deschewanku = "Zebra adalah hewan dari Afrika yang dikenal akan tubuhnya yang berbelang hitam-putih. Terdapat tiga spesies yang masih ada saat ini, yaitu zebra grévy, zebra dataran, dan zebra gunung. Zebra merupakan bagian dari genus Equus seperti halnya kuda dan keledai.",
                desc2hewanku = " herbivora atau pemakan tumbuhan"
            ),
            hewanku(
                R.drawable.dd,
                namehewanku = "Citah",
                deschewanku = "Citah adalah anggota keluarga kucing yang berburu mangsa dengan menggunakan kecepatan dan bukan taktik mengendap-endap atau bergerombol.",
                desc2hewanku = "Termasuk hewan karnivora"
            ),
            hewanku(
                R.drawable.ee,
                namehewanku = "Kucing",
                deschewanku = "Kucing disebut juga kucing domestik atau kucing rumah adalah sejenis mamalia karnivora dari keluarga Felidae. Kata \"kucing\" biasanya merujuk kepada \"kucing\" yang telah dijinakkan, tetapi bisa juga merujuk kepada \"kucing besar\" seperti singa dan harimau.",
                desc2hewanku= "Kucing termasuk ke dalam jenis hewan karnivora atau pemakan daging."
            ),
            hewanku(
                R.drawable.ff,
                namehewanku = "Koala",
                deschewanku = "Koala adalah salah satu binatang berkantung khas dari Australia dan merupakan wakil satu-satunya dari keluarga Phascolarctidae. Kata koala berasal dari bahasa Dharug, salah satu bahasa Australia pribumi yang berarti tidak ada air atau dapat juga diartikan tidak minum.",
                desc2hewanku = "hewan herbivora, koala biasanya memakan daun kayu putih dari pohon Eucalyptus."
            ),
            hewanku(
                R.drawable.gg,
                namehewanku = "Ayam",
                deschewanku = "Ayam adalah unggas yang biasa dipelihara untuk dimanfaatkan daging, telur, dan bulunya. Ayam peliharaan merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal sebagai ayam hutan merah atau ayam bangkiwa. Semua ayam merupakan theropoda seperti tyrannosaurus.",
                desc2hewanku = "Hewan ovipar atau bertelur ini biasanya mengkonsumsi biji-bijian seperti padi atau jagung."
            ),
            hewanku(
                R.drawable.hh,
                namehewanku = "Kelinci",
                deschewanku = "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembang biak dengan cara beranak yang disebut vivipar. Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa.",
                desc2hewanku = "Kelinci merupakan jenis hewan pemakan dedaunan dan umbi sehingga termasuk dalam jenis hewan herbivora."
            ),
            hewanku(
                R.drawable.ii,
                namehewanku = "Burung Merak",
                deschewanku = "Merak adalah tiga spesies burung dalam genus Pavo dan Afropavo dari familia ayam hutan, Phasianidae. Burung jantannya memiliki bulu ekor yang indah yang dapat dikembangkan untuk menarik perhatian merak betina. Ketiga spesies tersebut adalah: Merak India, Pavo cristatus Merak Hijau, Pavo muticus",
                desc2hewanku = "Merak adalah omnivora, makan rumput dan biji-bijian serta ular dan kadal kecil juga. Di India, burung merak yang terkait mitologi Yunani ini 'eyespots' itu dikatakan sebagai mata ratus Argos raksasa."
            ),
            hewanku(
                R.drawable.tyy,
                namehewanku = "Kura-Kura",
                deschewanku = "Kura-kura adalah hewan bersisik berkaki empat yang termasuk golongan reptil. Bangsa hewan yang disebut Testudines ini khas dan mudah dikenali dengan adanya ‘rumah’ atau batok yang keras dan kaku. Batok kura-kura ini terdiri dari dua bagian.",
                desc2hewanku = "kura-kura tergantung pada spesiesnya. Hewan ini bisa menjadi herbivora (pemakan tumbuhan), karnivora (pemakan daging), atau bahkan omnivora (pemakan tumbuhan dan daging)"
            ),
            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_pemain)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = hewankuAdapter(this,hewankuList){

            val intent = Intent (this, DetailhewankuActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}