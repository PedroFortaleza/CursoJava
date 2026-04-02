package ExcepitionAula.ExcepitionTest;

import java.util.Scanner;

import ExcepitionAula.Dominio.LoginInvalidoExcepition;

public class LoginInvalidoExcepitionTest {
    public static void main(String[] args) {
        try{
            logar();
        }catch(LoginInvalidoExcepition e){
            e.printStackTrace();
        }

        
    }
    private static void logar() throws LoginInvalidoExcepition{
        Scanner scanner = new Scanner(System.in);
        String UsernameBD = "Rato";
        String PasswordBD = "123";
        System.out.println("Digite o Usuário: ");
        String UsuarioDigitado = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String PasswordDigitada = scanner.nextLine();

        if(!UsernameBD.equals(UsuarioDigitado) || !PasswordBD.equals(PasswordDigitada)){
        throw new LoginInvalidoExcepition("Usuario ou senha invalidos");
        }
        System.out.println("logado");

    }
}
