import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
final String N = "linjiejun";

        FieldSpec fieldSpec = FieldSpec.builder(String.class, "appMchntNolin", Modifier.PRIVATE).addJavadoc("应用商户号发起必填\r\n" + AntiThief.getCopyRight("linjiejun")).build();
        FieldSpec fieldSpec2 = FieldSpec.builder(String.class, "appTermNo", Modifier.PRIVATE).addJavadoc("应用商户号发起必填\r\n"+AntiThief.getCopyRight(N)).build();
        FieldSpec fieldSpec3 = FieldSpec.builder(String.class, "appID", Modifier.PRIVATE).addJavadoc("第三方应用的唯一标识，由银联指定。\r\n"+AntiThief.getCopyRight(N)).build();
        FieldSpec fieldSpec4 = FieldSpec.builder(String.class, "appName", Modifier.PRIVATE).addJavadoc("第三方应用应用名称\r\n"+AntiThief.getCopyRight(N)).build();
        FieldSpec fieldSpec5 = FieldSpec.builder(String.class, "operatorNo", Modifier.PRIVATE).addJavadoc("实体终端普通操作员编号\r\n"+AntiThief.getCopyRight(N)).build();
        FieldSpec fieldSpec6 = FieldSpec.builder(String.class, "operatorPwd", Modifier.PRIVATE).addJavadoc("实体终端普通操作员密码\r\n"+AntiThief.getCopyRight(N)).build();


        CodeBlock codeBlock = CodeBlock.builder().addStatement(AntiThief.getCopyRight("linjiejun")).build();

        TypeSpec typeSpec = TypeSpec.classBuilder("FirstClass").addField(fieldSpec).addField(fieldSpec2).addField(fieldSpec3).addField(fieldSpec4).addField(fieldSpec5).addField(fieldSpec6).addJavadoc(codeBlock).addGetterAndSetter().build();

        //
        JavaFile javaFile = JavaFile.builder("com.newland.app", typeSpec).build();
        javaFile.writeTo(new File("/Users/linjiejun/Downloads/FirstClass"));
    }

}
