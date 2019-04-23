privileged aspect SampleAspect {
				perType:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@561a8e83 (name: perthis, visibility: <unset>)
				declaredImplements:org.eclipse.uml2.uml.internal.impl.InterfaceRealizationImpl@1363a5c8 (name: <unset>, visibility: <unset>)
				declaredParents:org.eclipse.uml2.uml.internal.impl.GeneralizationImpl@25c9b9ec (isSubstitutable: true)
				precedes:
				precededBy:
				perPointCut:
				base_Class:org.eclipse.uml2.uml.internal.impl.ClassImpl@6f984838 (name: SampleAspect, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
				isPrivileged:true

        observers
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@53032f30 (name: StaticCrossCuttingFeature, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> base_Feature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@48e17ff (name: observers, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> onType:org.eclipse.uml2.uml.internal.impl.ClassImpl@2debf18e (name: Line, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)org.eclipse.uml2.uml.internal.impl.ClassImpl@16928365 (name: Point, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)

        twoIntArgs_PointCut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6bec9cbf (name: ArgsPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> argNames:inXinY
              >>>> type:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@691d42b0 (name: Integer, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
              >>>> base_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2fde684c (name: twoIntArgs_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> composite:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4282b615 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3e63a5d7 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2fde684c (name: twoIntArgs_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        setXY_PointCut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@46d6fe5a (name: SetPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4282b615 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3e63a5d7 (name: CompositePointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> field:org.eclipse.uml2.uml.internal.impl.PropertyImpl@634bedec (name: x, visibility: private) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)org.eclipse.uml2.uml.internal.impl.PropertyImpl@61c0d34b (name: y, visibility: private) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@297a56de (name: setXY_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)

        makeLine_PointCut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@6d811876 (name: CallPointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> operation:org.eclipse.uml2.uml.internal.impl.OperationImpl@4058dde6 (name: makeLine, visibility: <unset>) (isLeaf: false, isStatic: false, concurrency: sequential, isAbstract: false) (isQuery: false)
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@2774ea90 (name: makeLine_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
              >>>> signature:

        observePoint_PointCut
          >> org.eclipse.uml2.uml.internal.impl.StereotypeImpl@7b9b118 (name: CompositePointCut, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
              >>>> composite:
              >>>> type:org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@396101f9 (name: And, visibility: <unset>)
              >>>> composee:org.eclipse.emf.ecore.impl.DynamicEObjectImpl@273dd031 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@5f591038 (name: SetPointCut) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7241954a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@2f2d6f53 (name: ArgsPointCut) (instanceClassName: null) (abstract: false, interface: false))
              >>>> base_PointCut_StructuralFeature:org.eclipse.uml2.uml.internal.impl.PropertyImpl@53b12ef6 (name: observePoint_PointCut, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
	}
