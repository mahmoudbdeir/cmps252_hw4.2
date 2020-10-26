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
class Record_3733 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3733: FirstName is Conrad")
	void FirstNameOfRecord3733() {
		assertEquals("Conrad", customers.get(3732).getFirstName());
	}

	@Test
	@DisplayName("Record 3733: LastName is Harens")
	void LastNameOfRecord3733() {
		assertEquals("Harens", customers.get(3732).getLastName());
	}

	@Test
	@DisplayName("Record 3733: Company is Kellners Fireworks Inc")
	void CompanyOfRecord3733() {
		assertEquals("Kellners Fireworks Inc", customers.get(3732).getCompany());
	}

	@Test
	@DisplayName("Record 3733: Address is 7970 National Hwy")
	void AddressOfRecord3733() {
		assertEquals("7970 National Hwy", customers.get(3732).getAddress());
	}

	@Test
	@DisplayName("Record 3733: City is Pennsauken")
	void CityOfRecord3733() {
		assertEquals("Pennsauken", customers.get(3732).getCity());
	}

	@Test
	@DisplayName("Record 3733: County is Camden")
	void CountyOfRecord3733() {
		assertEquals("Camden", customers.get(3732).getCounty());
	}

	@Test
	@DisplayName("Record 3733: State is NJ")
	void StateOfRecord3733() {
		assertEquals("NJ", customers.get(3732).getState());
	}

	@Test
	@DisplayName("Record 3733: ZIP is 8110")
	void ZIPOfRecord3733() {
		assertEquals("8110", customers.get(3732).getZIP());
	}

	@Test
	@DisplayName("Record 3733: Phone is 856-665-4031")
	void PhoneOfRecord3733() {
		assertEquals("856-665-4031", customers.get(3732).getPhone());
	}

	@Test
	@DisplayName("Record 3733: Fax is 856-665-8333")
	void FaxOfRecord3733() {
		assertEquals("856-665-8333", customers.get(3732).getFax());
	}

	@Test
	@DisplayName("Record 3733: Email is conrad@harens.com")
	void EmailOfRecord3733() {
		assertEquals("conrad@harens.com", customers.get(3732).getEmail());
	}

	@Test
	@DisplayName("Record 3733: Web is http://www.conradharens.com")
	void WebOfRecord3733() {
		assertEquals("http://www.conradharens.com", customers.get(3732).getWeb());
	}
}
