fun main(){
    Print("ingrese el numero de la operacion que desea resolver 1(+),2(-),3(*),4(/)")
    var operacion=readLine()!!.toInt()
    print("ingrese el primer numero:")
    var num1=readLine()!!.toInt()
    print("ingrese el segundo numero:")
    var num2=readLine()!!.toInt()

    var resultado:Double=0.0

    when(operacion){
        1->resultado=num1+num2
        2->resultado=num1-num2
        3->resultado=num1*num2
        4->resultado=num1/num2
        else{
            println("el numero que ingreso no corresponde a ninguna operacion")
        }
    }
    println("el resultado de la operacion es: $reultado")
    

}
