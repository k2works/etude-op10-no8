import java.util.HashMap;
import java.util.Map;

/**
 * Created by k2works on 2017/04/06.
 */
class PayrollDatabase {
    private static Map<Integer, Employee> itsEmployees = new HashMap<Integer, Employee>();
    private static Map<Integer, Employee> itsUnionMembers = new HashMap<Integer, Employee>();

    public static void AddEmployee(int empId, Employee e) {
        itsEmployees.put(empId, e);
    }

    public static Employee GetEmployee(int empId) {
        return itsEmployees.get(empId);
    }

    public static void DeleteEmployee(int empId) {
        itsEmployees.remove(empId);
    }

    public static void AddUnionMember(int memberId, Employee e) {
        itsUnionMembers.put(memberId, e);
    }

    public static Employee GetUnionMbember(int memberId) {
        return itsUnionMembers.get(memberId);
    }

    public static void RemoveUnionMember(int memberId) {
        itsUnionMembers.remove(memberId);
    }
}
