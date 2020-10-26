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

@Tag("42")
class Record_2976 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2976: FirstName is Abbie")
	void FirstNameOfRecord2976() {
		assertEquals("Abbie", customers.get(2975).getFirstName());
	}

	@Test
	@DisplayName("Record 2976: LastName is Khosravi")
	void LastNameOfRecord2976() {
		assertEquals("Khosravi", customers.get(2975).getLastName());
	}

	@Test
	@DisplayName("Record 2976: Company is Michalski, Ray R Esq")
	void CompanyOfRecord2976() {
		assertEquals("Michalski, Ray R Esq", customers.get(2975).getCompany());
	}

	@Test
	@DisplayName("Record 2976: Address is 230 E 9th St")
	void AddressOfRecord2976() {
		assertEquals("230 E 9th St", customers.get(2975).getAddress());
	}

	@Test
	@DisplayName("Record 2976: City is Indianapolis")
	void CityOfRecord2976() {
		assertEquals("Indianapolis", customers.get(2975).getCity());
	}

	@Test
	@DisplayName("Record 2976: County is Marion")
	void CountyOfRecord2976() {
		assertEquals("Marion", customers.get(2975).getCounty());
	}

	@Test
	@DisplayName("Record 2976: State is IN")
	void StateOfRecord2976() {
		assertEquals("IN", customers.get(2975).getState());
	}

	@Test
	@DisplayName("Record 2976: ZIP is 46204")
	void ZIPOfRecord2976() {
		assertEquals("46204", customers.get(2975).getZIP());
	}

	@Test
	@DisplayName("Record 2976: Phone is 317-262-9630")
	void PhoneOfRecord2976() {
		assertEquals("317-262-9630", customers.get(2975).getPhone());
	}

	@Test
	@DisplayName("Record 2976: Fax is 317-262-1512")
	void FaxOfRecord2976() {
		assertEquals("317-262-1512", customers.get(2975).getFax());
	}

	@Test
	@DisplayName("Record 2976: Email is abbie@khosravi.com")
	void EmailOfRecord2976() {
		assertEquals("abbie@khosravi.com", customers.get(2975).getEmail());
	}

	@Test
	@DisplayName("Record 2976: Web is http://www.abbiekhosravi.com")
	void WebOfRecord2976() {
		assertEquals("http://www.abbiekhosravi.com", customers.get(2975).getWeb());
	}
}
