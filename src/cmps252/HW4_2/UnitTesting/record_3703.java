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
class Record_3703 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3703: FirstName is Mayme")
	void FirstNameOfRecord3703() {
		assertEquals("Mayme", customers.get(3702).getFirstName());
	}

	@Test
	@DisplayName("Record 3703: LastName is Woge")
	void LastNameOfRecord3703() {
		assertEquals("Woge", customers.get(3702).getLastName());
	}

	@Test
	@DisplayName("Record 3703: Company is Print Factory")
	void CompanyOfRecord3703() {
		assertEquals("Print Factory", customers.get(3702).getCompany());
	}

	@Test
	@DisplayName("Record 3703: Address is 2089 E 14th St")
	void AddressOfRecord3703() {
		assertEquals("2089 E 14th St", customers.get(3702).getAddress());
	}

	@Test
	@DisplayName("Record 3703: City is San Leandro")
	void CityOfRecord3703() {
		assertEquals("San Leandro", customers.get(3702).getCity());
	}

	@Test
	@DisplayName("Record 3703: County is Alameda")
	void CountyOfRecord3703() {
		assertEquals("Alameda", customers.get(3702).getCounty());
	}

	@Test
	@DisplayName("Record 3703: State is CA")
	void StateOfRecord3703() {
		assertEquals("CA", customers.get(3702).getState());
	}

	@Test
	@DisplayName("Record 3703: ZIP is 94577")
	void ZIPOfRecord3703() {
		assertEquals("94577", customers.get(3702).getZIP());
	}

	@Test
	@DisplayName("Record 3703: Phone is 510-895-4569")
	void PhoneOfRecord3703() {
		assertEquals("510-895-4569", customers.get(3702).getPhone());
	}

	@Test
	@DisplayName("Record 3703: Fax is 510-895-4484")
	void FaxOfRecord3703() {
		assertEquals("510-895-4484", customers.get(3702).getFax());
	}

	@Test
	@DisplayName("Record 3703: Email is mayme@woge.com")
	void EmailOfRecord3703() {
		assertEquals("mayme@woge.com", customers.get(3702).getEmail());
	}

	@Test
	@DisplayName("Record 3703: Web is http://www.maymewoge.com")
	void WebOfRecord3703() {
		assertEquals("http://www.maymewoge.com", customers.get(3702).getWeb());
	}
}
