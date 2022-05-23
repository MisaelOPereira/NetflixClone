package com.Misael.netflixclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.recyclerview.widget.GridLayoutManager
import com.Misael.netflixclone.Adapter.FilmesAdapter
import com.Misael.netflixclone.Model.addFilmes
import com.Misael.netflixclone.databinding.ActivityDetalhesFilmeBinding
import com.squareup.picasso.Picasso

class DetalhesFilme : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesFilmeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesFilmeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        Toolbar()

        val recycler_outros = binding.recycleOutros
        recycler_outros.adapter = FilmesAdapter(addFilmes())
        recycler_outros.layoutManager = GridLayoutManager(applicationContext,3)

        val capaTheWidcher = "https://firebasestorage.googleapis.com/v0/b/netflix-clone-fb364.appspot.com/o/video.jpg?alt=media&token=1cd0a554-ee95-4913-8331-19ea41c4bfb6"
        Picasso.get().load(capaTheWidcher).fit().into(binding.capa)

        binding.playVideo.setOnClickListener {
            val intent = Intent(this,Video::class.java)
            startActivity(intent)
        }
    }

    private fun Toolbar(){
        val toolbar_detalhes = binding.toolbarDetalhes
        toolbar_detalhes.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar_detalhes.setNavigationOnClickListener {
            val intent = Intent(this,ListaFilmes::class.java)
            startActivity(intent)
            finish()
        }


    }


}