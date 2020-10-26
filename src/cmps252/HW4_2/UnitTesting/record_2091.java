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

@Tag("49")
class Record_2091 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2091: FirstName is Kirk")
	void FirstNameOfRecord2091() {
		assertEquals("Kirk", customers.get(2090).getFirstName());
	}

	@Test
	@DisplayName("Record 2091: LastName is Tenney")
	void LastNameOfRecord2091() {
		assertEquals("Tenney", customers.get(2090).getLastName());
	}

	@Test
	@DisplayName("Record 2091: Company is Frontier Bonding Service")
	void CompanyOfRecord2091() {
		assertEquals("Frontier Bonding Service", customers.get(2090).getCompany());
	}

	@Test
	@DisplayName("Record 2091: Address is 1515 Fayette St")
	void AddressOfRecord2091() {
		assertEquals("1515 Fayette St", customers.get(2090).getAddress());
	}

	@Test
	@DisplayName("Record 2091: City is El Cajon")
	void CityOfRecord2091() {
		assertEquals("El Cajon", customers.get(2090).getCity());
	}

	@Test
	@DisplayName("Record 2091: County is San Diego")
	void CountyOfRecord2091() {
		assertEquals("San Diego", customers.get(2090).getCounty());
	}

	@Test
	@DisplayName("Record 2091: State is CA")
	void StateOfRecord2091() {
		assertEquals("CA", customers.get(2090).getState());
	}

	@Test
	@DisplayName("Record 2091: ZIP is 92020")
	void ZIPOfRecord2091() {
		assertEquals("92020", customers.get(2090).getZIP());
	}

	@Test
	@DisplayName("Record 2091: Phone is 619-449-8144")
	void PhoneOfRecord2091() {
		assertEquals("619-449-8144", customers.get(2090).getPhone());
	}

	@Test
	@DisplayName("Record 2091: Fax is 619-449-6482")
	void FaxOfRecord2091() {
		assertEquals("619-449-6482", customers.get(2090).getFax());
	}

	@Test
	@DisplayName("Record 2091: Email is kirk@tenney.com")
	void EmailOfRecord2091() {
		assertEquals("kirk@tenney.com", customers.get(2090).getEmail());
	}

	@Test
	@DisplayName("Record 2091: Web is http://www.kirktenney.com")
	void WebOfRecord2091() {
		assertEquals("http://www.kirktenney.com", customers.get(2090).getWeb());
	}
}
