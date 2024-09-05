package bank.model;
import java.util.List;

public interface RegisterDao {
	    int createRecord(List<Register> lst);
		int deleteRecord(int accNumber);
		int updateRecord(List<Register> lst);
		List<Register> retriveRecord(int accNumber);
		List<Register> displayAll();
		

}
