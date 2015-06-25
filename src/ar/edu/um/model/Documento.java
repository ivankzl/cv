package ar.edu.um.model;

public class Documento {
	
	private int doc_id; /*clave primaria */
	private String doc_nombre;
	
	public Documento(){
		
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public String getDoc_nombre() {
		return doc_nombre;
	}

	public void setDoc_nombre(String doc_nombre) {
		this.doc_nombre = doc_nombre;
	}

	@Override
	public String toString() {
		return "Documento [doc_id=" + doc_id + ", doc_nombre=" + doc_nombre
				+ "]";
	}
	
	

}
