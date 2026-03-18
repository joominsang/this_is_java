import com.google.gson.Gson;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestJson {
    public void test() {
        PatientOfAnimal cat1 = new PatientOfAnimal(
                "야옹이", "eiskd922k399a"
                , Calendar.getInstance().getTime()
                , Calendar.getInstance().getTime()
                , 0
        );

        // https://github.com/google/gson/blob/main/UserGuide.md#primitives-examples
        // GSON 개발시 참고할 매뉴얼
        Gson gson = new Gson();
        String s = gson.toJson(cat1);
        System.out.println(s);

        PatientOfAnimal result = gson.fromJson(s, PatientOfAnimal.class);
        System.out.println(result.toString());
    }
}
