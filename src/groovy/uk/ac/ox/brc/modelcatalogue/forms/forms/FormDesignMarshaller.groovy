package uk.ac.ox.brc.modelcatalogue.forms.forms

import grails.converters.JSON
import uk.ac.ox.brc.modelcatalogue.forms.FormDesign

class FormDesignMarshaller {

	void register() {
		JSON.registerObjectMarshaller(FormDesign) { FormDesign formDesign ->
				
			return [
			'id' : formDesign.id,
			'name' : formDesign.name,
			'description': formDesign.description,
			'header' : '',
			'footer' : '',
			'isDraft' : formDesign.isDraft,
			'containedElements' : formDesign.formDesignElements
			]
		}
	}

}
