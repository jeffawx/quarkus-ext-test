package demo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Ldemo/DemoProcessor;", "", "()V", "feature", "Lio/quarkus/deployment/builditem/FeatureBuildItem;", "helloServlet", "Lio/quarkus/undertow/deployment/ServletBuildItem;", "config", "Ldemo/HelloConfig;", "my-ext-deployment"})
public final class DemoProcessor {
    
    public DemoProcessor() {
        super();
    }
    
    @io.quarkus.deployment.annotations.BuildStep
    @org.jetbrains.annotations.NotNull
    public final io.quarkus.deployment.builditem.FeatureBuildItem feature() {
        return null;
    }
    
    @io.quarkus.deployment.annotations.BuildStep
    @org.jetbrains.annotations.NotNull
    public final io.quarkus.undertow.deployment.ServletBuildItem helloServlet(@org.jetbrains.annotations.NotNull
    demo.HelloConfig config) {
        return null;
    }
}