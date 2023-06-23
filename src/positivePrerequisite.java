import java.util.List;

public class checkPositive implements Prerequisite {
    @Override
    public boolean verify(List<Integer> data) {
        boolean positiveVerifyResult=true;
        for(Integer Data:data)
        {
            if(Data >=0)
                positiveVerifyResult=positiveVerifyResult &true;
            else
                positiveVerifyResult=positiveVerifyResult&false;
        }

        return positiveVerifyResult;
    }
}
