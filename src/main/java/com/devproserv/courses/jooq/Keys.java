/*
 * This file is generated by jOOQ.
 */
package com.devproserv.courses.jooq;


import com.devproserv.courses.jooq.tables.Archive;
import com.devproserv.courses.jooq.tables.Courses;
import com.devproserv.courses.jooq.tables.Lecturers;
import com.devproserv.courses.jooq.tables.StudentCourses;
import com.devproserv.courses.jooq.tables.Students;
import com.devproserv.courses.jooq.tables.Users;
import com.devproserv.courses.jooq.tables.records.ArchiveRecord;
import com.devproserv.courses.jooq.tables.records.CoursesRecord;
import com.devproserv.courses.jooq.tables.records.LecturersRecord;
import com.devproserv.courses.jooq.tables.records.StudentCoursesRecord;
import com.devproserv.courses.jooq.tables.records.StudentsRecord;
import com.devproserv.courses.jooq.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>coursedb</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CoursesRecord, Integer> IDENTITY_COURSES = Identities0.IDENTITY_COURSES;
    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ArchiveRecord> KEY_ARCHIVE_PRIMARY = UniqueKeys0.KEY_ARCHIVE_PRIMARY;
    public static final UniqueKey<CoursesRecord> KEY_COURSES_PRIMARY = UniqueKeys0.KEY_COURSES_PRIMARY;
    public static final UniqueKey<LecturersRecord> KEY_LECTURERS_PRIMARY = UniqueKeys0.KEY_LECTURERS_PRIMARY;
    public static final UniqueKey<StudentsRecord> KEY_STUDENTS_PRIMARY = UniqueKeys0.KEY_STUDENTS_PRIMARY;
    public static final UniqueKey<StudentCoursesRecord> KEY_STUDENT_COURSES_PRIMARY = UniqueKeys0.KEY_STUDENT_COURSES_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_USER_ID_UNIQUE = UniqueKeys0.KEY_USERS_USER_ID_UNIQUE;
    public static final UniqueKey<UsersRecord> KEY_USERS_LOGIN_UNIQUE = UniqueKeys0.KEY_USERS_LOGIN_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ArchiveRecord, StudentCoursesRecord> FK_ARCHIVE_STUDENT_COURSES1 = ForeignKeys0.FK_ARCHIVE_STUDENT_COURSES1;
    public static final ForeignKey<CoursesRecord, LecturersRecord> FK_COURSES_LECTURERS1 = ForeignKeys0.FK_COURSES_LECTURERS1;
    public static final ForeignKey<LecturersRecord, UsersRecord> FK_LECTURERS_USERS1 = ForeignKeys0.FK_LECTURERS_USERS1;
    public static final ForeignKey<StudentsRecord, UsersRecord> FK_STUDENTS_USERS1 = ForeignKeys0.FK_STUDENTS_USERS1;
    public static final ForeignKey<StudentCoursesRecord, CoursesRecord> FK_STUDENT_COURSES_COURSES1 = ForeignKeys0.FK_STUDENT_COURSES_COURSES1;
    public static final ForeignKey<StudentCoursesRecord, StudentsRecord> FK_STUDENT_COURSES_STUDENTS1 = ForeignKeys0.FK_STUDENT_COURSES_STUDENTS1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CoursesRecord, Integer> IDENTITY_COURSES = Internal.createIdentity(Courses.COURSES, Courses.COURSES.COURSE_ID);
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.USER_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ArchiveRecord> KEY_ARCHIVE_PRIMARY = Internal.createUniqueKey(Archive.ARCHIVE, "KEY_archive_PRIMARY", Archive.ARCHIVE.COURSE_ID, Archive.ARCHIVE.STUD_ID);
        public static final UniqueKey<CoursesRecord> KEY_COURSES_PRIMARY = Internal.createUniqueKey(Courses.COURSES, "KEY_courses_PRIMARY", Courses.COURSES.COURSE_ID, Courses.COURSES.LECT_ID);
        public static final UniqueKey<LecturersRecord> KEY_LECTURERS_PRIMARY = Internal.createUniqueKey(Lecturers.LECTURERS, "KEY_lecturers_PRIMARY", Lecturers.LECTURERS.LECT_ID);
        public static final UniqueKey<StudentsRecord> KEY_STUDENTS_PRIMARY = Internal.createUniqueKey(Students.STUDENTS, "KEY_students_PRIMARY", Students.STUDENTS.STUD_ID);
        public static final UniqueKey<StudentCoursesRecord> KEY_STUDENT_COURSES_PRIMARY = Internal.createUniqueKey(StudentCourses.STUDENT_COURSES, "KEY_student_courses_PRIMARY", StudentCourses.STUDENT_COURSES.COURSE_ID, StudentCourses.STUDENT_COURSES.STUD_ID);
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, "KEY_users_PRIMARY", Users.USERS.USER_ID);
        public static final UniqueKey<UsersRecord> KEY_USERS_USER_ID_UNIQUE = Internal.createUniqueKey(Users.USERS, "KEY_users_user_id_UNIQUE", Users.USERS.USER_ID);
        public static final UniqueKey<UsersRecord> KEY_USERS_LOGIN_UNIQUE = Internal.createUniqueKey(Users.USERS, "KEY_users_login_UNIQUE", Users.USERS.LOGIN);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<ArchiveRecord, StudentCoursesRecord> FK_ARCHIVE_STUDENT_COURSES1 = Internal.createForeignKey(com.devproserv.courses.jooq.Keys.KEY_STUDENT_COURSES_PRIMARY, Archive.ARCHIVE, "fk_archive_student_courses1", Archive.ARCHIVE.COURSE_ID, Archive.ARCHIVE.STUD_ID);
        public static final ForeignKey<CoursesRecord, LecturersRecord> FK_COURSES_LECTURERS1 = Internal.createForeignKey(com.devproserv.courses.jooq.Keys.KEY_LECTURERS_PRIMARY, Courses.COURSES, "fk_courses_lecturers1", Courses.COURSES.LECT_ID);
        public static final ForeignKey<LecturersRecord, UsersRecord> FK_LECTURERS_USERS1 = Internal.createForeignKey(com.devproserv.courses.jooq.Keys.KEY_USERS_PRIMARY, Lecturers.LECTURERS, "fk_lecturers_users1", Lecturers.LECTURERS.LECT_ID);
        public static final ForeignKey<StudentsRecord, UsersRecord> FK_STUDENTS_USERS1 = Internal.createForeignKey(com.devproserv.courses.jooq.Keys.KEY_USERS_PRIMARY, Students.STUDENTS, "fk_students_users1", Students.STUDENTS.STUD_ID);
        public static final ForeignKey<StudentCoursesRecord, CoursesRecord> FK_STUDENT_COURSES_COURSES1 = Internal.createForeignKey(com.devproserv.courses.jooq.Keys.KEY_COURSES_PRIMARY, StudentCourses.STUDENT_COURSES, "fk_student_courses_courses1", StudentCourses.STUDENT_COURSES.COURSE_ID);
        public static final ForeignKey<StudentCoursesRecord, StudentsRecord> FK_STUDENT_COURSES_STUDENTS1 = Internal.createForeignKey(com.devproserv.courses.jooq.Keys.KEY_STUDENTS_PRIMARY, StudentCourses.STUDENT_COURSES, "fk_student_courses_students1", StudentCourses.STUDENT_COURSES.STUD_ID);
    }
}
