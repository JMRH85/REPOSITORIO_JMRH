


public class Empleado {
	
	private int codigo;

	private String nombre;

    private String oficio;

    private Double salario;

    private String departamento;



    public Empleado(int codigo, String nombre, String oficio, Double salario, String departamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.oficio = oficio;
		this.salario = salario;
		this.departamento = departamento;
	}


	public int getCodigo() {
          return codigo;

    }


    public void setCodigo(int codigo) {
          this.codigo = codigo;

    }
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getOficio() {
		return oficio;
	}



	public void setOficio(String oficio) {
		this.oficio = oficio;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


    public void imprimirTodo() {

          imprimirCabecera();

          extracted();



    }

   

    private void imprimirCabecera() {

          System.out.println("Empresa ITT");

          System.out.println("************");

    }

   

    public void imprimirDatos() {

          extracted();

    }


	private void extracted() {
		System.out.println("Código: " + codigo);

          System.out.println("Nombre: " + nombre);

          System.out.println("Oficio: " + oficio);
	}



	

}
