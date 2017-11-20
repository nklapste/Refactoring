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

/*
 * The "Replace Error Code with Exception" refactoring method was used to convert A to B.
 *
 * B is superior to A as it returns a UNIQUE and EXPLICIT exception indicating abnormal behaviour. A does
 * not make note of any withdrawal problems in its design (rather returning -1) which is an
 * non-explicit "error-state" which can be mistaken as normal behaviour.
 * B can be later be made to handle more robust situations, and is direct and explicit in noting
 * problems within withdrawal.
 * A creates further design problems later-on as one has to deal with the return value of -1 and create their
 * own "catch" (possibly additional if statements in higher levels of code checking for -1 return values).
 * B throws an exception which can be caught cleanly and dealt appropriately with built in methods of the language used
 * (assuming the language used has basic error handling).
 */