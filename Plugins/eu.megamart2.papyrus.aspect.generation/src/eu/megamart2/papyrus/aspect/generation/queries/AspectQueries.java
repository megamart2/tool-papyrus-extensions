package eu.megamart2.papyrus.aspect.generation.queries;

import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

public class AspectQueries {

	public boolean isAspect(Class clazz) { 
		return getAspectStereotype(clazz) != null;
	}
	
	public String aspectAccess(Class clazz) {
		Stereotype stereotype = getAspectStereotype(clazz);
		Boolean boo = (Boolean)clazz.getValue(stereotype,"isPrivileged");
		if(boo == null) return "public";
		if(boo.booleanValue()) return "privileged";
		return "public";
	}
	
	private Stereotype getAspectStereotype(Class clazz) {
		List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
		for(Stereotype stereotype : stereotypes)
			if(stereotype.getName().equalsIgnoreCase("Aspect")) 
				return stereotype;
		return null;
	}
}
