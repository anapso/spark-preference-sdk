import controller.PreferenceController;
import spark.servlet.SparkApplication;
import util.Path;

import static spark.Spark.post;

public class Endpoint implements SparkApplication {

    @Override
    public void init() {

        post(Path.Web.CREATE_PREFERENCE, PreferenceController::create);

    }
}
