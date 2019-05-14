public aspect Aspect1 {
				isPrivileged:false
				base_Class:org.eclipse.uml2.uml.internal.impl.ClassImpl@7f8389b2 (name: Aspect1, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
				declaredImplements:
				precedes:
				perPointCut:
				declaredParents:
				precededBy:
				perType:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@3e4d0c08 (name: perthis, visibility: <unset>)
   
   pointcut Line.setP1_pointcut():(
      call( * Line.setP1(org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false))));
           name : ptype : org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
   pointcut Point.setY_pointcut():(
      call( * Point.setY(org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false))));
           name : ytype : org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
   pointcut xyargs_pointcut ():
      args(xy);
   pointcut Figure.make_pointcut():(
   pointcut Line.setP2_pointcut():(
      call( * Line.setP2(org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false))));
           name : ptype : org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
   pointcut FigureElement.setXY_pointcut():(
      call( * FigureElement.setXY(org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false))));
           name : newXtype : org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)name : newYtype : org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
   pointcut Point.setX_pointcut():(
      call( * Point.setX(org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false))));
           name : xtype : org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)


        Point.set_pointcut
          >> CompositePointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@7fb8245d (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7bc74a37 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@190331ec (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@72c94de8 (name: Point.set_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        move_pointcut
          >> CompositePointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@7fb8245d (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7bc74a37 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@190331ec (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7844aa4b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1be1beac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bed706d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@38938732 (name: move_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        Line.setP1_pointcut
          >> CallPointCut
              >>>> signature:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@675b8f9d (name: setP1, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@5f84ffae (name: Line.setP1_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        Point.setY_pointcut
          >> CallPointCut
              >>>> signature:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@46f267b7 (name: setY, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@1164986f (name: Point.setY_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        xyargs_pointcut
          >> ArgsPointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@4320648b (name: xyargs_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> argNames:xy
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@4320648b (name: xyargs_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        setXYComposite_pointcut
          >> CompositePointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@7fb8245d (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bed706d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bdff820 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@1fe85aa1 (name: ArgsPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@593236c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3065df59 (name: TargetPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@10d13080 (name: setXYComposite_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        Figure.make_pointcut
          >> CallPointCut
              >>>> signature:void Figure.make*(..)
              >>>> operation:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@40126601 (name: Figure.make_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        Line.setP2_pointcut
          >> CallPointCut
              >>>> signature:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@c87ef54 (name: setP2, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@359f6dea (name: Line.setP2_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        figureElement_pointcut
          >> TargetPointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.ClassImpl@ecca0b0 (name: FigureElement, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@67aec55b (name: figureElement_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> argNames:fe
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@67aec55b (name: figureElement_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        move_cflow
          >> CFlowPointCut
              >>>> selectedPointCut:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3c941495 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@73f6aa70 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@eaca3d4 (name: move_cflow, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        FigureElement.setXY_pointcut
          >> CallPointCut
              >>>> signature:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@298bb285 (name: setXY, visibility: protected) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@d3cd6 (name: FigureElement.setXY_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        Point.setX_pointcut
          >> CallPointCut
              >>>> signature:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@3d53bfcd (name: setX, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@76b3984c (name: Point.setX_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:
	}
