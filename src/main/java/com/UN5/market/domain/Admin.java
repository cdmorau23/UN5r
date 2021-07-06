package com.UN5.market.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Admin {
    private int adminId;
    private String adminname;
    private String admincorreo;
    private String admincontrasenia;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdmincorreo() {
        return admincorreo;
    }

    public void setAdmincorreo(String admincorreo) {
        this.admincorreo = admincorreo;
    }

    public String getAdmincontrasenia() {
        return admincontrasenia;
    }

    public void setAdmincontrasenia(String admincontrasenia) {
        this.admincontrasenia = admincontrasenia;
    }

}
