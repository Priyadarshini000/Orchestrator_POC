import java.util.List;
import java.util.Map;

public interface ExecutionExecutor {
    public boolean executionExecuteOperation(List<Execution> executionList, boolean orchestratorPrerequisiteResult, List<Integer> data, Map<String, Boolean> orchestratorMap);

}
