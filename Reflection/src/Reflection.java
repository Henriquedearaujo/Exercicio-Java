import java.lang.reflect.Field;

public class Reflection {
    public static void processarAnotacao(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela anotacaoClasse = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela (classe): " + anotacaoClasse.value());
        } else {
            System.out.println("A anotação Tabela não está presente na classe " + clazz.getSimpleName() + ".");
        }
        for (Field campo : clazz.getDeclaredFields()) {
            if (campo.isAnnotationPresent(Tabela.class)) {
            Tabela anotacaoCampo = campo.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela (campo): " + anotacaoCampo.value());
            }
        }
    }

}
