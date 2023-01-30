import javax.swing.JOptionPane;

public class MenuOpcoes {
   //Atributos

    String nome;
    int opcao;
    boolean funfando = true;

    //Construtor

    public MenuOpcoes(String nome, int opcao) {
        this.nome = nome;
        this.opcao = opcao;
    }

    MenuOpcoes() {
    }

        //Menu para interção com Usuario.

    void mostrarMenu() {

        //Instanciação do objeto cadastrado

        UsoPermanente up = new UsoPermanente();

        while (funfando) {
            //Interface para Usuario;
            
            this.opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Menu\n" +

                            "\n1 - Cadastro de Materiais" +
                            "\n2 - Consultar Cadastros" +
                            "\n3 - Alterar Cadastros " +
                            "\n4 - Consultar Material por codigo" +
                            "\n5 - Excluir Cadastro " +
                            "\n6 - Entrada em Estoque " +
                            "\n7 - Baixa de Estoque " +
                            "\n8 - Sair do Programa"));

            //Estutura de decisão para executar o metodo escolhido pelo usuario;
            switch (this.opcao) {

                case 1:
                    up.cadastrarMat();

                    break;

                case 2:

                    up.toString();
                    break;

                case 3:
                    up.alterarCad();
                    break;

                case 4:
                    up.buscarCog();
                    break;

                case 5:
                    up.remover();
                    break;

                case 6:
                    up.incluirQuant();
                    break;

                case 7:

                    up.removerQuant();
                    break;
                case 8:

                    JOptionPane.showMessageDialog(null,
                            "Obrigada por utilizar nosso programa de cadastro!! " + "\n Saindo...");

                    funfando = false;
                    break;

            }
        }
    }
}