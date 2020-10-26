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
class Record_3479 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3479: FirstName is Inez")
	void FirstNameOfRecord3479() {
		assertEquals("Inez", customers.get(3478).getFirstName());
	}

	@Test
	@DisplayName("Record 3479: LastName is Grimard")
	void LastNameOfRecord3479() {
		assertEquals("Grimard", customers.get(3478).getLastName());
	}

	@Test
	@DisplayName("Record 3479: Company is Affiliated Warehouse Co Inc")
	void CompanyOfRecord3479() {
		assertEquals("Affiliated Warehouse Co Inc", customers.get(3478).getCompany());
	}

	@Test
	@DisplayName("Record 3479: Address is 2101 N Buckeye Ave")
	void AddressOfRecord3479() {
		assertEquals("2101 N Buckeye Ave", customers.get(3478).getAddress());
	}

	@Test
	@DisplayName("Record 3479: City is Abilene")
	void CityOfRecord3479() {
		assertEquals("Abilene", customers.get(3478).getCity());
	}

	@Test
	@DisplayName("Record 3479: County is Dickinson")
	void CountyOfRecord3479() {
		assertEquals("Dickinson", customers.get(3478).getCounty());
	}

	@Test
	@DisplayName("Record 3479: State is KS")
	void StateOfRecord3479() {
		assertEquals("KS", customers.get(3478).getState());
	}

	@Test
	@DisplayName("Record 3479: ZIP is 67410")
	void ZIPOfRecord3479() {
		assertEquals("67410", customers.get(3478).getZIP());
	}

	@Test
	@DisplayName("Record 3479: Phone is 785-263-7875")
	void PhoneOfRecord3479() {
		assertEquals("785-263-7875", customers.get(3478).getPhone());
	}

	@Test
	@DisplayName("Record 3479: Fax is 785-263-6437")
	void FaxOfRecord3479() {
		assertEquals("785-263-6437", customers.get(3478).getFax());
	}

	@Test
	@DisplayName("Record 3479: Email is inez@grimard.com")
	void EmailOfRecord3479() {
		assertEquals("inez@grimard.com", customers.get(3478).getEmail());
	}

	@Test
	@DisplayName("Record 3479: Web is http://www.inezgrimard.com")
	void WebOfRecord3479() {
		assertEquals("http://www.inezgrimard.com", customers.get(3478).getWeb());
	}
}
