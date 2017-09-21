
public class Utilities {
    /*
    * - This class is meant to store any utils that might help to get some general purpose or specific
    * task/functions get done faster without having to start from scratch
    * - There are functions that are not complete or that do not have any supporting classes, it's only meant for
    * reference and can't be used directly
    * Contains only a few utils
    * */

    // Using objectmapper to convert json to required class object
    ObjectMapper objectMapper = new ObjectMapper();
    ControllerResponse controllerResponse = objectMapper.readValue(mvcResult.getResponse().getContentAsByteArray(), ControllerResponse.class);

    JSONObject cr = new JSONObject(mvcResult.getResponse().getContentAsString());
    DataSourceData ds = gson.fromJson(cr.getJSONObject("data").toString(), DataSourceData.class);
    /* ---------------------------------------- */

    /*This function get a json string and converts it to class specified in tha parameter
    * input: json String
    * output: Object of the class specified in the argument returnClass
    * */
    public static <T> T getObjectFromControllerRespStr(String ControllerResponse, Class<T> returnClass) throws Exception {
        JSONObject cr = new JSONObject(ControllerResponse);

        if (cr.has("data") && cr.get("data") != null) {
            return returnClass.cast(new Gson().fromJson(cr.getString("data"), returnClass));
        }

        return returnClass.newInstance();
    }
    /* ---------------------------------------- */


    public static void main(String[] args) {

    }
}


