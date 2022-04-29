package site.metacoding.datatest.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Travle {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(nullable = true)
    private String 경도도;

    @Column(nullable = true)
    private String 관광지아이디;

    @Column(nullable = true)
    private String 관광지명;

    @Column(nullable = true)
    private String 실내구분;

    @Column(nullable = true)
    private String 위도도;

    @Column(nullable = true)
    private String 이동시간;

    @Column(nullable = true)
    private String 지역아이디;

    @Column(nullable = true)
    private String 코스아이디;

    @Column(nullable = true)
    private String 코스순서;

    @Column(nullable = true)
    private String 테마명;

    @Column(nullable = true)
    private String 테마분류;

    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime updateDate;

    
}
