package demo.mvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "学生成绩查询")
public class User implements Serializable {

    /**
     * serial version id.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "Student_ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "Student_NAME", nullable = false)
    private String name;

    //@Column(name = "USER_EMAIL", unique = true, nullable = false, length = 64)
    //private String email;

    @Column(name = "Student_SCORE", nullable = false)
    private Sring score;

    @Column(name = "Student_PASSWORD", nullable = false, length = 64)
    private String password;

    @Column(name = "CREATED_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String createdAt;

    @Column(name = "REMOVE_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String removeAt;
    
    @Column(name = "UPDATED_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String updatedAt;
    
    @Column(name = "SHOW_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String showAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public Date getRemoveAt() {
        return removeAt;
    }

    public void setRemoveAt(Date removeAt) {
        this.removeAt = removeAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getShowAt() {
        return showAt;
    }

    public void setShowAt(Date showAt) {
        this.showAt = showAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
