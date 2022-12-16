


public class IOs implements Aparelho_Telefonico, ReprodutorMusical, Navegador_Internet {
    


    // REPRODUTOR MUSICAL

    public void tocarMusica(){
        System.out.println("Tocando música");
    }

    public void pausarMusica(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(){
        System.out.println("Música selecionada");
    }

    // NAVEGADOR NA INTERNET

    public void exibirPagina(){
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }

    // APARELHO TELEFONICO

    public void ligar(){
        System.out.println("Efetuando ligação");
    }

    public void atender(){
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
}

