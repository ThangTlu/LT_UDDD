package tuan41;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tuan41VolleyFn {
    String strJson="";

    public void getJsonArrayOfObject(Context context, TextView textView){
        //Tạo request
        RequestQueue queue = Volley.newRequestQueue(context);


        //URL
        String url="http://http://batdongsansbc.000webhostapp.com/thanglong/array_json_new.json";
        //Gọi Request
        JsonArrayRequest request = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //chuyen mang sang cac doi tuong
                        for(int i=0;i< response.length();i++){
                            try {
                                JSONObject person = response.getJSONObject(i);//lay từng đối tuownjg
                                String id = person.getString("id");
                                String name = person.getString("name");
                                String email = person.getString("email");
                                strJson += "Id: "+ id +"\n";
                                strJson += "name: "+ id +"\n";
                                strJson += "email: "+ id +"\n";
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            textView.setText(strJson);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        //JsonArrayRequest
        //thực thi Request

    }
}
