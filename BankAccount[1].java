public class BankAccount {

    // Atribut dibuat PRIVATE (keamanan data)
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor (saldo otomatis 0.0)
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber; // inisialisasi nomor rekening
        this.ownerName = ownerName;         // inisialisasi nama pemilik
        this.balance = 0.0;                 // saldo awal
    }

    // Getter hanya untuk ownerName
    public String getOwnerName() {
        return ownerName;
    }

    // Getter hanya untuk balance
    public double getBalance() {
        return balance;
    }

    // Method untuk menabung
    public void deposit(double amount) {
        // validasi: tidak boleh <= 0
        if (amount <= 0) {
            System.out.println("❌ Deposit gagal! Jumlah harus lebih dari 0.");
        } else {
            balance += amount;
            System.out.println("✅ Deposit berhasil: " + amount);
        }
    }

    // Method untuk tarik tunai
    public void withdraw(double) amount {
        // validasi: saldo tidak cukup
        if (amount > balance) {
            System.out.println("❌ Penarikan gagal! Saldo tidak cukup.");
        } else {
            balance -= amount;
            System.out.println("✅ Penarikan berhasil: " + amount);
        }
    }
}
