package uk.ac.ox.brc.modelcatalogue.forms

/* ******************************************************
 *
 * THIS IS OLD CODE THAT WILL HAVE TO BE REMOVED
 *
 * */


import org.modelcatalogue.core.Model

class FormSpecification {
	
	Model collection
	
	String name 
	
	static hasMany = [fields: Field]
	
	static belongsTo = [collection: Collection]
	
    static constraints = {
    }
}
