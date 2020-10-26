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

@Tag("12")
class Record_3961 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3961: FirstName is Joesph")
	void FirstNameOfRecord3961() {
		assertEquals("Joesph", customers.get(3960).getFirstName());
	}

	@Test
	@DisplayName("Record 3961: LastName is Lazewski")
	void LastNameOfRecord3961() {
		assertEquals("Lazewski", customers.get(3960).getLastName());
	}

	@Test
	@DisplayName("Record 3961: Company is Dow Tech Associates")
	void CompanyOfRecord3961() {
		assertEquals("Dow Tech Associates", customers.get(3960).getCompany());
	}

	@Test
	@DisplayName("Record 3961: Address is Eddystone Industrial Prk")
	void AddressOfRecord3961() {
		assertEquals("Eddystone Industrial Prk", customers.get(3960).getAddress());
	}

	@Test
	@DisplayName("Record 3961: City is Chester")
	void CityOfRecord3961() {
		assertEquals("Chester", customers.get(3960).getCity());
	}

	@Test
	@DisplayName("Record 3961: County is Delaware")
	void CountyOfRecord3961() {
		assertEquals("Delaware", customers.get(3960).getCounty());
	}

	@Test
	@DisplayName("Record 3961: State is PA")
	void StateOfRecord3961() {
		assertEquals("PA", customers.get(3960).getState());
	}

	@Test
	@DisplayName("Record 3961: ZIP is 19013")
	void ZIPOfRecord3961() {
		assertEquals("19013", customers.get(3960).getZIP());
	}

	@Test
	@DisplayName("Record 3961: Phone is 610-874-4902")
	void PhoneOfRecord3961() {
		assertEquals("610-874-4902", customers.get(3960).getPhone());
	}

	@Test
	@DisplayName("Record 3961: Fax is 610-874-2163")
	void FaxOfRecord3961() {
		assertEquals("610-874-2163", customers.get(3960).getFax());
	}

	@Test
	@DisplayName("Record 3961: Email is joesph@lazewski.com")
	void EmailOfRecord3961() {
		assertEquals("joesph@lazewski.com", customers.get(3960).getEmail());
	}

	@Test
	@DisplayName("Record 3961: Web is http://www.joesphlazewski.com")
	void WebOfRecord3961() {
		assertEquals("http://www.joesphlazewski.com", customers.get(3960).getWeb());
	}
}
