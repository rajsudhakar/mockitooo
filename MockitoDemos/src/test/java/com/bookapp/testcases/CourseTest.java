package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.service.Course;
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class CourseTest {
	@Spy
	Course course;
	@Mock
	Course mcourse;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		course=new Course();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		course=null;
	}
	
	@Test
	void testShowCourses() {
		List<String> actual=course.showCourse();
		System.out.println(actual);
	}
	@Test
	void testShowCourseMock() {
		when(mcourse.showCourse()).thenReturn(Arrays.asList("Java"));
		List<String> mactual=mcourse.showCourse();
		System.out.println(mactual);
	}
	

}
