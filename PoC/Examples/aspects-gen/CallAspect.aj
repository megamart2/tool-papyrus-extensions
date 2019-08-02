public aspect CallAspect {
   
     		pointcut CallSuma(): call(public Integer   suma
     		((Integer,Integer));

          

pointcut ArgsPoint(invalid x, invalid y): args(x, y);

          

     		pointcut callpoint1(): call( *.Oper* (..));

          

     		pointcut CallOp1(): call(public   Operation1
     		(..));

          


}
