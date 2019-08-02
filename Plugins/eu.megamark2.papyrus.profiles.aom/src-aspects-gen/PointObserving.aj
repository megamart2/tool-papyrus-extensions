public aspect PointObserving {
   
	pointcut changes_poincut():
		call(void Point.set*(int))
		&&

          

     		pointcut PointSet_pointcut(): call(void Point.set*(int));

          


          
             public Vector Point.observers;

              pointcut PointTarget_pointcut (Point p):
                 target(p);


             pointcut PointTarget_pointcut(Point p): (
              p);

          


	void before ():
	 	changes_poincut(){
					
	}
}
