package coms.beans;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    Integer userId;
    String userName;
    String password;
    Integer userType;
    Integer roleId;
    Integer userState;
}
