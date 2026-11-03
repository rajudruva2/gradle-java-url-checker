package training;
import java.net.URI;import java.net.http.*;
public class Main {
 public static void main(String[] args){
  if(args.length==0){System.out.println("Usage: gradle run --args='https://example.com'");return;}
  var c=HttpClient.newHttpClient();
  for(String u:args)try{var q=HttpRequest.newBuilder(URI.create(u)).method("HEAD",HttpRequest.BodyPublishers.noBody()).build();System.out.println(c.send(q,HttpResponse.BodyHandlers.discarding()).statusCode()+" "+u);}catch(Exception e){System.out.println("FAILED "+u);}
 }
}
