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
class Record_1615 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1615: FirstName is Caryn")
	void FirstNameOfRecord1615() {
		assertEquals("Caryn", customers.get(1614).getFirstName());
	}

	@Test
	@DisplayName("Record 1615: LastName is Rinner")
	void LastNameOfRecord1615() {
		assertEquals("Rinner", customers.get(1614).getLastName());
	}

	@Test
	@DisplayName("Record 1615: Company is Central Pa Respiratory Inc")
	void CompanyOfRecord1615() {
		assertEquals("Central Pa Respiratory Inc", customers.get(1614).getCompany());
	}

	@Test
	@DisplayName("Record 1615: Address is 101 E Court Sq")
	void AddressOfRecord1615() {
		assertEquals("101 E Court Sq", customers.get(1614).getAddress());
	}

	@Test
	@DisplayName("Record 1615: City is Livingston")
	void CityOfRecord1615() {
		assertEquals("Livingston", customers.get(1614).getCity());
	}

	@Test
	@DisplayName("Record 1615: County is Overton")
	void CountyOfRecord1615() {
		assertEquals("Overton", customers.get(1614).getCounty());
	}

	@Test
	@DisplayName("Record 1615: State is TN")
	void StateOfRecord1615() {
		assertEquals("TN", customers.get(1614).getState());
	}

	@Test
	@DisplayName("Record 1615: ZIP is 38570")
	void ZIPOfRecord1615() {
		assertEquals("38570", customers.get(1614).getZIP());
	}

	@Test
	@DisplayName("Record 1615: Phone is 931-823-8012")
	void PhoneOfRecord1615() {
		assertEquals("931-823-8012", customers.get(1614).getPhone());
	}

	@Test
	@DisplayName("Record 1615: Fax is 931-823-8512")
	void FaxOfRecord1615() {
		assertEquals("931-823-8512", customers.get(1614).getFax());
	}

	@Test
	@DisplayName("Record 1615: Email is caryn@rinner.com")
	void EmailOfRecord1615() {
		assertEquals("caryn@rinner.com", customers.get(1614).getEmail());
	}

	@Test
	@DisplayName("Record 1615: Web is http://www.carynrinner.com")
	void WebOfRecord1615() {
		assertEquals("http://www.carynrinner.com", customers.get(1614).getWeb());
	}
}
