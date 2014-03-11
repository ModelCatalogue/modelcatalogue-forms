package uk.ac.ox.brc.modelcatalogue.forms

import org.modelcatalogue.core.Model

class SectionElement extends FormDesignElement implements Comparable{

	//N.B. In the future potentially use a mapping class SectionElement_DataElementConcept
	Model dataElementConcept
	
	String sectionNumber
	String title
	String[] instructions
	List<QuestionElement> questionElements
	
	static hasMany = [
			presentationElements: PresentationElement,
			questionElements: QuestionElement
	]

	static belongsTo = [formDesign: FormDesign]
	
	
	
	static fetchMode = [questionElements: 'eager']
	
    static constraints = {
		sectionNumber nullable:true
		dataElementConcept nullable:true
		formDesign nullable:true
		title nullable:true
		instructions nullable:true
    }
	
	static mapping = {
		questionElements cascade: 'all-delete-orphan'
		questionElements sort: 'designOrder'
	}
	
	@Override
	public int compareTo(obj){
	  if(obj){
		this.designOrder?.compareTo(obj.designOrder)
	  }
	}
}
