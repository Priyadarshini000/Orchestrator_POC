import java.util.List;
import java.util.Map;

public interface PrerequisiteExecutor {

    //public Map<String, Boolean> prerequisiteExecuteOperation(List<Prerequisite> prerequisiteList,boolean orchestratorPrerequisiteResult,List<Integer> data,Map<String,Boolean> orchestratorMap);
    // public boolean prerequisiteExecuteOperation(List<Prerequisite> prerequisiteList,boolean orchestratorPrerequisiteResult,List<Integer> data,Map<Prerequisite, Boolean> orchestratorMap);

    public boolean prerequisiteExecuteOperation(List<Prerequisite> prerequisiteList, boolean orchestratorPrerequisiteResult, List<Integer> data, Map<String, Boolean> orchestratorMap);


}
