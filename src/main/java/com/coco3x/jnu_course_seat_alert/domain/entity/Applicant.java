package com.coco3x.jnu_course_seat_alert.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int courseType;
    @ManyToOne
    @Column(nullable = false)
    private Course course;
    @ManyToOne
    @Column(nullable = false)
    private User user;

    @Builder
    public Applicant(int courseType, Course course, User user) {
        this.courseType = courseType;
        this.course = course;
        this.user = user;
    }
}
