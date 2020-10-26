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

@Tag("47")
class Record_2691 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2691: FirstName is Romeo")
	void FirstNameOfRecord2691() {
		assertEquals("Romeo", customers.get(2690).getFirstName());
	}

	@Test
	@DisplayName("Record 2691: LastName is Goyal")
	void LastNameOfRecord2691() {
		assertEquals("Goyal", customers.get(2690).getLastName());
	}

	@Test
	@DisplayName("Record 2691: Company is Berg, Thomas K Esq")
	void CompanyOfRecord2691() {
		assertEquals("Berg, Thomas K Esq", customers.get(2690).getCompany());
	}

	@Test
	@DisplayName("Record 2691: Address is 28233 Industrial Blvd")
	void AddressOfRecord2691() {
		assertEquals("28233 Industrial Blvd", customers.get(2690).getAddress());
	}

	@Test
	@DisplayName("Record 2691: City is Hayward")
	void CityOfRecord2691() {
		assertEquals("Hayward", customers.get(2690).getCity());
	}

	@Test
	@DisplayName("Record 2691: County is Alameda")
	void CountyOfRecord2691() {
		assertEquals("Alameda", customers.get(2690).getCounty());
	}

	@Test
	@DisplayName("Record 2691: State is CA")
	void StateOfRecord2691() {
		assertEquals("CA", customers.get(2690).getState());
	}

	@Test
	@DisplayName("Record 2691: ZIP is 94545")
	void ZIPOfRecord2691() {
		assertEquals("94545", customers.get(2690).getZIP());
	}

	@Test
	@DisplayName("Record 2691: Phone is 510-785-0330")
	void PhoneOfRecord2691() {
		assertEquals("510-785-0330", customers.get(2690).getPhone());
	}

	@Test
	@DisplayName("Record 2691: Fax is 510-785-5799")
	void FaxOfRecord2691() {
		assertEquals("510-785-5799", customers.get(2690).getFax());
	}

	@Test
	@DisplayName("Record 2691: Email is romeo@goyal.com")
	void EmailOfRecord2691() {
		assertEquals("romeo@goyal.com", customers.get(2690).getEmail());
	}

	@Test
	@DisplayName("Record 2691: Web is http://www.romeogoyal.com")
	void WebOfRecord2691() {
		assertEquals("http://www.romeogoyal.com", customers.get(2690).getWeb());
	}
}
