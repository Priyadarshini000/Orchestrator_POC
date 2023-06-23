import java.util.List;

public class doubleReport implements Report{
    @Override
    public int report(List<Integer> data) {
        int doubleReportResult=0;
        if(data.get(data.size()-1)!=null)
            doubleReportResult=data.get(data.size()-1);
        else
        {
            doubleReportResult=0;
        }
        return doubleReportResult;
    }
}
