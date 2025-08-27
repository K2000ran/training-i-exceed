class bankaccount {
    constructor(balance) {
        this.balance = balance;
    }
    deposit = function (amt) {
        this.balance += amt;
    }
    withdraw = function (amt) {
        this.balance -= amt;
    }
    getBalance = function (amt) {
        return this.balance;
    }

};

let bank = new bankaccount(10000);
bank.deposit(120000);
console.log(bank.getBalance());