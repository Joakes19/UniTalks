
public class GroupType{
	boolean module, accomodation, direct;//module = true if a module group, false if not. Ditto for accomodation and direct
	Module module;//Information about the module
	Accomodation accomodation;//Information about the accomodation
	
	public GroupType(boolean inputModule, boolean inputAccomodation, boolean inputDirect, Module inputGroupModule, Accomodation inputGroupAccomodation){
		module = inputModule;
		accomodation = inputAccomodation;
		direct = inputDirect;
		module = inputModule;
		accomodation = inputAccomodation;
	}
	
	public boolean getModule(){
		return module;
	}
	
	public boolean getAccomodation(){
		return accomodation;
	}
	
	public boolean getDirect(){
		return direct;
	}
	
	public Module getModuleInformation(){
		return module;
	}
	
	public Accomodation getAccomodationInformation(){
		return accomodation;
	}
	
	public void setModule(boolean newModule){
		module = newModule;
	}
	
	public void setAccomodation(boolean newAccomodation){
		accomodation = newAccomodation;
	}
	
	public void setDirect(boolean newDirect){
		direct = newDirect;
	}
	
	public void setModuleInformation(Module newModule){
		module = newModule;
	}
	
	public voud setAccomodationInformation(Accomodation newAccomodation){
		accomodation = newAccomodation;
	}
}