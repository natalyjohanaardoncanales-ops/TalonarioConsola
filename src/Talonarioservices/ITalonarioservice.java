package Talonarioservices;

import Talonario.Talonario;

public interface ITalonarioservice {
	
public boolean guardar (Talonario talonario); //Guardar talonario
public Talonario recuoerar (Talonario talonario); //Recuperar talonario en base al objeto , dentro del objeto del carnet
public Talonario modificar(Talonario talonario);//
public boolean eliminar(Talonario talonario);
}
