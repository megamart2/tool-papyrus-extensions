public aspect ArgsDefiningAspect {
   

pointcut ThisPoint (ExampleObject X): this(ExampleObject) && target(X);

 pointcut MyTarget (int X): target(X);

pointcut MyArgs(int X): args(X);
}
