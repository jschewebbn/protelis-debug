package bug282;

import org.protelis.vm.impl.SimpleExecutionEnvironment;
import org.protelis.vm.impl.SimpleNetworkManager;
import org.protelis.vm.impl.SimpleExecutionEnvironment;

import org.protelis.lang.ProtelisLoader;

import org.protelis.vm.ProtelisVM;
import org.protelis.vm.ProtelisProgram;

public class Main {
  private final ProtelisVM vm;

  public static void main(final String[] args) {
    new Main();
  }

  private Main() {

    final String programStr = "true";
    final ProtelisProgram program = ProtelisLoader.parseAnonymousModule(programStr);
    
    vm = new ProtelisVM(program, new ExecutionContext(new SimpleExecutionEnvironment(), new SimpleNetworkManager()));
    
  }
  
}
