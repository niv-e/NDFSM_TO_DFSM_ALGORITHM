import java.util.Arrays;
import java.util.List;


import ac.il.afeka.Submission.Submission;

public class Main implements Submission, Assignment3 {

	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("0123", "4567");
	}

	@Override
	public String convert(String ndfsm) throws Exception {
		
		// TODO return an encoding of a deterministic finite state machines that accepts
		// the same language as ndfsm.
		
		return null;
	}

}
