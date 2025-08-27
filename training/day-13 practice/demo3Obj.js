const bankaccount = {
    balance: 1000,
    deposit: function (amt) {
        this.balance += amt;
    },
    withdraw: function (amt) {
        this.balance -= amt;
    },
    getBalance: function (amt) {
        return this.balance;
    },
    getDetail: function(){
        return (` the balace : ${this.getBalance()}`);
    }

}

let savingaccount = Object.create(bankaccount);
savingaccount.accno = "sb001";
savingaccount.accholder = "Rakesh";
savingaccount.bank = "hdfc";
savingaccount.branch = "bangalore BTM";

let currentaccount = Object.create(bankaccount);
currentaccount.accno = "cb001";
currentaccount.accholder = "Rakesh";
currentaccount.bank = "hdfc";
currentaccount.branch = "bangalore BTM";

console.log(savingaccount.accholder)
savingaccount.deposit(120000);

console.log(savingaccount.getBalance());
console.log("the ssaving detail",savingaccount.getDetail());
console.log("the ssaving detail",savingaccount.getBalance());
