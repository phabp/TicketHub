package ticket.rest.client.function;

import jakarta.annotation.Generated;

/**
 * @author me
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}