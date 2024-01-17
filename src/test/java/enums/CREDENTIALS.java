package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CREDENTIALS {
    ADMIN("tlrstestadmin@yopmail.com","Test123456!");
    private final String email;
    private final String password;

}
