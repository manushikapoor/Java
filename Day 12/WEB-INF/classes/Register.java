public class Register{  
private String name,password,password2;  
  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getPassword() {  
    return password;  
}  
public void setPassword(String password2) {  
    this.password = password;  
}  
public String getPassword2() {  
    return password2;  
}  
public void setPassword2(String password2) {  
    this.password2 = password2;  
}  

public boolean validate(){  
    if(password.equals(password2)){  
        return true;  
    }  
    else{  
        return false;  
    }  
}  
}  