package com.myspace.kafka;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class payload implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "id")
	private java.lang.String id;

	public payload() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public payload(java.lang.String name, java.lang.String id) {
		this.name = name;
		this.id = id;
	}

}