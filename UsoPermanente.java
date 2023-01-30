import javax.swing.JOptionPane;


    //Classe com tipo de Material a ser cadastrado!

public class UsoPermanente extends Material {

    private String categoria = "Uso Permanente";

    UsoPermanente() {}

    //Metodos modificadores

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    //Usando Polimorfismo - Sobreposição da Superclasse com a inclusão da informação sobre a categoria.
    @Override
    public void cadastrarMat() {
        JOptionPane.showMessageDialog(null, "Categoria: " + getCategoria());
        super.cadastrarMat();
       
    }
    
    //Metodo TOString para acessar as informações do ArrayList
    @Override
	public String toString() {
		return relatecMat();
	}





}
