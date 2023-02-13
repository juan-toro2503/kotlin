fun main(){
    val aleatorio=1..10
    var numero:Int 
    var estado=true
    while(estado){
        print("ingrese un numero :")
        numero=readLine()!!.toInt()
        if(numero==aleatorio.random()){
            println("acertaste el numero era $numero")
            estado=false
        }else{
            println("sigue intentando")
        }

    }
}