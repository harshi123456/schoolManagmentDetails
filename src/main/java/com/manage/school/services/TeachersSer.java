package com.manage.school.services;

import com.manage.school.models.Student;
import com.manage.school.models.Teachers;
import com.manage.school.repository.TeachersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeachersSer {
    @Autowired
    private TeachersRepo teachersRepo;
    public Teachers addTeacher(Teachers teachers){
        return teachersRepo.save(teachers);
    }

    public List<Teachers> getTeachers(){

        return teachersRepo.findAll();
    }



	public Teachers getByTID(long TiD) {
		// TODO Auto-generated method stub
        Optional<Teachers> model=teachersRepo.findById(TiD);

        if (model.isPresent())
        {
            return model.get();
        }
		return null;
	}

}
