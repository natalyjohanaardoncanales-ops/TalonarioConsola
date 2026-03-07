package Talonarioservices;


import java.util.LinkedList;
import java.util.List;

import Talonario.Talonario;

public class TalonarioServiceImpl implements ITalonarioservice {

    List<Talonario> talonarios = null;

    public TalonarioServiceImpl() {
        talonarios = new LinkedList<>();
    }

    public boolean guardar1(Talonario talonario) {

        talonarios.add(talonario);

        return true;
    }

    @SuppressWarnings("unchecked")
    public Talonario recuperar(Talonario talonario) {
        return ((List<Talonario>) talonario).get(0);
    }

    public List<Talonario> recuperarTalonarios() {
        return talonarios;
    }

    public Talonario modificar1(Talonario talonario) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean eliminar1(Talonario talonario) {
        // TODO Auto-generated method stub
        return false;
    }

	@Override
	public boolean guardar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Talonario recuoerar(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Talonario modificar(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}
}
