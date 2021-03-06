/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.cronos.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "lesson")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @XmlAttribute(name = "id")
    private String idxml;
    @ManyToOne(fetch = FetchType.EAGER)
    private Subject subject;
    @OneToOne(fetch = FetchType.EAGER)
    private Classe classe;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Period> periods;
    @OneToOne(fetch = FetchType.EAGER)
    private Teacher teacher;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<ClassRoom> classrooms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdxml() {
        return idxml;
    }

    public void setIdxml(String idxml) {
        this.idxml = idxml;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

//    public List<Period> getPeriods() {
//        return periods;
//    }
//
//    public void setPeriods(List<Period> periods) {
//        this.periods = periods;
//    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
//
//    public List<ClassRoom> getClassrooms() {
//        return classrooms;
//    }
//
//    public void setClassrooms(List<ClassRoom> classrooms) {
//        this.classrooms = classrooms;
//    }
}
