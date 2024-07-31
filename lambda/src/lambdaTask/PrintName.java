package lambdaTask;

@FunctionalInterface
public interface PrintName {
   public String getFullName(String lastName, String firstName);
}