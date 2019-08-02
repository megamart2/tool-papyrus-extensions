public aspect Aspect1 {
   
     		pointcut FigureElement.setXY_pointcut(): call(protected   setXY
     		((Integer,Integer));

          

     		pointcut Point.setY_pointcut(): call(public   setY
     		((Integer));

          

	pointcut move_pointcut():
		call(public   setX
		((Integer))
		&&
		call(public   setY
		((Integer))
		&&
		call(public   setP1
		((Point))
		&&
		call(public   setP2
		((Point))
		&&
		call(protected   setXY
		((Integer,Integer))

          

     		pointcut Figure.make_pointcut(): call(void Figure.make*(..));

          

	pointcut setXYComposite_pointcut(Integer x,invalid y):
		call(protected   setXY
		((Integer,Integer))
		&&
     	args(x,y);
		&&

          

     		pointcut Line.setP1_pointcut(): call(public   setP1
     		((Point));

          

pointcut xyargs_pointcut(invalid x, invalid y): args(x, y);

          

     		pointcut Point.setX_pointcut(): call(public   setX
     		((Integer));

          



          pointcut move_cflow() : cflow(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5cca9911 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@28fdc061 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false)));

          

              pointcut figureElement_pointcut (FigureElement fe):
                 target(fe);


             pointcut figureElement_pointcut(FigureElement fe): (
              fe);

          

	pointcut Point.set_pointcut():
		call(public   setX
		((Integer))
		&&
		call(public   setY
		((Integer))

          

     		pointcut Line.setP2_pointcut(): call(public   setP2
     		((Point));

          


	void after_returning (Integer x,invalid y):
	 	setXYComposite_pointcut(x,y){
					
	}
	void before ():
	 	move_pointcut(){
					
	}
}
