public aspect Aspect1 {
				perType:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@561a8e83 (name: perthis, visibility: <unset>)
				declaredImplements:
				declaredParents:
				precedes:
				precededBy:
				perPointCut:
				base_Class:org.eclipse.uml2.uml.internal.impl.ClassImpl@78653ec6 (name: Aspect1, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
				isPrivileged:false

        setXYComposite_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@7b9b118 (name: CompositePointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@396101f9 (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7d302216 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@554f4b6a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@2f2d6f53 (name: ArgsPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5c68a081 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@4b483b9c (name: TargetPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@51c6fa07 (name: setXYComposite_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        Line.setP1_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@7d7f2035 (name: setP1, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@70202b43 (name: Line.setP1_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:

        Line.setP2_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@18bcc60b (name: setP2, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@5ebdaf9a (name: Line.setP2_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:

        xyargs_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6bec9cbf (name: ArgsPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> argNames:xy
              >>>> type:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@691d42b0 (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2f7dc67a (name: xyargs_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2f7dc67a (name: xyargs_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        Point.set_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@7b9b118 (name: CompositePointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@396101f9 (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cdcc9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5ef5f76f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2c27836c (name: Point.set_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        Point.setY_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@331c4f2a (name: setY, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@7d651108 (name: Point.setY_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:

        figureElement_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@621c539a (name: TargetPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> argNames:fe
              >>>> type:org.eclipse.uml2.uml.internal.impl.ClassImpl@163b569f (name: FigureElement, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@7a3649d9 (name: figureElement_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@7a3649d9 (name: figureElement_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        FigureElement.setXY_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@5fa09695 (name: setXY, visibility: protected) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@b051814 (name: FigureElement.setXY_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:

        move_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@7b9b118 (name: CompositePointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@396101f9 (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cdcc9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5ef5f76f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5b6ad501 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@c8fe267 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7d302216 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@1ba9c6fb (name: move_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        Point.setX_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@4a08bf0d (name: setX, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@4e7c19e4 (name: Point.setX_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:

        Figure.make_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@6aa29cfe (name: Figure.make_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:void Figure.make*(..)

        move_cflow
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@33ba9245 (name: CFlowPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> selectedPointCut:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2bfbc660 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3e63a5d7 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@59d03f4f (name: move_cflow, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
	}
