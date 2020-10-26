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

@Tag("5")
class Record_3043 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3043: FirstName is Dessie")
	void FirstNameOfRecord3043() {
		assertEquals("Dessie", customers.get(3042).getFirstName());
	}

	@Test
	@DisplayName("Record 3043: LastName is Trombly")
	void LastNameOfRecord3043() {
		assertEquals("Trombly", customers.get(3042).getLastName());
	}

	@Test
	@DisplayName("Record 3043: Company is Rosenberg & Saloman")
	void CompanyOfRecord3043() {
		assertEquals("Rosenberg & Saloman", customers.get(3042).getCompany());
	}

	@Test
	@DisplayName("Record 3043: Address is 4831 Newton St")
	void AddressOfRecord3043() {
		assertEquals("4831 Newton St", customers.get(3042).getAddress());
	}

	@Test
	@DisplayName("Record 3043: City is Yucca Valley")
	void CityOfRecord3043() {
		assertEquals("Yucca Valley", customers.get(3042).getCity());
	}

	@Test
	@DisplayName("Record 3043: County is San Bernardino")
	void CountyOfRecord3043() {
		assertEquals("San Bernardino", customers.get(3042).getCounty());
	}

	@Test
	@DisplayName("Record 3043: State is CA")
	void StateOfRecord3043() {
		assertEquals("CA", customers.get(3042).getState());
	}

	@Test
	@DisplayName("Record 3043: ZIP is 92284")
	void ZIPOfRecord3043() {
		assertEquals("92284", customers.get(3042).getZIP());
	}

	@Test
	@DisplayName("Record 3043: Phone is 760-369-4774")
	void PhoneOfRecord3043() {
		assertEquals("760-369-4774", customers.get(3042).getPhone());
	}

	@Test
	@DisplayName("Record 3043: Fax is 760-369-9965")
	void FaxOfRecord3043() {
		assertEquals("760-369-9965", customers.get(3042).getFax());
	}

	@Test
	@DisplayName("Record 3043: Email is dessie@trombly.com")
	void EmailOfRecord3043() {
		assertEquals("dessie@trombly.com", customers.get(3042).getEmail());
	}

	@Test
	@DisplayName("Record 3043: Web is http://www.dessietrombly.com")
	void WebOfRecord3043() {
		assertEquals("http://www.dessietrombly.com", customers.get(3042).getWeb());
	}
}
