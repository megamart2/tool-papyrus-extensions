public aspect PointObserving {
				perType:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@561a8e83 (name: perthis, visibility: <unset>)
				declaredImplements:
				declaredParents:
				precedes:
				precededBy:
				perPointCut:
				base_Class:org.eclipse.uml2.uml.internal.impl.ClassImpl@29471f19 (name: PointObserving, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
				isPrivileged:false

        PointTarget_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@621c539a (name: TargetPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> argNames:p
              >>>> type:org.eclipse.uml2.uml.internal.impl.ClassImpl@16928365 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@5a41e9c1 (name: PointTarget_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@5a41e9c1 (name: PointTarget_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        observers
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@53032f30 (name: StaticCrossCuttingFeature, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_Feature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@70bd34a9 (name: observers, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> onType:org.eclipse.uml2.uml.internal.impl.ClassImpl@16928365 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)

        PointSet_pointcut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@4971b686 (name: PointSet_pointcut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:void Point.set*(int)

        changes_poincut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@7b9b118 (name: CompositePointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@396101f9 (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6f7e5509 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56ed9b53 (name: CallPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7bca0b30 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@4b483b9c (name: TargetPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@4bef9a47 (name: changes_poincut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
	}
