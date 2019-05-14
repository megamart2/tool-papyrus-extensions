privileged aspect SampleAspect {
				isPrivileged:true
				base_Class:org.eclipse.uml2.uml.internal.impl.ClassImpl@592507ee (name: SampleAspect, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
				declaredImplements:org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl@648eae8d (name: <unset>, visibility: <unset>)
				precedes:
				perPointCut:
				declaredParents:org.eclipse.uml2.uml.internal.impl.GeneralizationImpl@3aab69b8 (isSubstitutable: true)
				precededBy:
				perType:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@3e4d0c08 (name: perthis, visibility: <unset>)
   
   pointcut makeLine_PointCut():(
      call( * Figure.makeLine()));
           
   pointcut twoIntArgs_PointCut ():
      args(inXinY);


        observers
          >> StaticCrossCuttingFeature
              >>>> onType:org.eclipse.uml2.uml.internal.impl.ClassImpl@129e83f1 (name: Line, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_Feature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@31e56b05 (name: observers, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        makeLine_PointCut
          >> CallPointCut
              >>>> signature:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@4a0cf589 (name: makeLine, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@5ce39650 (name: makeLine_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        twoIntArgs_PointCut
          >> ArgsPointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f4b4f1a (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2d8b108d (name: twoIntArgs_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> argNames:inXinY
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2d8b108d (name: twoIntArgs_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1d2fdd22 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@73f6aa70 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false))

        observePoint_PointCut
          >> CompositePointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@7fb8245d (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@62f1ac38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@a6598a4 (name: SetPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@147deddb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@1fe85aa1 (name: ArgsPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@464460de (name: observePoint_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        setXY_PointCut
          >> SetPointCut
              >>>> field:org.eclipse.uml2.uml.internal.impl.PropertyImpl@5a3c0f8a (name: x, visibility: private) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)org.eclipse.uml2.uml.internal.impl.PropertyImpl@3ac0a145 (name: y, visibility: private) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@400e00a0 (name: setXY_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1d2fdd22 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@73f6aa70 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false))
	}
