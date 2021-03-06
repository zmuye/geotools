/**
 *
 * $Id$
 */
package net.opengis.ows20.validation;


/**
 * A sample validator interface for {@link net.opengis.ows20.AddressType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AddressTypeValidator {
  boolean validate();

  boolean validateDeliveryPoint(String value);
  boolean validateCity(String value);
  boolean validateAdministrativeArea(String value);
  boolean validatePostalCode(String value);
  boolean validateCountry(String value);
  boolean validateElectronicMailAddress(String value);
}
