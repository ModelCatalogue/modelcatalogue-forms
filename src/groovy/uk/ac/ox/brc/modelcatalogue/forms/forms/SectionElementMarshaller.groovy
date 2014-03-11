package uk.ac.ox.brc.modelcatalogue.forms.forms

import grails.converters.JSON
import uk.ac.ox.brc.modelcatalogue.forms.SectionElement

class SectionElementMarshaller {

	void register() {
		JSON.registerObjectMarshaller(SectionElement) { SectionElement sectionElement ->
				
			return [
			'id' : sectionElement.id,
			'renderType' : "Section Element",
			'label' : sectionElement.title,
			'sectionNumber': sectionElement?.designOrder,
			'containedElements' : sectionElement.questionElements,
			'rules': sectionElement?.rules
			]
		}
	}
	
}
