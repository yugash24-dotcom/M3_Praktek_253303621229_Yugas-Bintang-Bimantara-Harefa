public class Main {
    public static void main(String[] args) {

        // Membuat objek akun bank
        BankAccount akun = new BankAccount("123456789", "Yugas Harefa");

        // Menampilkan data awal
        System.out.println("Nama Pemilik : " + akun.getOwnerName());
        System.out.println("Saldo Awal   : " + akun.getBalance());

        System.out.println("\n--- TEST DEPOSIT ---");

        // Deposit berhasil
        akun.deposit(500000);

        // Deposit gagal (nilai minus)
        akun.deposit(-100000);

        System.out.println("\nSaldo Sekarang : " + akun.getBalance());

        System.out.println("\n--- TEST WITHDRAW ---");

        // Withdraw berhasil
        akun.withdraw(200000);

        // Withdraw gagal (melebihi saldo)
        akun.withdraw(1000000);

        System.out.println("\nSaldo Akhir : " + akun.getBalance());
    }
}
