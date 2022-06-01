package week13;

public interface Lendable {
    public byte STATE_BORROWED = 1;     // 대충중
    public byte STATE_NORMAL = 0;       // 대출 가능

    void checkOut(String person, String date);
    void checkIn();
}
