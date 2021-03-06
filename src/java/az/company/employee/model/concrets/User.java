package az.company.employee.model.concrets;

import az.company.employee.model.abstracts.Entity;
import java.time.LocalDateTime;

public class User implements Entity {

    private int id;

    private String email;

    private String password;

    private String name;

    private String surname;

    private int status;

    private String activationCode;

    private LocalDateTime expiredDate;

    private LocalDateTime createdDate;

    private String pswActivationCode;

    private LocalDateTime pswExpiredDate;

    private int roleId;

    private String roleName;
    
    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public LocalDateTime getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDateTime expiredDate) {
        this.expiredDate = expiredDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getPswActivationCode() {
        return pswActivationCode;
    }

    public void setPswActivationCode(String pswActivationCode) {
        this.pswActivationCode = pswActivationCode;
    }

    public LocalDateTime getPswExpiredDate() {
        return pswExpiredDate;
    }

    public void setPswExpiredDate(LocalDateTime pswExpiredDate) {
        this.pswExpiredDate = pswExpiredDate;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", surname=" + surname + ", status=" + status + ", activationCode=" + activationCode + ", expiredDate=" + expiredDate + ", createdDate=" + createdDate + ", pswActivationCode=" + pswActivationCode + ", pswExpiredDate=" + pswExpiredDate + ", roleId=" + roleId + '}';
    }

}
