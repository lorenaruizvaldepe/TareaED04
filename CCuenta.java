package cuentas;

public class CCuenta {
	/**
	 * Esta clase simula el comportamiento de una cuenta corriente.
	 * @author Borja Riveiro
	 * @version 1.0
	 * @since 27/02/2021
	 */
	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInterés;

	    /**
	     * Constructor por defecto
	     */	
	    public CCuenta()
	    {
	    }
	    
	    /**
	     * Constructor con parametros
	     * @param nom
	     * @param cue
	     * @param sal
	     * @param tipo
	     */	
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        setSaldo(sal);
	    }
	    /**
	     * Devuelve el saldo de la cuenta corriente.
	     * @return Saldo de la cuenta
	     */	
	    public double estado()
	    {
	        return getSaldo();
	    }

	    /**
	     * Ingresa cantidad en el saldo de la cuenta.
	     * @param cantidad
	     * @throws Si la cantidad es negativa lanza una excepcion
	     */	
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        setSaldo(getSaldo() + cantidad);
	    }
	    /**
	     * Retira cantidad en el saldo de la cuenta.
	     * @param cantidad
	     * @throws Si la cantidad es negativa o cero lanza una excepcion
	     * @throws Si el saldo es menor a la cantidad lanza una excepcion
	     */	
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        setSaldo(getSaldo() - cantidad);
	    }

		private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

		private String getCuenta() {
			return cuenta;
		}

		private void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		private double getSaldo() {
			return saldo;
		}

		private void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		private double getTipoInterés() {
			return tipoInterés;
		}

}
