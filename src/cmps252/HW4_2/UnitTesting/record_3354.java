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

@Tag("9")
class Record_3354 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3354: FirstName is Chuck")
	void FirstNameOfRecord3354() {
		assertEquals("Chuck", customers.get(3353).getFirstName());
	}

	@Test
	@DisplayName("Record 3354: LastName is Webbink")
	void LastNameOfRecord3354() {
		assertEquals("Webbink", customers.get(3353).getLastName());
	}

	@Test
	@DisplayName("Record 3354: Company is Anahym Extrusion Co Inc")
	void CompanyOfRecord3354() {
		assertEquals("Anahym Extrusion Co Inc", customers.get(3353).getCompany());
	}

	@Test
	@DisplayName("Record 3354: Address is 5144 W Irving Park Rd")
	void AddressOfRecord3354() {
		assertEquals("5144 W Irving Park Rd", customers.get(3353).getAddress());
	}

	@Test
	@DisplayName("Record 3354: City is Chicago")
	void CityOfRecord3354() {
		assertEquals("Chicago", customers.get(3353).getCity());
	}

	@Test
	@DisplayName("Record 3354: County is Cook")
	void CountyOfRecord3354() {
		assertEquals("Cook", customers.get(3353).getCounty());
	}

	@Test
	@DisplayName("Record 3354: State is IL")
	void StateOfRecord3354() {
		assertEquals("IL", customers.get(3353).getState());
	}

	@Test
	@DisplayName("Record 3354: ZIP is 60641")
	void ZIPOfRecord3354() {
		assertEquals("60641", customers.get(3353).getZIP());
	}

	@Test
	@DisplayName("Record 3354: Phone is 773-685-8388")
	void PhoneOfRecord3354() {
		assertEquals("773-685-8388", customers.get(3353).getPhone());
	}

	@Test
	@DisplayName("Record 3354: Fax is 773-685-9497")
	void FaxOfRecord3354() {
		assertEquals("773-685-9497", customers.get(3353).getFax());
	}

	@Test
	@DisplayName("Record 3354: Email is chuck@webbink.com")
	void EmailOfRecord3354() {
		assertEquals("chuck@webbink.com", customers.get(3353).getEmail());
	}

	@Test
	@DisplayName("Record 3354: Web is http://www.chuckwebbink.com")
	void WebOfRecord3354() {
		assertEquals("http://www.chuckwebbink.com", customers.get(3353).getWeb());
	}
}
