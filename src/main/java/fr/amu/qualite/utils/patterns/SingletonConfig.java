package fr.amu.qualite.utils.patterns;

/**
 * Singleton configuration class for the application.
 */
public class SingletonConfig {

    private static SingletonConfig instance;

    private String appName;
    private String appVersion;

    private SingletonConfig() {
        this.appName = "ArmoricAnsim";
        this.appVersion = "1.0-SNAPSHOT";
    }

    /**
     * Get the singleton instance.
     *
     * @return the singleton instance
     */
    public static synchronized SingletonConfig getInstance() {
        if (instance == null) {
            instance = new SingletonConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
