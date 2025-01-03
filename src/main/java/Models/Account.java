package Models;

// @SuppressWarnings("unused")
public class Account extends Model {
    private static Account instance;

    private String username;
    private String password;
    private Time createdTime;

    private Account() {
    }

    // only one Account the entire time
    public static Account getInstance() {
        return (instance == null) ? instance = new Account() : instance;
    }

    public static void clearInstance() {
        instance = null;
    }

    public boolean initAccount(String username, String password, Time createdTime, boolean isAdmin) {
        this.username = username;
        this.password = password;

        this.createdTime = createdTime;
        if (!DataBase.accountValidate(this) || !DataBase.IdDistributor(this)) {
            return false;
        }
        if (isAdmin)
            setId(getId() + ":admin");
        save();
        return getId() != null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatedTime(Time createdTime) {
        this.createdTime = createdTime;
    }

    public Time getCreatedTime() {
        return createdTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    // public boolean isExist() {
    // return DataBase.accountValidate(this);
    // }

    // public boolean isAdmin() {
    // if (true) {
    // return isAdmin = true;
    // } else {
    // return isAdmin = false;
    // }
    // }

    // WARNING: LEGACY CODE replaced by database.vormit()
    // public boolean earnId() {
    //
    // return (this.id != null) ? true : false;
    // }

    // public boolean recoverId() {
    // // for existed account to recover ID
    // if (isExist) {
    // }
    // return (this.id != null) ? true : false;
    // }
}
