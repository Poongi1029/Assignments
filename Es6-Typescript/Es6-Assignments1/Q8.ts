class Account
{
    constructor(id,name,balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

}
class Saving_Account extends Account
{
    constructor(P,R,N){
        let cash_credit=4000;
        super(P,R,N)
        return P*R*N;
    }
}
class Current_Account extends Account
{
   
    constructor(P,R,N){
        super(P,R,N);
        return P*R*N;
    }
}
let a1=new Saving_Account(4000,10,5);
