package zw.hitrac.hwo.domain;

import javax.persistence.Entity;

/**
 *
 * @author Daniel Nkhoma
 */
@Entity
public class HwoUser extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HwoUser)) {
            return false;
        }
        HwoUser other = (HwoUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.hitrac.hwo.domain.User[ id=" + id + " ]";
    }

}
