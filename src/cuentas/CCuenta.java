/**
 * @author Víctor Mosquera Villanueva
 * @version 1.0
 * */

/**
 * Clase CCuenta
 */
package cuentas;
/**
 * Clase CCuenta
 */
public class CCuenta {
	

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
	 * @param nom Nome
	 * @param cue Conta
	 * @param sal Saldo
	 * @param tipo Tipo
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
   	 * @return saldo actual
   	 */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
   	 * @param cantidad cantidade a ingresar
   	 * @throws Exception Non hai saldo ou cantidade negativa
   	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
   	 * @param cantidad cantidade a etirar
   	 * @throws Exception Non hai saldo ou cantidade negativa
   	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
   	 * @return Devolve o tipo de interés
   	 */
	private double getTipoInterés() {
		return tipoInterés;
	}
    /**
   	 * @param tipoInterés introduce o tipo de interese
   	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    /**
   	 * @return Devolve o saldo actual
   	 */
	private double getSaldo() {
		return saldo;
	}
    /**
   	 * @param saldo intruduce o tipo de interese
   	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    /**
   	 * @return Devolve a conta
   	 */
	private String getCuenta() {
		return cuenta;
	}
    /**
   	 * @param cuenta intruduce a conta
   	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
    /**
   	 * @return Devolve o nome
   	 */
	private String getNombre() {
		return nombre;
	}
    /**
   	 * @param nombre intruduce a conta
   	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
