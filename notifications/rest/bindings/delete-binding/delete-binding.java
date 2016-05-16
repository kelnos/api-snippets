import com.twilio.sdk.Twilio;
import com.twilio.sdk.resource.notifications.v1.service.Binding;

public class DeleteBinding {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "{{ auth_token }}";

  public static void main(String args[]) {
    // Initialize the client
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    // Delete a binding
    boolean response = Binding.delete("ISxxx", "BSxxx").execute();
    System.out.println("Success deleting Binding: " + response);
  }
}