class addition{
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}
class methodoverloading {
    public static void main(String[] args) {
        addition obj = new addition();
        System.out.println(obj.add(11,11));  
    }
    
}
