privileged aspect VerificationAspect {
   


	pointcut verification(invalid messageType,invalid message):
		call(void MessageManager.process*(JSONObject,int))
		&&
     	args(message,messageType);
	void around ():
	 	invalid(){
					
	}
}
