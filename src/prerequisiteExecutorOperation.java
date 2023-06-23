import java.util.List;
import java.util.Map;

public class prerequisiteExecutorOperation implements PrerequisiteExecutor {
    @Override
   // public Map<String, Boolean> prerequisiteExecuteOperation(List<Prerequisite> prerequisiteList, boolean orchestratorPrerequisiteResult, List<Integer> data,Map<String,Boolean> orchestratorMap) {
    public boolean prerequisiteExecuteOperation(List<Prerequisite> prerequisiteList, boolean orchestratorPrerequisiteResult, List<Integer> data,Map<String,Boolean> orchestratorMap) {

        for (Prerequisite prerequisites:prerequisiteList )
        //prerequisites = prerequisiteList.get(0);
        {
            if (prerequisites.verify(data)) {
                orchestratorPrerequisiteResult = orchestratorPrerequisiteResult & true;
                String process=prerequisites.toString();
                orchestratorMap.put(process,true);
            }
            else {
                orchestratorPrerequisiteResult=orchestratorPrerequisiteResult &false;
                String process=prerequisites.toString();
                orchestratorMap.put(process,false);
                // reports.report(prerequisites);
                //break;
            }
        }
        return orchestratorPrerequisiteResult;
    }
}
