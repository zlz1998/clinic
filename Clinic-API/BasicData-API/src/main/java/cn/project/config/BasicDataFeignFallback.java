package cn.project.config;

import cn.project.controller.BasicDataFeign;
import cn.project.entity.Prescription_AdditionalFees;
import cn.project.utils.Response;
import cn.project.utils.ResponseEnum;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class BasicDataFeignFallback implements BasicDataFeign {
    //附加费用
    public Response getAllAdditionalFees() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }

    public Response addAdditionalFees(Prescription_AdditionalFees prescription_additionalFees) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //科室
    public Response getAllDepartment() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //诊断
    public Response getAllDiagnosisType() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }

    public Response addDiagnosisType(Integer prescriptionId, String diagnosisType) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //员工
    public Response getAllEmployee(Integer id) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //医嘱
    public Response getAllMedicalAdvice() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }

    public Response addMedicalAdvice(Integer prescriptionId, String medicalAdvice) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //患者
    public Response getPatientById(Integer id) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }

    public Response getAllPatient() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //处方
    public Response getAllPrescriptionType() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }


    //模板
    public Response getAllTemplate(Integer pageNo, Integer pageSize, Integer prescriptionTypeId, Integer templatePermission, String templateNoOrName) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }

    public Response getTemplateById(Integer id) {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }

    @Override
    public Response test2() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody("服务器未能响应");
    }
}
