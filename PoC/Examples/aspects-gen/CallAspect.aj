public aspect CallAspect {
   
     		pointcut CallSuma(): call(public Integer   suma
     		((Integer,Integer));

          

     		pointcut CallOp1(): call(public   Operation1
     		(..));

          

     		pointcut callpoint1(): call( ExampleObject.Operation* (..));

          


}
