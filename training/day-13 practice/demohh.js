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
let businessbankaccount=Object.create(bankaccount,{accno:{value:"bba01",configurable:true,writable:true,enumerable:true},
    holder:{value:"astosh",writable:false,configurable:true,enumerable:true},
    balance:{value:1,writable:true}});
businessbankaccount.holder="abcd";
console.log(businessbankaccount.holder);
console.log(businessbankaccount.balance);
businessbankaccount.deposit(200000);
console.log(businessbankaccount.balance);
businessbankaccount.withdraw(50001);
console.log(businessbankaccount.balance);
