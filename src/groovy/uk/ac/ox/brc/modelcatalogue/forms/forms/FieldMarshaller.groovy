package uk.ac.ox.brc.modelcatalogue.forms.forms

import grails.converters.JSON
import uk.ac.ox.brc.modelcatalogue.forms.Field

class FieldMarshaller {
	
	void register() {
		JSON.registerObjectMarshaller(Field) { Field field ->
				
			return [
			'id' : field.id,
			'name' : field.name,
			'type' : field.type.value,
			'caption' : field.caption,
			'placeholder' : field.placeholder,
			'value' : field?.value,
			'size' : field?.size,
			'options' : field?.options,
			'field_class' : field?.field_class,
			'field_id' : field?.field_id
			]
		}
	}

}



