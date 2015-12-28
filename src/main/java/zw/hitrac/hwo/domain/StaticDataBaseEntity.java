package zw.hitrac.hwo.domain;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Daniel Nkhoma
 */
@MappedSuperclass
public abstract class StaticDataBaseEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String mohccUuid;
    private String name;
    private String description;

    public String getMohccUuid() {
        return mohccUuid;
    }

    public void setMohccUuid(String mohccUuid) {
        this.mohccUuid = mohccUuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaticDataBaseEntity)) {
            return false;
        }
        StaticDataBaseEntity other = (StaticDataBaseEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.hitrac.hwo.domain.BaseEntity[ id=" + id + " ]";
    }

}
