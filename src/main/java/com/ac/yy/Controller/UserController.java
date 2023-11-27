package com.ac.yy.Controller;

import com.ac.yy.DTO.ResponseDTO;
import com.ac.yy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired UserService userService;
    // 유저 정보 불러오기(User-Student Or User-Academic)
    @GetMapping("/{id}")
    public ResponseDTO<?> getUserByUid(@PathVariable("id") int id) {
        ResponseDTO<?> result = userService.getUserByUid(id);
        return result;
    }

    // 과정에 속한 학생 정보 불러오기
    @GetMapping("/students/{id}")
    public ResponseDTO<?> getStudentsByCourseId(@PathVariable("id") int id) {
        ResponseDTO<?> result = userService.getStudentsByCourseId(id);
        return result;
    }

    // 모든 강사 정보 불러오기
    @GetMapping("/trainers")
    public ResponseDTO<?> getAllTrainers() {
        ResponseDTO<?> result = userService.getAcademicsByDept(1);
        return result;
    }
    
    // 모든 매니저 정보 불러오기
    @GetMapping("/managers")
    public ResponseDTO<?> getAllManagers() {
        ResponseDTO<?> result = userService.getAcademicsByDept(0);
        return result;
    }
}