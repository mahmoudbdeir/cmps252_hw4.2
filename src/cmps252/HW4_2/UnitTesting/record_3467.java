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

@Tag("19")
class Record_3467 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3467: FirstName is Kurt")
	void FirstNameOfRecord3467() {
		assertEquals("Kurt", customers.get(3466).getFirstName());
	}

	@Test
	@DisplayName("Record 3467: LastName is Alim")
	void LastNameOfRecord3467() {
		assertEquals("Alim", customers.get(3466).getLastName());
	}

	@Test
	@DisplayName("Record 3467: Company is Millbrook Distribution Svc")
	void CompanyOfRecord3467() {
		assertEquals("Millbrook Distribution Svc", customers.get(3466).getCompany());
	}

	@Test
	@DisplayName("Record 3467: Address is 1010 E 18th St")
	void AddressOfRecord3467() {
		assertEquals("1010 E 18th St", customers.get(3466).getAddress());
	}

	@Test
	@DisplayName("Record 3467: City is Los Angeles")
	void CityOfRecord3467() {
		assertEquals("Los Angeles", customers.get(3466).getCity());
	}

	@Test
	@DisplayName("Record 3467: County is Los Angeles")
	void CountyOfRecord3467() {
		assertEquals("Los Angeles", customers.get(3466).getCounty());
	}

	@Test
	@DisplayName("Record 3467: State is CA")
	void StateOfRecord3467() {
		assertEquals("CA", customers.get(3466).getState());
	}

	@Test
	@DisplayName("Record 3467: ZIP is 90021")
	void ZIPOfRecord3467() {
		assertEquals("90021", customers.get(3466).getZIP());
	}

	@Test
	@DisplayName("Record 3467: Phone is 213-748-7294")
	void PhoneOfRecord3467() {
		assertEquals("213-748-7294", customers.get(3466).getPhone());
	}

	@Test
	@DisplayName("Record 3467: Fax is 213-748-4456")
	void FaxOfRecord3467() {
		assertEquals("213-748-4456", customers.get(3466).getFax());
	}

	@Test
	@DisplayName("Record 3467: Email is kurt@alim.com")
	void EmailOfRecord3467() {
		assertEquals("kurt@alim.com", customers.get(3466).getEmail());
	}

	@Test
	@DisplayName("Record 3467: Web is http://www.kurtalim.com")
	void WebOfRecord3467() {
		assertEquals("http://www.kurtalim.com", customers.get(3466).getWeb());
	}
}
