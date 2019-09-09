public aspect operationalAspect {
   

     		pointcut CallSuma(): call(public Integer   suma
     		(Integer,Integer));

   pointcut ExecuteMe(): execution(public Real   Operation3
   (..));

     		pointcut callpoint1(): call(public   Operation1
     		(..));

     		pointcut CallOp1(): call( *.Oper* (..));

   pointcut InitializeMe(): initialization(public ExampleObject.new(..));

    pointcut PreInitializationPoint(): preinitialization(public ExampleObject.new(..));
}
