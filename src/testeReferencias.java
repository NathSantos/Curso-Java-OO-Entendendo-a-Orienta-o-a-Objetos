
public class testeReferencias {
	
	// Refer?ncias vs Objetos

	public static void main(String[] args) {
        conta primeiraConta = new conta(); 
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("? a mesma conta");                
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                            
    }

}
