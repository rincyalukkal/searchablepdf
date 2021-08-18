package cordova.plugin.pdfbox;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class pdfbox extends CordovaPlugin {

     @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if (action.equals("createsearchablepdf")) {

         this.createsearchablepdf(args,callbackContext);
         return true;
     }

        return false;
    }

 private void createsearchablepdf(JSONArray args,CallbackContext callback){
  
      if(args!=null)
      {

          try{
          var p1=args.getJSONObject(0).getString("param1");//image
          var p2=args.getJSONObject(0).getString("param2");//text layer

           callback.success("result" +p1+"..."+p2 );
          }

          catch(Exception ex){
          callback.error("Something went wrong" +ex);

          }
      }
      else{

          callback.error("please do not pass null");

      }

    }




    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }
}
