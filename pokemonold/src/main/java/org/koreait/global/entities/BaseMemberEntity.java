package org.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // 엔티티 변화 확인
public abstract class BaseMemberEntity extends BaseEntity { // 공통 속성 정의

    @CreatedBy
    @Column(length=65, updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(length=65, insertable = false)
    private String modifiedBy;
}
