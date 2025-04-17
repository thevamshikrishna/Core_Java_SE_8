package pl.vm.javaguild.designpatterns.pattern.structural.bridge.model.engine;

/**
 * The engine's cylinder configuration refers to the arrangement of cylinders within the engine.
 */
public enum CylinderConfiguration {

    /**
     * These engines have a single row of cylinders in a straight line.
     * <p>
     * Examples: 4-cylinder and 6-cylinder engines.
     */
    INLINE,
    /**
     * These engines have two rows of cylinders that form a V shape.
     * <p>
     * Examples: V6 and V8 engines.
     */
    V_SHAPED,
    /**
     * These engines have horizontally opposed cylinders, with pistons moving toward each other.
     * <p>
     * Examples: flat-4 and flat-6 engines.
     */
    FLAT
}
