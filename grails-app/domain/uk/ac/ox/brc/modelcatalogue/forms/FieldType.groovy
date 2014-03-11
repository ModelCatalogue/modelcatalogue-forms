package uk.ac.ox.brc.modelcatalogue.forms

public enum FieldType {
	text("text"), select("select");

	final String value;

	FieldType(String value) { this.value = value; }
	
	String toString() { value; }
	
	String getKey() { name(); }
	
}