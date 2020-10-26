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

@Tag("21")
class Record_2069 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2069: FirstName is Roberto")
	void FirstNameOfRecord2069() {
		assertEquals("Roberto", customers.get(2068).getFirstName());
	}

	@Test
	@DisplayName("Record 2069: LastName is Scher")
	void LastNameOfRecord2069() {
		assertEquals("Scher", customers.get(2068).getLastName());
	}

	@Test
	@DisplayName("Record 2069: Company is Diamond, Bruce W Esq")
	void CompanyOfRecord2069() {
		assertEquals("Diamond, Bruce W Esq", customers.get(2068).getCompany());
	}

	@Test
	@DisplayName("Record 2069: Address is 202 N Monroe St")
	void AddressOfRecord2069() {
		assertEquals("202 N Monroe St", customers.get(2068).getAddress());
	}

	@Test
	@DisplayName("Record 2069: City is Rockford")
	void CityOfRecord2069() {
		assertEquals("Rockford", customers.get(2068).getCity());
	}

	@Test
	@DisplayName("Record 2069: County is Kent")
	void CountyOfRecord2069() {
		assertEquals("Kent", customers.get(2068).getCounty());
	}

	@Test
	@DisplayName("Record 2069: State is MI")
	void StateOfRecord2069() {
		assertEquals("MI", customers.get(2068).getState());
	}

	@Test
	@DisplayName("Record 2069: ZIP is 49341")
	void ZIPOfRecord2069() {
		assertEquals("49341", customers.get(2068).getZIP());
	}

	@Test
	@DisplayName("Record 2069: Phone is 616-866-6429")
	void PhoneOfRecord2069() {
		assertEquals("616-866-6429", customers.get(2068).getPhone());
	}

	@Test
	@DisplayName("Record 2069: Fax is 616-866-9076")
	void FaxOfRecord2069() {
		assertEquals("616-866-9076", customers.get(2068).getFax());
	}

	@Test
	@DisplayName("Record 2069: Email is roberto@scher.com")
	void EmailOfRecord2069() {
		assertEquals("roberto@scher.com", customers.get(2068).getEmail());
	}

	@Test
	@DisplayName("Record 2069: Web is http://www.robertoscher.com")
	void WebOfRecord2069() {
		assertEquals("http://www.robertoscher.com", customers.get(2068).getWeb());
	}
}
