package uk.ac.ox.brc.modelcatalogue.forms


import org.modelcatalogue.core.DataType

class InputField {
	
	String defaultValue
	String placeholder
	Integer maxCharacters
	String unitOfMeasure
	DataType dataType
	String format
	
    static constraints = {
		 defaultValue nullable:true
		 placeholder nullable:true
		 maxCharacters nullable:true
		 unitOfMeasure nullable:true
		 dataType nullable:true
		 format nullable:true
		}

	
	
}
