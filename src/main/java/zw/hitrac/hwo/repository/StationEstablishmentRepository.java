/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.StationEstablishment;

/**
 *
 * @author Tonderai Ndangana
 */
public interface StationEstablishmentRepository  extends JpaRepository<StationEstablishment, Long> {
 
     public StationEstablishment  findByUuid(String uuid);
    
}
