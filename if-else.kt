fun main(){
    val contraseña="sena2023"

    print("ingrese la contraseña:")
    val validar:String?=readLine()
    if(contraseña==validar){
        println("la contraseña es correcta")
    }else {
      println("la contraseña es incorrecta")   
    }

}