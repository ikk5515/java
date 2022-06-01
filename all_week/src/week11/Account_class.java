public class Account_class {
    private int balance;
    private String accNo;
    private String owner;

    public Account_class() {

    }

    public Account_class(String accNo, String owner, int balance) {
        this.accNo = accNo;
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(balance >= 0 && balance <= 1000000) {
            this.balance += balance;
        }
        else {
            System.out.println("잔고 설정 오류");
        }
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void Print_acc() {
        System.out.println("<계좌조회>");
        System.out.println(this.getAccNo() +" " + this.getOwner() +" "+ this.getBalance());
    }
}
