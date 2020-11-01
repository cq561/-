package shiyan;

import shiyan.Personner;

class Teacher extends Personner{
	public Teacher(int id, String name, String sex) {
		super(id, name, sex);
	}
	public Teacher() {
		super(id, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}
