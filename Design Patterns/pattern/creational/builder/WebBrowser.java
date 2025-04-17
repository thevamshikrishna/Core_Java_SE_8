package pl.vm.javaguild.designpatterns.pattern.creational.builder;

import lombok.Getter;
import lombok.NonNull;

/**
 * Representation of a modern web browser. Hand written builder.
 */
@Getter
public final class WebBrowser {

  //Required fields
  private final String name;
  private final String engine;

  //Optional fields
  private final String version;

  private WebBrowser(@NonNull final Builder builder){
    if(builder.name == null || builder.engine == null){
      throw new IllegalArgumentException("Required fields must not be null");
    }
    this.name = builder.name;
    this.engine = builder.engine;
    this.version = builder.version;
  }

  /**
   * Return builder for WebBrowser
   * @return WebBrowser.Builder
   */
  public static Builder builder(){
    return new Builder();
  }

  public static class Builder {
    private String name;
    private String engine;
    private String version;

    /**
     * Set WebBrowser's name - a mandatory field
     * @param name
     * @return Builder
     */
    public Builder name(@NonNull final String name){
      this.name = name;
      return this;
    }

    /**
     * Set WebBrowser's engine - a mandatory field
     * @param engine
     * @return Builder
     */
    public Builder engine(@NonNull final String engine){
      this.engine = engine;
      return this;
    }


    /**
     * Set WebBrowser's version - an optional field
     * @param version
     * @return Builder
     */
    public Builder version(@NonNull final String version){
      this.version = version;
      return this;
    }

    /**
     * Build WebBrowser object
     * @return WebBrowser
     */
    public WebBrowser build(){
      return new WebBrowser(this);
    }
  }

}
