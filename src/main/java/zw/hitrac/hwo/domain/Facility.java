package zw.hitrac.hwo.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author tonderai ndangana
 */
@Entity
public class Facility extends StaticDataBaseEntity {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    private District district;

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
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
        if (!(object instanceof Facility)) {
            return false;
        }
        Facility other = (Facility) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.hitrac.hwo.domain.Facility[ id=" + id + " ]";
    }

}
