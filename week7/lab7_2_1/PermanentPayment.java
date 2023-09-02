package lab7_2_1;

interface PermanentPayment extends Payment {
    final double hour = 8;
    final double day = 30;
    
    double calculateSalary();

}
