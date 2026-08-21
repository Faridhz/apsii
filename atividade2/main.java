package atividade2;

public class main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Carlos",
                1001,
                3000.00,
                "10/01/2025"
        );

        FuncionarioCLT clt = new FuncionarioCLT(
                "João",
                1002,
                3000.00,
                "15/02/2025",
                200.00,
                400.00
        );

        Gerente gerente = new Gerente(
                "Marcos",
                1003,
                5000.00,
                "20/03/2024",
                300.00,
                500.00,
                12,
                0.10
        );

        Estagiario estagiario = new Estagiario(
                "Pedro",
                1004,
                1500.00,
                "01/08/2026",
                1200.00,
                30
        );

        System.out.println("===== FUNCIONÁRIO =====");
        System.out.println(funcionario);

        System.out.println("\n===== FUNCIONÁRIO CLT =====");
        System.out.println(clt);

        System.out.println("\n===== GERENTE =====");
        System.out.println(gerente);

        System.out.println("\n===== ESTAGIÁRIO =====");
        System.out.println(estagiario);
    }
}