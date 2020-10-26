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

@Tag("10")
class Record_281 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 281: FirstName is Maria")
	void FirstNameOfRecord281() {
		assertEquals("Maria", customers.get(280).getFirstName());
	}

	@Test
	@DisplayName("Record 281: LastName is Ermert")
	void LastNameOfRecord281() {
		assertEquals("Ermert", customers.get(280).getLastName());
	}

	@Test
	@DisplayName("Record 281: Company is Classen Tag Agency")
	void CompanyOfRecord281() {
		assertEquals("Classen Tag Agency", customers.get(280).getCompany());
	}

	@Test
	@DisplayName("Record 281: Address is 1600 Asbury Ave")
	void AddressOfRecord281() {
		assertEquals("1600 Asbury Ave", customers.get(280).getAddress());
	}

	@Test
	@DisplayName("Record 281: City is Asbury Park")
	void CityOfRecord281() {
		assertEquals("Asbury Park", customers.get(280).getCity());
	}

	@Test
	@DisplayName("Record 281: County is Monmouth")
	void CountyOfRecord281() {
		assertEquals("Monmouth", customers.get(280).getCounty());
	}

	@Test
	@DisplayName("Record 281: State is NJ")
	void StateOfRecord281() {
		assertEquals("NJ", customers.get(280).getState());
	}

	@Test
	@DisplayName("Record 281: ZIP is 7712")
	void ZIPOfRecord281() {
		assertEquals("7712", customers.get(280).getZIP());
	}

	@Test
	@DisplayName("Record 281: Phone is 732-517-0525")
	void PhoneOfRecord281() {
		assertEquals("732-517-0525", customers.get(280).getPhone());
	}

	@Test
	@DisplayName("Record 281: Fax is 732-517-4327")
	void FaxOfRecord281() {
		assertEquals("732-517-4327", customers.get(280).getFax());
	}

	@Test
	@DisplayName("Record 281: Email is maria@ermert.com")
	void EmailOfRecord281() {
		assertEquals("maria@ermert.com", customers.get(280).getEmail());
	}

	@Test
	@DisplayName("Record 281: Web is http://www.mariaermert.com")
	void WebOfRecord281() {
		assertEquals("http://www.mariaermert.com", customers.get(280).getWeb());
	}
}
