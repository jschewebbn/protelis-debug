package bug282;

import org.protelis.lang.datatype.DeviceUID;

import org.protelis.lang.datatype.impl.IntegerUID;

import org.protelis.vm.ExecutionEnvironment;
import org.protelis.vm.NetworkManager;
import org.protelis.vm.impl.AbstractExecutionContext;

public class ExecutionContext extends AbstractExecutionContext<ExecutionContext> {
    private final NetworkManager networkManager;

    /**
     * Create a child context.
     * 
     * @param networkManager
     *            passed to parent constructor
     * @param environment
     *            passed to parent constructor
     */
    public ExecutionContext(final ExecutionEnvironment environment,
            final NetworkManager networkManager) {
        super(environment, networkManager);
        this.networkManager = networkManager;
    }

    @Override
    public Number getCurrentTime() {
        return System.currentTimeMillis();
    }

    @Override
    public DeviceUID getDeviceUID() {
      return new IntegerUID(0);
    }

    @Override
    public double nextRandomDouble() {
        return Math.random();
    }

    @Override
    protected ExecutionContext instance() {
        return new ExecutionContext(getExecutionEnvironment(), networkManager);
    }
  
}
