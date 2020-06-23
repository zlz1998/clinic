package cn.project.mapper.medicalAdviceMapper;

import cn.project.entity.MedicalAdvice;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface MedicalAdviceMapper {
    List<MedicalAdvice> getAllMedicalAdvice();
    int addMedicalAdvice(@Param("prescriptionId") Integer prescriptionId, @Param("medicalAdviceId") Integer medicalAdviceId);
}
