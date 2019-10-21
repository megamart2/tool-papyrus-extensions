package es.ikerland.skyline.message.aspects;

import es.ikerlan.skyline.message.MessageManager;
import es.ikerlan.skyline.utils.PrintUtils;
/**
 * this aspect produces logs for the methods of MessageManager
 * it prints the method name and arguments before the method execution,
 * and an error or success message after the method execution
 */
privileged aspect LoggingAspect {
    /**
     *  this pointcut picks out all the static void methods in MessageManager
     */
	pointcut logging() : call(static void MessageManager.*(..));
	/**
	 *  before proceed printing the name and arguments,
	 *  and after proceed the result (success or error)
	 */
	void around() : logging() {
		
		//System.out.println("logging");
		// name of the method
		String name = thisJoinPoint.getSignature().getName();
		// in - arguments
		Object[] objects = thisJoinPoint.getArgs();
		String info = "Starting method : " + name + "\n\n >> Input : ";
		for(Object ob : objects) {
			info += "\n    - " + ob.getClass().getName() + " = " + ob.toString();
		}
		
		PrintUtils.log(info);
		
		try{
			proceed();
			PrintUtils.log(name + " finish without exceptions");
		} catch(Exception e) {
			PrintUtils.error(" " + name + " throwed an exception");
			e.printStackTrace();
		}
	}
}
