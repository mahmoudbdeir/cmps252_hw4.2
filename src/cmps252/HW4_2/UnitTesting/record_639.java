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

@Tag("13")
class Record_639 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 639: FirstName is Anton")
	void FirstNameOfRecord639() {
		assertEquals("Anton", customers.get(638).getFirstName());
	}

	@Test
	@DisplayName("Record 639: LastName is Raff")
	void LastNameOfRecord639() {
		assertEquals("Raff", customers.get(638).getLastName());
	}

	@Test
	@DisplayName("Record 639: Company is Structural Display Co Inc")
	void CompanyOfRecord639() {
		assertEquals("Structural Display Co Inc", customers.get(638).getCompany());
	}

	@Test
	@DisplayName("Record 639: Address is 16155 Nw Cornell Rd  #-800")
	void AddressOfRecord639() {
		assertEquals("16155 Nw Cornell Rd  #-800", customers.get(638).getAddress());
	}

	@Test
	@DisplayName("Record 639: City is Beaverton")
	void CityOfRecord639() {
		assertEquals("Beaverton", customers.get(638).getCity());
	}

	@Test
	@DisplayName("Record 639: County is Washington")
	void CountyOfRecord639() {
		assertEquals("Washington", customers.get(638).getCounty());
	}

	@Test
	@DisplayName("Record 639: State is OR")
	void StateOfRecord639() {
		assertEquals("OR", customers.get(638).getState());
	}

	@Test
	@DisplayName("Record 639: ZIP is 97006")
	void ZIPOfRecord639() {
		assertEquals("97006", customers.get(638).getZIP());
	}

	@Test
	@DisplayName("Record 639: Phone is 503-629-9857")
	void PhoneOfRecord639() {
		assertEquals("503-629-9857", customers.get(638).getPhone());
	}

	@Test
	@DisplayName("Record 639: Fax is 503-629-5151")
	void FaxOfRecord639() {
		assertEquals("503-629-5151", customers.get(638).getFax());
	}

	@Test
	@DisplayName("Record 639: Email is anton@raff.com")
	void EmailOfRecord639() {
		assertEquals("anton@raff.com", customers.get(638).getEmail());
	}

	@Test
	@DisplayName("Record 639: Web is http://www.antonraff.com")
	void WebOfRecord639() {
		assertEquals("http://www.antonraff.com", customers.get(638).getWeb());
	}
}
