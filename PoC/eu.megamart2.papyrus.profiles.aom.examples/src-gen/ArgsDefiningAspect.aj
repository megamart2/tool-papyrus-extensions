public aspect ArgsDefiningAspect {
   

 pointcut MyTarget (int X): target(X);

pointcut ThisPoint (ExampleObject X): this(ExampleObject) && target(X);

pointcut MyArgs(int X): args(X);
}
