package by.tms.sportcenter.entity;

import by.tms.sportcenter.enums.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(schema = "sportcenter", name = "customers")
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "customer_worker_id")
public class Customer extends User{
    @Column(name = "last_visit")
    private LocalDate lastVisit;
    @Column(name = "phone_number")
    private String phoneNumber;
    private UserStatus status;
    private BigDecimal summ;
    @Column(name = "first_visit")
    private LocalDate firstVisit;
}
