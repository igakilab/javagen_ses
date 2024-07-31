class Class {
    private String className;
    private int numStudents;
    private int numPresent;
    
    public Class(String className) {
        this.className = className;
        this.numStudents = 0;
        this.numPresent = 0;
    }
    
    public String getClassName() {
        return this.className;
    }
    
    public int getNumStudents() {
        return this.numStudents;
    }
    
    public void addAttendance(boolean present) {
        this.numStudents++;
        if(present) {
            this.numPresent++;
        }
    }
    
    public void printAttendance() {
        System.out.println("出席：" + this.numPresent);
        System.out.println("欠席：" + (this.numStudents - this.numPresent));
    }
}