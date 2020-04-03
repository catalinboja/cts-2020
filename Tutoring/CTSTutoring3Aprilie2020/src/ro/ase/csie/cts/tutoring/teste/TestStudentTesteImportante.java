package ro.ase.csie.cts.tutoring.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.tutoring.teste.categorii.TesteImportante;

@RunWith(Categories.class)
@SuiteClasses({TestStudent.class, TestStudentGetMedie.class})
@IncludeCategory({TesteImportante.class})
public class TestStudentTesteImportante {

}
