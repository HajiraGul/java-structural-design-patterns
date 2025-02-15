package compositepatterndemo;
public class CompositePatternDemo
{
    public static void main(String[] args)
    {
        Employee CEO=new Employee("John", "CEO", 300000);
         Employee headsales=new Employee("John Sanny", "Head Sales", 300000);
          Employee headmarketing=new Employee("Harry", "Head Marketing", 300000);
           Employee clerk1=new Employee("Max", "Marketing", 300000);
            Employee clerk2=new Employee("Root", "Marketing", 300000);
             Employee salesExecutive1=new Employee("Butter", "Sales", 300000);
              Employee salesExecutive2=new Employee("Maxwell", "Sales", 300000);
              CEO.add(headsales);
              CEO.add(headmarketing);
              headsales.add(salesExecutive1);
              headsales.add(salesExecutive2);
              headmarketing.add(clerk1);
               headmarketing.add(clerk2);
               System.out.println(CEO);
               for(Employee headEmployee : CEO.getSubordinates())
               {
                   System.out.println(headEmployee);
               
               for(Employee employee:headEmployee.getSubordinates())
               {
                   System.out.println(employee);
               }    
          }
    }
}
