package com.falabella.exceltojson.model;

import java.util.Date;

import com.poiji.annotation.ExcelCellName;

import lombok.Data;

@Data
public class Project {

	@ExcelCellName("año proyecto")
  private Integer anoProyecto;
	@ExcelCellName("carry over")
  private String carryOver;
	@ExcelCellName("Fecha actualización")
  private Date fecha_actualizacion;
	@ExcelCellName("Id Proyecto")
  private Integer idProyecto;
	@ExcelCellName("Area")
  private String nombreArea;
	@ExcelCellName("Fase")
  private String nombreFase;
	@ExcelCellName("nombre proyecto")
  private String nombreProyecto;
	@ExcelCellName("Unidad de Negocio")
  private String nombreUnn;
	@ExcelCellName("% consumo")
  private String porcentaje_consumo;
	@ExcelCellName("presupuesto")
  private String presupuesto;
	@ExcelCellName("real")
  private String real;
	@ExcelCellName("Semaforo")
  private String semaforo;
}
