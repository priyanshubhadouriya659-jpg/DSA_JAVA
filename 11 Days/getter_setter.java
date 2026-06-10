class getter_setter {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.get_balance(7822);
        b1.Deposit_Method(7800);
      b1.withdraw(850);
    }

}

class Bank {
    private double bank_amount;

    // Bank() {
    //     bank_amount = 0;
    // }

    // setter
    public void Deposit_Method(double amount) {
        if (amount > 0) {
            bank_amount = bank_amount + amount;
        }

        else {
            System.out.println("invalid amount");

        }
    }
//getter
    public double get_balance(double amount) {
        return bank_amount=amount;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            bank_amount -= amount;
        } else if (amount > bank_amount) {
            System.out.println("insufficent amount");
        }
    }

    

}