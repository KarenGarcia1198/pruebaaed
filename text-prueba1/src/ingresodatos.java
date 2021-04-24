
public class ingresodatos {
	private int num;
	private String nombre;
	private String Apellido;
	private int DNI;
	public ingresodatos(int num, String nombre, String apellido) {
		super();
		this.num = num;
		this.nombre = nombre;
		Apellido = apellido;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	@Override
	public String toString() {
		return "ingresodatos [num=" + num + ", nombre=" + nombre + ", Apellido=" + Apellido + "]";
	}
	
	

}
