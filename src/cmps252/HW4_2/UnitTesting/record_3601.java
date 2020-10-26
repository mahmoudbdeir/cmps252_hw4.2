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

@Tag("15")
class Record_3601 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3601: FirstName is Leslie")
	void FirstNameOfRecord3601() {
		assertEquals("Leslie", customers.get(3600).getFirstName());
	}

	@Test
	@DisplayName("Record 3601: LastName is Pavao")
	void LastNameOfRecord3601() {
		assertEquals("Pavao", customers.get(3600).getLastName());
	}

	@Test
	@DisplayName("Record 3601: Company is Ridgecrest Village")
	void CompanyOfRecord3601() {
		assertEquals("Ridgecrest Village", customers.get(3600).getCompany());
	}

	@Test
	@DisplayName("Record 3601: Address is 8203 Vineland Ave")
	void AddressOfRecord3601() {
		assertEquals("8203 Vineland Ave", customers.get(3600).getAddress());
	}

	@Test
	@DisplayName("Record 3601: City is Sun Valley")
	void CityOfRecord3601() {
		assertEquals("Sun Valley", customers.get(3600).getCity());
	}

	@Test
	@DisplayName("Record 3601: County is Los Angeles")
	void CountyOfRecord3601() {
		assertEquals("Los Angeles", customers.get(3600).getCounty());
	}

	@Test
	@DisplayName("Record 3601: State is CA")
	void StateOfRecord3601() {
		assertEquals("CA", customers.get(3600).getState());
	}

	@Test
	@DisplayName("Record 3601: ZIP is 91352")
	void ZIPOfRecord3601() {
		assertEquals("91352", customers.get(3600).getZIP());
	}

	@Test
	@DisplayName("Record 3601: Phone is 818-768-8077")
	void PhoneOfRecord3601() {
		assertEquals("818-768-8077", customers.get(3600).getPhone());
	}

	@Test
	@DisplayName("Record 3601: Fax is 818-768-7576")
	void FaxOfRecord3601() {
		assertEquals("818-768-7576", customers.get(3600).getFax());
	}

	@Test
	@DisplayName("Record 3601: Email is leslie@pavao.com")
	void EmailOfRecord3601() {
		assertEquals("leslie@pavao.com", customers.get(3600).getEmail());
	}

	@Test
	@DisplayName("Record 3601: Web is http://www.lesliepavao.com")
	void WebOfRecord3601() {
		assertEquals("http://www.lesliepavao.com", customers.get(3600).getWeb());
	}
}
