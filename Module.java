
public class Module{
	String moduleCode;//Stores code of module e.g. COMP208
	String moduleName;//Stores name of module e.g. group project
	
	public Module(String inputModuleName, String inputModuleCode){
		moduleName = inputModuleName;
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public String getModuleCode(){
		return moduleCode;
	}
	
	public void setModuleName(String newModuleName){
		moduleName = newModuleName;
	}
	
	public void setModuleCode(String newModuleCode){
		moduleCode = newModuleCode;
	}
}