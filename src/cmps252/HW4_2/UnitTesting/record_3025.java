package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("27")
class Record_3025 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3025: FirstName is Leticia")
	void FirstNameOfRecord3025() {
		assertEquals("Leticia", customers.get(3024).getFirstName());
	}

	@Test
	@DisplayName("Record 3025: LastName is Ceglinski")
	void LastNameOfRecord3025() {
		assertEquals("Ceglinski", customers.get(3024).getLastName());
	}

	@Test
	@DisplayName("Record 3025: Company is Castle Signs")
	void CompanyOfRecord3025() {
		assertEquals("Castle Signs", customers.get(3024).getCompany());
	}

	@Test
	@DisplayName("Record 3025: Address is 157 W Jefferson St")
	void AddressOfRecord3025() {
		assertEquals("157 W Jefferson St", customers.get(3024).getAddress());
	}

	@Test
	@DisplayName("Record 3025: City is Paulsboro")
	void CityOfRecord3025() {
		assertEquals("Paulsboro", customers.get(3024).getCity());
	}

	@Test
	@DisplayName("Record 3025: County is Gloucester")
	void CountyOfRecord3025() {
		assertEquals("Gloucester", customers.get(3024).getCounty());
	}

	@Test
	@DisplayName("Record 3025: State is NJ")
	void StateOfRecord3025() {
		assertEquals("NJ", customers.get(3024).getState());
	}

	@Test
	@DisplayName("Record 3025: ZIP is 8066")
	void ZIPOfRecord3025() {
		assertEquals("8066", customers.get(3024).getZIP());
	}

	@Test
	@DisplayName("Record 3025: Phone is 856-423-9832")
	void PhoneOfRecord3025() {
		assertEquals("856-423-9832", customers.get(3024).getPhone());
	}

	@Test
	@DisplayName("Record 3025: Fax is 856-423-0558")
	void FaxOfRecord3025() {
		assertEquals("856-423-0558", customers.get(3024).getFax());
	}

	@Test
	@DisplayName("Record 3025: Email is leticia@ceglinski.com")
	void EmailOfRecord3025() {
		assertEquals("leticia@ceglinski.com", customers.get(3024).getEmail());
	}

	@Test
	@DisplayName("Record 3025: Web is http://www.leticiaceglinski.com")
	void WebOfRecord3025() {
		assertEquals("http://www.leticiaceglinski.com", customers.get(3024).getWeb());
	}
}
