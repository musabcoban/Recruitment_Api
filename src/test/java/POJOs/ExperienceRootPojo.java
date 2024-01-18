package POJOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceRootPojo {
    private ArrayList<ExperiencePojo> experiences;
    private String isNewGraduate;
    private String isStudent;
}
