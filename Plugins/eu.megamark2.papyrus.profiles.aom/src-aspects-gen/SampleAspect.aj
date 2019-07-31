privileged aspect SampleAspect {
   
     		pointcut makeLine_PointCut(): call(public  makeLine
     		..));

          

	pointcut observePoint_PointCut(Integer inX,invalid inY):
		&&
     	args(inX,inY);

          


          
             public MyObserver Line.observers;
             public MyObserver Point.observers;


          pointcut setXY_PointCut(): (
            set(Private Integer Point.x) || set(Private Integer Point.y));


          


          


	void before (Integer inX,invalid inY):
	 	observePoint_PointCut(inX,inY){
					
	}
	void after ():
	 	makeLine_PointCut(){
					
	}
}
