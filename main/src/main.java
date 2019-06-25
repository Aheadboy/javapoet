import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import javax.rmi.CORBA.Util;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class main {
    public static void main(String[] args) throws IOException {
        String subFix = "subFix";

        FieldSpec fieldSpec = FieldSpec.builder(String.class, "appMchntNo", Modifier.PRIVATE).addJavadoc("应用商户号发起必填"+subFix).build();
        FieldSpec fieldSpec2 = FieldSpec.builder(String.class, "appTermNo", Modifier.PRIVATE).addJavadoc("应用商户号发起必填"+subFix).build();
        FieldSpec fieldSpec3 = FieldSpec.builder(String.class, "appID", Modifier.PRIVATE).addJavadoc("第三方应用的唯一标识，由银联指定。"+subFix).build();
        FieldSpec fieldSpec4 = FieldSpec.builder(String.class, "appName", Modifier.PRIVATE).addJavadoc("第三方应用应用名称"+subFix).build();
        FieldSpec fieldSpec5 = FieldSpec.builder(String.class, "operatorNo", Modifier.PRIVATE).addJavadoc("实体终端普通操作员编号"+subFix).build();
        FieldSpec fieldSpec6 = FieldSpec.builder(String.class, "operatorPwd", Modifier.PRIVATE).addJavadoc("实体终端普通操作员密码"+subFix).build();



        TypeSpec typeSpec = TypeSpec.classBuilder("FirstClass").addField(fieldSpec).addField(fieldSpec2).addField(fieldSpec3).addField(fieldSpec4).addField(fieldSpec5).addField(fieldSpec6).build();

        //
        JavaFile javaFile = JavaFile.builder("com.newland.app", typeSpec).build();
        javaFile.writeTo(new File("/Users/linjiejun/Downloads/FirstClass"));
    }
}
