import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();

        Employee emp = new Employee();


        // 1 no employee
        emp.setEmpId(0);
        emp.setEmpName("Shahin");
        emp.setDesignation("HR");
        emp.setEmpBankName("Sona-Ali");
        emp.setEmpBranchName("Mirpur");

        e.add(new Employee(emp.getEmpId(),emp.getEmpName(),emp.getEmpDesignation(),emp.getEmpBranchName(),emp.getEmpBankName()));
        System.out.println("Addition of an employee's information");
        System.out.println("List: "+e.toString());
        
        // 2nd employee
        emp.setEmpId(2);
        emp.setEmpName("Shahin-ali");
        emp.setDesignation("HR");
        emp.setEmpBankName("Sona-Ali");
        emp.setEmpBranchName("Mirpur");

        e.add(new Employee(emp.getEmpId(),emp.getEmpName(),emp.getEmpDesignation(),emp.getEmpBranchName(),emp.getEmpBankName()));
        System.out.println("List: "+e.toString()); 


        

    }  

    }

