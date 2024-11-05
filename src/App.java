// classe mesmo nome do arquivo
class App { // classes são "substantivos", nomes próprios

    // método principal (ponto de entrada/entry point)
    public static void main(String ... params) {
        // quando "der pau":
        // 1: Reload Window
        // 2: Java: Clean Java Language Server Workspace

        System.out.println("Olá mundo!!!");
        // Tipagem:
        // Inteiros:
        System.out.println(5000); // literal numérico é int
        int valor = 5000; // +-2.1bi
        System.out.println(5_000_000_000L); // literal long
        System.out.println(Long.MAX_VALUE);
        long teste = 100_000_000_000_000L;
        teste = valor; // promoção tipo
        // type coercion // coerção (cast)
        int outra = (int) 5_000L; // downcasting
        System.out.println(outra);
        byte b = 0b00001000; // byte literal
        byte cor = (byte) 0xAF;
        System.out.println(b);
        short s = (short) 8_000_000;
        // 8 bits -> 16 bits -> 32 bits -> 64 bits
        // byte -> short -> int -> long
        float f = 4.555F; // 32 bits
        double d = 5.555; // 64 bits*
        float f2 = (float) 82234.3234543;
        double d2 = 343.232F;
        System.out.println(0.1F + 0.1F + 0.1);

        // char (primitivo caractere, inteiro)
        char letra = 'h';
        int num = (int) letra;
        System.out.println(num);
        char letra2 = 102; // 102 => f
        System.out.println(letra2);
        System.out.println((char) (letra2 - 32));
        // booleano
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = bool1 && bool2;
        System.out.println(bool3);
        boolean bool4 = bool1 || bool2; // pipe
        System.out.println(bool4);

        if (false) {
            System.out.println("Teste1");
            System.out.println("Teste2");
        }
        System.out.println("Teste3");

        // String (não é primitivo, é complexo (objeto))
        String curso = "TADS"; // objeto string
        System.out.println(curso);
        System.out.println(curso.toLowerCase());
        System.out.println("modular".toUpperCase());

        String teste1 = "curso";
        System.out.println(teste1.length());

        String teste2 = "😆🙂🙏🤑🤩";
        System.out.println(teste2);
        System.out.println(teste2.length());
        // emoticon :) :P >:( @-,-
        System.out.println("😆".charAt(0));
        System.out.println("😆".charAt(1));

    }
}