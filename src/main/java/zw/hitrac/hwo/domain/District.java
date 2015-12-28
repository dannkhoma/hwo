package zw.hitrac.hwo.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Daniel Nkhoma
 */
@Entity
public class District extends StaticDataBaseEntity {

    @ManyToOne
    private Province province;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
