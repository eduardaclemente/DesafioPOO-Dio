    enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

    class Usuario

    data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

    data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

    fun main() {
        val usuario1 = Usuario()
        val usuario2 = Usuario()

        val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
        val conteudo2 = ConteudoEducacional("Algoritmos Avançados", 180)

        val formacao = Formacao("Ciência da Computação", listOf(conteudo1, conteudo2))

        formacao.matricular(usuario1)
        formacao.matricular(usuario2)
    }