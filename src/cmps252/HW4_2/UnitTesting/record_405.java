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

@Tag("30")
class Record_405 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 405: FirstName is Scott")
	void FirstNameOfRecord405() {
		assertEquals("Scott", customers.get(404).getFirstName());
	}

	@Test
	@DisplayName("Record 405: LastName is Hubbell")
	void LastNameOfRecord405() {
		assertEquals("Hubbell", customers.get(404).getLastName());
	}

	@Test
	@DisplayName("Record 405: Company is Templeton, Thomas B Esq")
	void CompanyOfRecord405() {
		assertEquals("Templeton, Thomas B Esq", customers.get(404).getCompany());
	}

	@Test
	@DisplayName("Record 405: Address is 121 E Wisconsin Rd")
	void AddressOfRecord405() {
		assertEquals("121 E Wisconsin Rd", customers.get(404).getAddress());
	}

	@Test
	@DisplayName("Record 405: City is Edinburg")
	void CityOfRecord405() {
		assertEquals("Edinburg", customers.get(404).getCity());
	}

	@Test
	@DisplayName("Record 405: County is Hidalgo")
	void CountyOfRecord405() {
		assertEquals("Hidalgo", customers.get(404).getCounty());
	}

	@Test
	@DisplayName("Record 405: State is TX")
	void StateOfRecord405() {
		assertEquals("TX", customers.get(404).getState());
	}

	@Test
	@DisplayName("Record 405: ZIP is 78539")
	void ZIPOfRecord405() {
		assertEquals("78539", customers.get(404).getZIP());
	}

	@Test
	@DisplayName("Record 405: Phone is 956-381-9644")
	void PhoneOfRecord405() {
		assertEquals("956-381-9644", customers.get(404).getPhone());
	}

	@Test
	@DisplayName("Record 405: Fax is 956-381-8814")
	void FaxOfRecord405() {
		assertEquals("956-381-8814", customers.get(404).getFax());
	}

	@Test
	@DisplayName("Record 405: Email is scott@hubbell.com")
	void EmailOfRecord405() {
		assertEquals("scott@hubbell.com", customers.get(404).getEmail());
	}

	@Test
	@DisplayName("Record 405: Web is http://www.scotthubbell.com")
	void WebOfRecord405() {
		assertEquals("http://www.scotthubbell.com", customers.get(404).getWeb());
	}
}
