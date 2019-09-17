privileged aspect LoggingAspect {
   

     		pointcut logging(): call(static void MessageManager.*(..));
	void around ():
	 	logging(){
					
	}
}
