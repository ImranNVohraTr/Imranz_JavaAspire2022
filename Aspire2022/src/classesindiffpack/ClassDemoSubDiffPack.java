package classesindiffpack;
import aboutClasses.ClassDemo1;

public class ClassDemoSubDiffPack extends ClassDemo1{//aboutClasses.ClassDemo1 {//qualified name
	void met() {
		//System.out.println(pri);//- CLASS SCOPE
		//System.out.println(nomod);// - PACKAGE SCOPE
		System.out.println(pro);//- RELATION SCOPE
		System.out.println(pub);//- GLOBAL SCOPE
	}

}
