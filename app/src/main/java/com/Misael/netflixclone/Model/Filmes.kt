package com.Misael.netflixclone.Model

import com.Misael.netflixclone.R

data class Filmes (

    val capaFilme: Int
)

class FilmeBuilder{
    var capaFilme: Int = 0
    fun Build(): Filmes = Filmes(capaFilme)
}

fun filmes(block: FilmeBuilder.() ->Unit):Filmes= FilmeBuilder().apply(block).Build()

fun addFilmes(): MutableList<Filmes> = mutableListOf(

    filmes {
        capaFilme = R.drawable.filme1
    },
    filmes {
        capaFilme = R.drawable.filme2
    },
    filmes {
        capaFilme = R.drawable.filme3
    },
    filmes {
        capaFilme = R.drawable.filme4
    },
    filmes {
        capaFilme = R.drawable.filme5
    },
    filmes {
        capaFilme = R.drawable.filme6
    },
    filmes {
        capaFilme = R.drawable.filme7
    },
    filmes {
        capaFilme = R.drawable.filme8
    },
    filmes {
        capaFilme = R.drawable.filme9
    },
    filmes {
        capaFilme = R.drawable.filme10
    },
    filmes {
        capaFilme = R.drawable.filme11
    },
    filmes {
        capaFilme = R.drawable.filme12
    },
    filmes {
        capaFilme  = R.drawable.filmes13
    },
    filmes {
        capaFilme  = R.drawable.filmes14
    },
    filmes {
        capaFilme  = R.drawable.filmes16
    },

)

