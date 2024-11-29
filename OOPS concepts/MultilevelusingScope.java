class F {
    public void info() {
        System.out.println("Father");
    }
}

class C extends F {
    public void Info() {
        System.out.println("Child");
    }

    public void cInfo() {
        super.info();
    }
}