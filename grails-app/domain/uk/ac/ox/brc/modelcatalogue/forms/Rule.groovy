package uk.ac.ox.brc.modelcatalogue.forms

class Rule {
	
	//In Steve's model these are called local definitions not rules
	String name
	String predicate
	String consequence

    static constraints = {
		name nullable:true
		predicate nullable:true
		consequence nullable:true
    }
}
