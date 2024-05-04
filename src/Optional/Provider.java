package Optional;

import java.util.Optional;

public class Provider {
    public Optional<String> getName(){
        String s=null;
        return Optional.ofNullable(s);
    }
}
