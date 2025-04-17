package pl.vm.javaguild.designpatterns.pattern.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 * Representation of a modern web browser. Lombok generated builder.
 */
@Getter
@Builder
public final class WebBrowserLombok {

  private final String name;
  private final String engine;
  private final String version;

}
