public aspect operationalAspect {
   

     		pointcut CallSuma(): call(public Integer   suma
     		(Integer,Integer));

   pointcut ExecuteMe(): execution(public Real   Operation3
   (..));

    pointcut PreInitializationPoint(): preinitialization(public ExampleObject.new(..));

     		pointcut callpoint1(): call(public   Operation1
     		(..));

   pointcut InitializeMe(): initialization(public ExampleObject.new(..));

     		pointcut CallOp1(): call( *.Oper* (..));
}
