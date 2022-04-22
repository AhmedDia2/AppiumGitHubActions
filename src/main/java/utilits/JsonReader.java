package utilits;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    //JSONData is filename "Tasks Data" , attributes is the number of data "so we have 2 because of taskname and taskDesc"
    public static Object[][] getJESONData(String JSON_Path, String JSON_Data, int JSON_Attributes) throws IOException, ParseException {
        //We should add dependency in Pom.xml file for JSON file
        //with the object we need to parse the JSON file using the JSON path
        Object object = new JSONParser().parse(new FileReader(JSON_Path));

        //create jsonobject to get JSON data and insert it in Array
        JSONObject jsonobject = (JSONObject) object;
        JSONArray jsonarray = (JSONArray) jsonobject.get(JSON_Data);

        Object[][] arr= new String[jsonarray.size()][JSON_Attributes];
        for (int i = 0; i<jsonarray.size(); i++){
            JSONObject object1 = (JSONObject) jsonarray.get(i);
            arr[i][0] = String.valueOf(object1.get("TaskName"));
            arr[i][1] = String.valueOf(object1.get("TaskDesc"));

        }
        return arr;
    }
}
