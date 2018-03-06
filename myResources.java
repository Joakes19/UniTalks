// default (English language, United Kingdom)
 public class MyResources extends ResourceBundle {
     public Object handleGetObject(String key) {
         if (key.equals("okKey")) return "Ok";
         if (key.equals("cancelKey")) return "Cancel";
         return null;
     }

     public Enumeration<String> getKeys() {
         return Collections.enumeration(keySet());
     }

     // Overrides handleKeySet() so that the getKeys() implementation
     // can rely on the keySet() value.
     protected Set<String> handleKeySet() {
         return new HashSet<String>(Arrays.asList("okKey", "cancelKey"));
     }
 }

 // Japanese language
 public class MyResources_jp extends MyResources {
     public Object handleGetObject(String key) {
         // don't need okKey, since parent level handles it.
         if (key.equals("cancelKey")) return "ƒLƒƒƒ“ƒZƒ‹";
         return null;
     }

     protected Set<String> handleKeySet() {
         return new HashSet<String>(Arrays.asList("cancelKey"));
     }
 }
