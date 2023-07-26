class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private String empBranchName;
    private String empBankName;

    

    public Employee() {

    }


    Employee(int empId,String empName,String empDesignation,String empBranchName,String empBankName){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empBranchName = empBranchName;
        this.empBankName = empBankName;
    }
    public int getEmpId (){
        return empId;
    }
    public void setEmpId(int empId)   
    {  
        this.empId = empId;  
    }  
    public String getEmpName (){
        return empName;
    }
    public void setEmpName(String empName)   
    {  
        this.empName = empName;  
    }  
    public String getEmpDesignation (){
        return empDesignation;
    }
    public void setDesignation(String empDesignation)   
    {  
        this.empDesignation = empDesignation;  
    }  
    public String getEmpBranchName (){
        return empBranchName;
    }
    public void setEmpBranchName(String empBranchName)   
    {  
        this.empBranchName = empBranchName;  
    }  
    public String getEmpBankName (){
        return empBankName;

    }
    public void setEmpBankName(String empBankName)   
    {  
        this.empBankName = empBankName;  
    }  
    public String toString (){
        return "{Id= "+ empId + " name= " + empName + " Designation= " + empDesignation + " Branch= " + empBranchName + " Bank= " +empBankName+"}";
    }

}
