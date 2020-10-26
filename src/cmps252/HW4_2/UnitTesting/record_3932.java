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

@Tag("32")
class Record_3932 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3932: FirstName is Veronica")
	void FirstNameOfRecord3932() {
		assertEquals("Veronica", customers.get(3931).getFirstName());
	}

	@Test
	@DisplayName("Record 3932: LastName is Mummert")
	void LastNameOfRecord3932() {
		assertEquals("Mummert", customers.get(3931).getLastName());
	}

	@Test
	@DisplayName("Record 3932: Company is Moye, Mike Esq")
	void CompanyOfRecord3932() {
		assertEquals("Moye, Mike Esq", customers.get(3931).getCompany());
	}

	@Test
	@DisplayName("Record 3932: Address is 800 W 1st St  #-200")
	void AddressOfRecord3932() {
		assertEquals("800 W 1st St  #-200", customers.get(3931).getAddress());
	}

	@Test
	@DisplayName("Record 3932: City is Los Angeles")
	void CityOfRecord3932() {
		assertEquals("Los Angeles", customers.get(3931).getCity());
	}

	@Test
	@DisplayName("Record 3932: County is Los Angeles")
	void CountyOfRecord3932() {
		assertEquals("Los Angeles", customers.get(3931).getCounty());
	}

	@Test
	@DisplayName("Record 3932: State is CA")
	void StateOfRecord3932() {
		assertEquals("CA", customers.get(3931).getState());
	}

	@Test
	@DisplayName("Record 3932: ZIP is 90012")
	void ZIPOfRecord3932() {
		assertEquals("90012", customers.get(3931).getZIP());
	}

	@Test
	@DisplayName("Record 3932: Phone is 213-617-5987")
	void PhoneOfRecord3932() {
		assertEquals("213-617-5987", customers.get(3931).getPhone());
	}

	@Test
	@DisplayName("Record 3932: Fax is 213-617-6769")
	void FaxOfRecord3932() {
		assertEquals("213-617-6769", customers.get(3931).getFax());
	}

	@Test
	@DisplayName("Record 3932: Email is veronica@mummert.com")
	void EmailOfRecord3932() {
		assertEquals("veronica@mummert.com", customers.get(3931).getEmail());
	}

	@Test
	@DisplayName("Record 3932: Web is http://www.veronicamummert.com")
	void WebOfRecord3932() {
		assertEquals("http://www.veronicamummert.com", customers.get(3931).getWeb());
	}
}
