package ar.edu.um.dao;

import java.sql.Date;



public class Inscripcion {
	
	private int ins_alu_id; /* clave compuesta por ins_alu_id e ins_cur_id */
	private int ins_cur_id;
	private int ins_id;
	private String ins_fecha;

	public Inscripcion(){
		
	}

	public int getIns_alu_id() {
		return ins_alu_id;
	}

	public void setIns_alu_id(int ins_alu_id) {
		this.ins_alu_id = ins_alu_id;
	}

	public int getIns_cur_id() {
		return ins_cur_id;
	}

	public void setIns_cur_id(int ins_cur_id) {
		this.ins_cur_id = ins_cur_id;
	}

	public int getIns_id() {
		return ins_id;
	}

	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}

	

	public String getIns_fecha() {
		return ins_fecha;
	}

	public void setIns_fecha(String ins_fecha) {
		this.ins_fecha = ins_fecha;
	}

	@Override
	public String toString() {
		return "Inscripcion [ins_alu_id=" + ins_alu_id + ", ins_cur_id="
				+ ins_cur_id + ", ins_id=" + ins_id + ", ins_fecha="
				+ ins_fecha + "]";
	}
	
	
}
