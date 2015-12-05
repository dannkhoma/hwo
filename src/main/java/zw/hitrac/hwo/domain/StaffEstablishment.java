package zw.hitrac.hwo.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Tonderai Ndangana
 */
@Entity
public class StaffEstablishment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer totalNumberOfPost;
    private Integer vacantPost;
    private Integer filledPost;
    private String  mohccUuid;

    public String getMohccUuid() {
        return mohccUuid;
    }

    public void setMohccUuid(String mohccUuid) {
        this.mohccUuid = mohccUuid;
    }
    
            
    @ManyToOne
    private Post post;

    public Integer getTotalNumberOfPost() {
        return totalNumberOfPost;
    }

    public void setTotalNumberOfPost(Integer totalNumberOfPost) {
        this.totalNumberOfPost = totalNumberOfPost;
    }

    public Integer getVacantPost() {
        return vacantPost;
    }

    public void setVacantPost(Integer vacantPost) {
        this.vacantPost = vacantPost;
    }

    public Integer getFilledPost() {
        return filledPost;
    }

    public void setFilledPost(Integer filledPost) {
        this.filledPost = filledPost;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
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
        if (!(object instanceof StaffEstablishment)) {
            return false;
        }
        StaffEstablishment other = (StaffEstablishment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.hitrac.hwo.domain.StationEstablishment[ id=" + id + " ]";
    }

}
