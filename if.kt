fun main (){
    print("ingrese un numero:")
    var num=readLine()!!.toInt()
    if(num<0){
        num*=-1
    }
    println("el valor absoluto es : $num")
}