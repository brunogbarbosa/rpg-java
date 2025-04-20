public class FabricaVilao {
    public static Vilao criarVilao(int nivel) {
        switch (nivel) {
            case 1:
                return new Vilao("LINGUAGEM C++", 20, 3, 1);
            case 2:
                return new Vilao("LINGUAGEM ASSEMBLY", 25, 5, 2);
            default:
                return new Vilao("COBOL >:", 30, 10, 3);
        }
    }
}