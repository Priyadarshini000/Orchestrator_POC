import java.util.List;

public class checkEven implements Prerequisite {
    @Override
    public boolean verify(List<Integer> data) {
        boolean evenVerifyResult=true;
        for(Integer Data:data)
        {
            if(Data %2==0)
                evenVerifyResult=evenVerifyResult &true;
            else
                evenVerifyResult=evenVerifyResult&false;
        }

         return evenVerifyResult;
    }
}
