package uk.ac.ox.brc.modelcatalogue.forms

import org.modelcatalogue.core.Model

class FormDesignElement extends Model  {
	
	String label
	String style
	
	//I'm assuming
	Integer designOrder
	
	//N.B. At present rules contains the hide/show logic for the given element
	
	static hasMany = [rules: Rule]
	static belongsTo = [formDesign: FormDesign]
	
    static constraints = {
		label nullable: true
		style nullable:true
		formDesign nullable:true
    }
	
}
