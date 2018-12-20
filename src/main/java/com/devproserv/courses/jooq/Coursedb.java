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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Coursedb extends SchemaImpl {

    private static final long serialVersionUID = 1195675342;

    /**
     * The reference instance of <code>coursedb</code>
     */
    public static final Coursedb COURSEDB = new Coursedb();

    /**
     * The table <code>coursedb.archive</code>.
     */
    public final Archive ARCHIVE = com.devproserv.courses.jooq.tables.Archive.ARCHIVE;

    /**
     * The table <code>coursedb.courses</code>.
     */
    public final Courses COURSES = com.devproserv.courses.jooq.tables.Courses.COURSES;

    /**
     * The table <code>coursedb.lecturers</code>.
     */
    public final Lecturers LECTURERS = com.devproserv.courses.jooq.tables.Lecturers.LECTURERS;

    /**
     * The table <code>coursedb.students</code>.
     */
    public final Students STUDENTS = com.devproserv.courses.jooq.tables.Students.STUDENTS;

    /**
     * The table <code>coursedb.student_courses</code>.
     */
    public final StudentCourses STUDENT_COURSES = com.devproserv.courses.jooq.tables.StudentCourses.STUDENT_COURSES;

    /**
     * The table <code>coursedb.users</code>.
     */
    public final Users USERS = com.devproserv.courses.jooq.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Coursedb() {
        super("coursedb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Archive.ARCHIVE,
            Courses.COURSES,
            Lecturers.LECTURERS,
            Students.STUDENTS,
            StudentCourses.STUDENT_COURSES,
            Users.USERS);
    }
}
