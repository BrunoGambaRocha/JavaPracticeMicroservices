package br.com.brunoti.mentoriamicroservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brunoti.mentoriamicroservicos.entity.Setting;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
}
