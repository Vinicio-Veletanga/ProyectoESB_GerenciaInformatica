package consumirapinube;
 

public class retiro   {
	 
	public String jbanco;
	public String jtipo;
	
	public Number jicuenta;
	public Number jimonto;
	
	public Integer jocuenta;
	public Integer jomonto;
	
	 

	public Integer getJocuenta(Number jicuenta) { 
		return jocuenta=(Integer) jicuenta;
	} 

	public Integer getJmonto(Number jimonto) {
		return jomonto=(Integer) jimonto;
	} 
}
