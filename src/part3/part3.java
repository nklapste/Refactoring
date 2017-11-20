package part3;

class A {
    private int currentBalance;

    int withdrawFromBankAccount(int amountToBeWithdrawn) {

        if (amountToBeWithdrawn > currentBalance)

            return -1;

        else {

            currentBalance -= amountToBeWithdrawn;

            return 0;

        }

    }
}

class B {
    private int currentBalance;

    void withdrawFromBankAccount(int amountToBeWithdrawn) throws BalanceException {

        if (amountToBeWithdrawn > currentBalance)

            throw new BalanceException();// You can assume that BalanceException is defined

        currentBalance -= amountToBeWithdrawn;

    }

    // PLACEHOLDER IGNORE
    private class BalanceException extends Exception {
    }
}
