enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String) 

val inscritos = mutableListOf<String>()
val novosAlunos: List<String> = inscritos    

data class ConteudoEducacional(var nome: String) 

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var niveis: List<Nivel> ) {

     

}

fun matricular(vararg usuario: String) {
    	for(user in usuario) inscritos.add(user)
   
	}

fun main() {
   val user1 = "Ana"
   val user2 = "Henrique"
  
 
   
  matricular(user1,user2)
   
   
  println(novosAlunos)

   
 
}