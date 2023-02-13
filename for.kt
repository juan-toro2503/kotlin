
fun main (){
   print("ingrese un valor:")
   var n=readLine()!!.toInt()

   var contador=0

   
   for ( i in 2..n ){
      if(i>3){
         for(x in 1..n){
            if(contador<3){
               if(i%x==0 ){
               contador+=1
               }
               if(x==n){
                  println(i)
               }
            }else{
               contador=0
               break
            }
            
         }
      }else{
         println(i)
      }
      
      
      
   }

    



    


}