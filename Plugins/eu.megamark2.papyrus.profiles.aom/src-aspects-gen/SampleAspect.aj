privileged aspect SampleAspect {
   

          
             public MyObserver Point.observers;
             public MyObserver Line.observers;


          


          pointcut setXY_PointCut(): (
            set(Private Integer Point.x) || set(Private Integer Point.y));


          

	pointcut observePoint_PointCut(Integer inX,invalid inY):
		&&
     	args(inX,inY);

          

     		pointcut makeLine_PointCut(): call(public Line   makeLine
     		(..));

          


	void after ():
	 	makeLine_PointCut(){
					
	}
	void before (Integer inX,invalid inY):
	 	observePoint_PointCut(inX,inY){
					
	}
}
