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

@Tag("30")
class Record_1410 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1410: FirstName is Janice")
	void FirstNameOfRecord1410() {
		assertEquals("Janice", customers.get(1409).getFirstName());
	}

	@Test
	@DisplayName("Record 1410: LastName is Bovia")
	void LastNameOfRecord1410() {
		assertEquals("Bovia", customers.get(1409).getLastName());
	}

	@Test
	@DisplayName("Record 1410: Company is Seelbach Hotel")
	void CompanyOfRecord1410() {
		assertEquals("Seelbach Hotel", customers.get(1409).getCompany());
	}

	@Test
	@DisplayName("Record 1410: Address is 340 Sir Francis Drake Blvd")
	void AddressOfRecord1410() {
		assertEquals("340 Sir Francis Drake Blvd", customers.get(1409).getAddress());
	}

	@Test
	@DisplayName("Record 1410: City is San Anselmo")
	void CityOfRecord1410() {
		assertEquals("San Anselmo", customers.get(1409).getCity());
	}

	@Test
	@DisplayName("Record 1410: County is Marin")
	void CountyOfRecord1410() {
		assertEquals("Marin", customers.get(1409).getCounty());
	}

	@Test
	@DisplayName("Record 1410: State is CA")
	void StateOfRecord1410() {
		assertEquals("CA", customers.get(1409).getState());
	}

	@Test
	@DisplayName("Record 1410: ZIP is 94960")
	void ZIPOfRecord1410() {
		assertEquals("94960", customers.get(1409).getZIP());
	}

	@Test
	@DisplayName("Record 1410: Phone is 415-453-1320")
	void PhoneOfRecord1410() {
		assertEquals("415-453-1320", customers.get(1409).getPhone());
	}

	@Test
	@DisplayName("Record 1410: Fax is 415-453-0465")
	void FaxOfRecord1410() {
		assertEquals("415-453-0465", customers.get(1409).getFax());
	}

	@Test
	@DisplayName("Record 1410: Email is janice@bovia.com")
	void EmailOfRecord1410() {
		assertEquals("janice@bovia.com", customers.get(1409).getEmail());
	}

	@Test
	@DisplayName("Record 1410: Web is http://www.janicebovia.com")
	void WebOfRecord1410() {
		assertEquals("http://www.janicebovia.com", customers.get(1409).getWeb());
	}
}
