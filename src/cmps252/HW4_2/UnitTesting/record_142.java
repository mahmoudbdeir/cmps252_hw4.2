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

@Tag("23")
class Record_142 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 142: FirstName is Raul")
	void FirstNameOfRecord142() {
		assertEquals("Raul", customers.get(141).getFirstName());
	}

	@Test
	@DisplayName("Record 142: LastName is Kelts")
	void LastNameOfRecord142() {
		assertEquals("Kelts", customers.get(141).getLastName());
	}

	@Test
	@DisplayName("Record 142: Company is Soccer World")
	void CompanyOfRecord142() {
		assertEquals("Soccer World", customers.get(141).getCompany());
	}

	@Test
	@DisplayName("Record 142: Address is 512 Gladys Ave")
	void AddressOfRecord142() {
		assertEquals("512 Gladys Ave", customers.get(141).getAddress());
	}

	@Test
	@DisplayName("Record 142: City is Los Angeles")
	void CityOfRecord142() {
		assertEquals("Los Angeles", customers.get(141).getCity());
	}

	@Test
	@DisplayName("Record 142: County is Los Angeles")
	void CountyOfRecord142() {
		assertEquals("Los Angeles", customers.get(141).getCounty());
	}

	@Test
	@DisplayName("Record 142: State is CA")
	void StateOfRecord142() {
		assertEquals("CA", customers.get(141).getState());
	}

	@Test
	@DisplayName("Record 142: ZIP is 90013")
	void ZIPOfRecord142() {
		assertEquals("90013", customers.get(141).getZIP());
	}

	@Test
	@DisplayName("Record 142: Phone is 213-623-1233")
	void PhoneOfRecord142() {
		assertEquals("213-623-1233", customers.get(141).getPhone());
	}

	@Test
	@DisplayName("Record 142: Fax is 213-623-5278")
	void FaxOfRecord142() {
		assertEquals("213-623-5278", customers.get(141).getFax());
	}

	@Test
	@DisplayName("Record 142: Email is raul@kelts.com")
	void EmailOfRecord142() {
		assertEquals("raul@kelts.com", customers.get(141).getEmail());
	}

	@Test
	@DisplayName("Record 142: Web is http://www.raulkelts.com")
	void WebOfRecord142() {
		assertEquals("http://www.raulkelts.com", customers.get(141).getWeb());
	}
}
