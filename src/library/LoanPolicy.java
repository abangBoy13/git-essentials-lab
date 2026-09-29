package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) {
        if (type == MemberType.STUDENT) return 3;   // student limit
        if (type == MemberType.FACULTY) return 5;   // faculty limit
        return 2;                                   // default for others
    }

    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}
