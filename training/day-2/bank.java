public class bank {
    String bankName,branch ;
    int bankNumber;
    bank(String bankName,String branch,int bankNumber){
        this.bankName=bankName;
        this.branch=branch;
        this.bankNumber=bankNumber;
    }
    public void displaybankDetails(){
            System.out.println(" the bankname is :"+ bankName);
            System.out.println(" the branch is :"+ branch);
            System.out.println(" the banknumber is :"+ bankNumber);
    }
}
