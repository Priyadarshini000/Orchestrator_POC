import java.util.List;
import java.util.Map;

public class ExecutionExecutorOperation implements ExecutionExecutor{
    @Override
    public boolean executionExecuteOperation(List<Execution> executionList, boolean orchestratorPrerequisiteResult, List<Integer> data, Map<String, Boolean> orchestratorMap) {
        Execution execution;
        execution=executionList.get(0);
        execution.executeOperation(data);
        //data.add(orchestratorExecutionResult);
      //  System.out.println("Before execution:"+orchestratorPrerequisiteResult);
        if(data.get(data.size()-1)!=0) {
            System.out.println("Execution Result  :" + data.get(data.size() - 1));
            orchestratorPrerequisiteResult &=true;
            String process=execution.toString();
            orchestratorMap.put(process,true);
        }
        else {
            System.out.println("Execution Result is having error as value is :" + data.get(data.size() - 1));
            orchestratorPrerequisiteResult &=false;
            String process=execution.toString();
            orchestratorMap.put(process,false);
        }
      //  System.out.println("After execution:"+orchestratorPrerequisiteResult);
        return orchestratorPrerequisiteResult;
    }
}
