package POJOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperiencePojo {

    private String company;
    private int contractTypeId;
    private Object endDate;
    private String explanation;
    private int noticePeriodId;
    private String startDate;
    private boolean stillWorking;
    private String title;
    private ArrayList<Integer> toolIds;
    private int workPlaceId;
}

