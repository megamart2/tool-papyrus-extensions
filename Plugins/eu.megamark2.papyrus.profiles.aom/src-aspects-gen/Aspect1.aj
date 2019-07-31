public aspect Aspect1 {
   
     		pointcut Point.setX_pointcut(): call(public setX
     		(
     		         (           Integer
     		);

          

     		pointcut FigureElement.setXY_pointcut(): call(protected setXY
     		(
     		         (           Integer
     		           Integer
     		);

          

     		pointcut Line.setP2_pointcut(): call(public setP2
     		(
     		         (           Point
     		);

          

	pointcut Point.set_pointcut():
		call(public setX
		(
		         (           Integer
		)
		&&
		call(public setY
		(
		         (           Integer
		)

          

     		pointcut Point.setY_pointcut(): call(public setY
     		(
     		         (           Integer
     		);

          

	pointcut setXYComposite_pointcut(Integer x,invalid y):
		call(protected setXY
		(
		         (           Integer
		           Integer
		)
		&&
     	args(x,y);
		&&

          

     		pointcut Line.setP1_pointcut(): call(public setP1
     		(
     		         (           Point
     		);

          

	pointcut move_pointcut():
		call(public setX
		(
		         (           Integer
		)
		&&
		call(public setY
		(
		         (           Integer
		)
		&&
		call(public setP1
		(
		         (           Point
		)
		&&
		call(public setP2
		(
		         (           Point
		)
		&&
		call(protected setXY
		(
		         (           Integer
		           Integer
		)

          

              pointcut figureElement_pointcut (FigureElement fe):
                 target(fe);


             pointcut figureElement_pointcut(FigureElement fe): (
              fe);

          


          

     		pointcut Figure.make_pointcut(): call(void Figure.make*(..));

          



          pointcut move_cflow() : cflow(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3cbee9e7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7565ecce (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false)));

          


	void before ():
	 	move_pointcut(){
					
	}
	void after_returning (Integer x,invalid y):
	 	setXYComposite_pointcut(x,y){
					
	}
}
