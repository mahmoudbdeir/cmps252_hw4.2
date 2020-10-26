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

@Tag("1")
class Record_3230 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3230: FirstName is Kristie")
	void FirstNameOfRecord3230() {
		assertEquals("Kristie", customers.get(3229).getFirstName());
	}

	@Test
	@DisplayName("Record 3230: LastName is Krasnansky")
	void LastNameOfRecord3230() {
		assertEquals("Krasnansky", customers.get(3229).getLastName());
	}

	@Test
	@DisplayName("Record 3230: Company is Team Up Associates")
	void CompanyOfRecord3230() {
		assertEquals("Team Up Associates", customers.get(3229).getCompany());
	}

	@Test
	@DisplayName("Record 3230: Address is 4440 S Padre Island Dr")
	void AddressOfRecord3230() {
		assertEquals("4440 S Padre Island Dr", customers.get(3229).getAddress());
	}

	@Test
	@DisplayName("Record 3230: City is Corpus Christi")
	void CityOfRecord3230() {
		assertEquals("Corpus Christi", customers.get(3229).getCity());
	}

	@Test
	@DisplayName("Record 3230: County is Nueces")
	void CountyOfRecord3230() {
		assertEquals("Nueces", customers.get(3229).getCounty());
	}

	@Test
	@DisplayName("Record 3230: State is TX")
	void StateOfRecord3230() {
		assertEquals("TX", customers.get(3229).getState());
	}

	@Test
	@DisplayName("Record 3230: ZIP is 78411")
	void ZIPOfRecord3230() {
		assertEquals("78411", customers.get(3229).getZIP());
	}

	@Test
	@DisplayName("Record 3230: Phone is 361-852-2386")
	void PhoneOfRecord3230() {
		assertEquals("361-852-2386", customers.get(3229).getPhone());
	}

	@Test
	@DisplayName("Record 3230: Fax is 361-852-5231")
	void FaxOfRecord3230() {
		assertEquals("361-852-5231", customers.get(3229).getFax());
	}

	@Test
	@DisplayName("Record 3230: Email is kristie@krasnansky.com")
	void EmailOfRecord3230() {
		assertEquals("kristie@krasnansky.com", customers.get(3229).getEmail());
	}

	@Test
	@DisplayName("Record 3230: Web is http://www.kristiekrasnansky.com")
	void WebOfRecord3230() {
		assertEquals("http://www.kristiekrasnansky.com", customers.get(3229).getWeb());
	}
}
