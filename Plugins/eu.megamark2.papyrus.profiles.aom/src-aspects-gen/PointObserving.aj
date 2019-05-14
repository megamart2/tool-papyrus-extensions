public aspect PointObserving {
				isPrivileged:false
				base_Class:org.eclipse.uml2.uml.internal.impl.ClassImpl@e8c5d19 (name: PointObserving, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
				declaredImplements:
				precedes:
				perPointCut:
				declaredParents:
				precededBy:
				perType:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@3e4d0c08 (name: perthis, visibility: <unset>)
   
   pointcut PointSet_pointcut():(


        PointSet_pointcut
          >> CallPointCut
              >>>> signature:void Point.set*(int)
              >>>> operation:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@74bdb2bd (name: PointSet_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        observers
          >> StaticCrossCuttingFeature
              >>>> onType:org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_Feature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@6d32d196 (name: observers, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        PointTarget_pointcut
          >> TargetPointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.ClassImpl@4d15a121 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@3d314eac (name: PointTarget_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> argNames:p
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@3d314eac (name: PointTarget_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:

        changes_poincut
          >> CompositePointCut
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@7fb8245d (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@709d41d7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7c937f3c (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@73c48e7d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3065df59 (name: TargetPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@51b9b886 (name: changes_poincut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:
	}
