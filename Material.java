import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Material extends Produtos {

    private int codigo = 1;
    private String nome;
    private String descricao;
    private double custo;
    protected int quantidade;
    public String categoria;

    // Instanciação do objeto ArrayList, para armazenamento das informações;

    ArrayList<Material> material = new ArrayList<>();

    int quantFixa;

    // Construtor
    public Material() {
    }

    @Override
    // Metodo de cadastro

    public void cadastrarMat() {

        Material m1 = new Material();

        JOptionPane.showMessageDialog(null, " Bem vindo ao cadastro de produtos");

        JOptionPane.showMessageDialog(null, "Codigo: " + codigo);

        String nome = (JOptionPane.showInputDialog(null, "Digite o nome do produto: "));

        String descricao = (JOptionPane.showInputDialog(null, "Digite a descrição do produto: "));

        double custo = (Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o custo do produto:")));

        int quantidade = (Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja colocar no estoque: ")));

        m1.setCodigo(codigo);
        m1.setNome(nome);
        m1.setDescricao(descricao);
        m1.setCusto(custo);
        m1.setQuantidade(quantidade);
        material.add(m1);

        codigo = codigo + 1;

    }

    @Override
    // Metodo relacionar produtos cadastrados
    public String relatecMat() {

        JOptionPane.showMessageDialog(null, "Relação de Produtos Cadastrados: ");

        for (int i = 0; i < material.size(); i++) {

            Material utemp = material.get(i);

            JOptionPane.showMessageDialog(null,
                    "O código: " + utemp.getCodigo() +
                            "\nNome: " + utemp.getNome() +
                            "\nDescrição:" + utemp.getDescricao() +
                            "\nCusto R$: " + utemp.getCusto() +
                            "\nQuantidade em Estoque:" + utemp.getQuantidade());
        }
        return categoria;
    }

    @Override
    // Metodo para buscar produto por código
    public void buscarCog() {

        JOptionPane.showMessageDialog(null, "Buscar Material por código");

        codigo = (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código que deseja Consultar:")));

        boolean encontrado = true;

        for (int i = 0; i < material.size(); i++) {

            Material temp = material.get(i);

            if (codigo == temp.getCodigo()) {

                JOptionPane.showMessageDialog(null, "Codigo encontrado");

                JOptionPane.showMessageDialog(null,
                        "\tO código: " + temp.getCodigo() +
                                "\nNome: " + temp.getNome() +
                                "\nDescrição:" + temp.getDescricao() +
                                "\nCusto R$: " + temp.getCusto() +
                                "\nQuantidade em Estoque:" + temp.getQuantidade());
                encontrado = true;

            }

        }

        if (encontrado == false) {

            JOptionPane.showMessageDialog(null, "Código não encontrado!");

        }
    }

    @Override
    // Metodo para aletrar informações do cadastro;

    public void alterarCad() {
        JOptionPane.showMessageDialog(null, "Alterar Cadastros: ");

        for (int i = 0; i < material.size(); i++) {

            Material temp = material.get(i);

            JOptionPane.showMessageDialog(null,
                    "[" + i + "]" + " Material: " + temp.getNome() + "\nQuantidade Atual: " + temp.getQuantidade());

        }

        int referencia = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Infome a referencia do produto que deseja alterar: "));

        String nome = (JOptionPane.showInputDialog(null, "Digite o nome do produto: "));

        String descricao = (JOptionPane.showInputDialog(null, "Digite a descrição do produto: "));

        double custo = (Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o custo do produto:")));

        Material m = material.get(referencia);
        m.setNome(nome);
        m.setDescricao(descricao);
        m.setCusto(custo);
    }

    @Override
    // Metodo incluir quantidade;
    public void incluirQuant() {
        int quantTemp;

        for (int i = 0; i < material.size(); i++) {

            Material temp = material.get(i);

            JOptionPane.showMessageDialog(null,
                    "[" + i + "]" + " Material: " + temp.getNome() + "\nQuantidade Atual: " + temp.getQuantidade());

            quantFixa = temp.getQuantidade();
        }

        int referencia = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Infome a referencia do produto que deseja alterar: "));

        quantTemp = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Infome o valor que deseja incluir no estoque: "));
        Material m4 = material.get(referencia);
        m4.setQuantidade(quantFixa + quantTemp);

    }

    @Override
    // Metodo para baixar estoque;
    public void removerQuant() {
        int quantTemp;

        for (int i = 0; i < material.size(); i++) {

            Material temp = material.get(i);

            JOptionPane.showMessageDialog(null,
                    "[" + i + "]" + " Material: " + temp.getNome() + "\nQuantidade Atual: " + temp.getQuantidade());

            if (temp.getQuantidade() > 1) {
            }

            quantFixa = temp.getQuantidade();

        }

        int referencia = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Infome a referencia do produto que deseja alterar: "));

        quantTemp = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Infome o valor que deseja incluir no estoque: "));
        Material m4 = material.get(referencia);
        m4.setQuantidade(quantFixa - quantTemp);

    }

    @Override
    // Metodo remover cadastro;
    public void remover() {
        JOptionPane.showMessageDialog(null, "Removendo Produto Cadastrado!! ");

        for (int i = 0; i < material.size(); i++) {

            Material temp = material.get(i);

            JOptionPane.showMessageDialog(null,
                    "[" + i + "]" + " Material: " + temp.getNome() + "\nQuantidade Atual: " + temp.getQuantidade());

        }
        int referencia = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Infome a referencia do produto que deseja incluir estoque: "));

        material.remove(referencia);

    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
