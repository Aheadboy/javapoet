import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        MethodSpec methodSpec = MethodSpec.methodBuilder("toString").addAnnotation(Override.class).build();

        CodeBlock codeBlock = CodeBlock.builder().beginControlFlow("generatebyljjLJJLjjlJj").build();
        TypeSpec typeSpec = TypeSpec.classBuilder("FirstClass2").addJavadoc(codeBlock).addMethod(methodSpec).build();
        JavaFile javaFile= JavaFile.builder("com.newland.app",typeSpec).build();
        javaFile.writeTo(new File("/Users/linjiejun/Downloads/FirstClass"));
    }
}
