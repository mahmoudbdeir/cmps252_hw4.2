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

@Tag("28")
class Record_3582 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3582: FirstName is Raymundo")
	void FirstNameOfRecord3582() {
		assertEquals("Raymundo", customers.get(3581).getFirstName());
	}

	@Test
	@DisplayName("Record 3582: LastName is Bellflower")
	void LastNameOfRecord3582() {
		assertEquals("Bellflower", customers.get(3581).getLastName());
	}

	@Test
	@DisplayName("Record 3582: Company is Enco")
	void CompanyOfRecord3582() {
		assertEquals("Enco", customers.get(3581).getCompany());
	}

	@Test
	@DisplayName("Record 3582: Address is 820 Mission St")
	void AddressOfRecord3582() {
		assertEquals("820 Mission St", customers.get(3581).getAddress());
	}

	@Test
	@DisplayName("Record 3582: City is South Pasadena")
	void CityOfRecord3582() {
		assertEquals("South Pasadena", customers.get(3581).getCity());
	}

	@Test
	@DisplayName("Record 3582: County is Los Angeles")
	void CountyOfRecord3582() {
		assertEquals("Los Angeles", customers.get(3581).getCounty());
	}

	@Test
	@DisplayName("Record 3582: State is CA")
	void StateOfRecord3582() {
		assertEquals("CA", customers.get(3581).getState());
	}

	@Test
	@DisplayName("Record 3582: ZIP is 91030")
	void ZIPOfRecord3582() {
		assertEquals("91030", customers.get(3581).getZIP());
	}

	@Test
	@DisplayName("Record 3582: Phone is 626-440-2099")
	void PhoneOfRecord3582() {
		assertEquals("626-440-2099", customers.get(3581).getPhone());
	}

	@Test
	@DisplayName("Record 3582: Fax is 626-440-0823")
	void FaxOfRecord3582() {
		assertEquals("626-440-0823", customers.get(3581).getFax());
	}

	@Test
	@DisplayName("Record 3582: Email is raymundo@bellflower.com")
	void EmailOfRecord3582() {
		assertEquals("raymundo@bellflower.com", customers.get(3581).getEmail());
	}

	@Test
	@DisplayName("Record 3582: Web is http://www.raymundobellflower.com")
	void WebOfRecord3582() {
		assertEquals("http://www.raymundobellflower.com", customers.get(3581).getWeb());
	}
}
