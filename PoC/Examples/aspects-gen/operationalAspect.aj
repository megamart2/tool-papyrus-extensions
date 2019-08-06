public aspect operationalAspect {
   

     		pointcut CallSuma(): call(public Integer   suma
     		(Integer,Integer));

    pointcut PreInitializationPoint(): preinitialization(public ExampleObject.new(..));

pointcut ArgsPoint(invalid X, invalid Y): args(X, Y);

   pointcut InitializeMe(): initialization(public ExampleObject.new(..));

   pointcut ExecuteMe(): execution(public Real   Operation3
   (..));

     		pointcut callpoint1(): call(public   Operation1
     		(..));

     		pointcut CallOp1(): call( *.Oper* (..));
}
