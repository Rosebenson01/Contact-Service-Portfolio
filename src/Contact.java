/** Rose Benson
* CS-320
* Module 8
*/

package contact;

/**
 * Contact class represents a single contact record
 * The contact ID cannot be updated
 * Other fields can be updated through setters with validation
 */
public class Contact {

    private final String contactID;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;


    /**
     *  Validates contact ID (not null and <= 10 characters)
     * @param contactID
     * @return
     */
    private boolean validateContactID(String contactID) {
        return contactID != null && contactID.length() <= 10;
    }

    /**
     * Validates first name (not null and <= 10 characters)
     * @param firstName
     * @return
     */
    private boolean validateFirstName(String firstName) {
        return firstName != null && firstName.length() <= 10;
    }

    /**
     * Validates last name (not null and <= 10 characters)
     * @param lastName
     * @return
     */
    private boolean validateLastName(String lastName) {
        return lastName != null && lastName.length() <= 10;
    }

    /**
     *  Validates phone number (not null and exactly 10 digits)
     * @param phoneNumber
     * @return
     */
    private boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }

    /**
     *  Validates address (not null and <= 30 characters)
     * @param address
     * @return
     */
    private boolean validateAddress(String address) {
        return address != null && address.length() <= 30;
    }

   
    /**
     * Constructor to create a new Contact object
     * All fields are validated before assignment
     */
    public Contact(String contactID,
                   String firstName,
                   String lastName,
                   String phoneNumber,
                   String address) {

        /**
         *  Validate contact ID
         */
        if (!validateContactID(contactID)) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        /**
         *  Validate first name
         */
        if (!validateFirstName(firstName)) {
            throw new IllegalArgumentException("Invalid first name");
        }

        /**
         *  Validate last name
         */
        if (!validateLastName(lastName)) {
            throw new IllegalArgumentException("Invalid last name");
        }

        /**
         *  Validate phone number
         */
        if (!validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        /**
         *  Validate address
         */
        if (!validateAddress(address)) {
            throw new IllegalArgumentException("Invalid address");
        }

        /**
         *  Assign values after passing validation
         */
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    /**
     *  Returns the contact ID (read-only)
     * @return
     */
    public String getContactID() {
        return contactID;
    }

    /**
     *  Returns the first name
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  Returns the last name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  Returns the phone number
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the address
     * @return
     */
    public String getAddress() {
        return address;
    }


    /**
     * Updates the first name after validation.
     */
    public void setFirstName(String firstName) {
        if (!validateFirstName(firstName)) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    /**
     * Updates the last name after validation.
     */
    public void setLastName(String lastName) {
        if (!validateLastName(lastName)) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    /**
     * Updates the phone number after validation.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (!validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Updates the address after validation.
     */
    public void setAddress(String address) {
        if (!validateAddress(address)) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
