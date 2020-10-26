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
class Record_3390 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3390: FirstName is Minerva")
	void FirstNameOfRecord3390() {
		assertEquals("Minerva", customers.get(3389).getFirstName());
	}

	@Test
	@DisplayName("Record 3390: LastName is Fundora")
	void LastNameOfRecord3390() {
		assertEquals("Fundora", customers.get(3389).getLastName());
	}

	@Test
	@DisplayName("Record 3390: Company is Hubbards Drapery Co Inc")
	void CompanyOfRecord3390() {
		assertEquals("Hubbards Drapery Co Inc", customers.get(3389).getCompany());
	}

	@Test
	@DisplayName("Record 3390: Address is Box #-789")
	void AddressOfRecord3390() {
		assertEquals("Box #-789", customers.get(3389).getAddress());
	}

	@Test
	@DisplayName("Record 3390: City is San Jose")
	void CityOfRecord3390() {
		assertEquals("San Jose", customers.get(3389).getCity());
	}

	@Test
	@DisplayName("Record 3390: County is Santa Clara")
	void CountyOfRecord3390() {
		assertEquals("Santa Clara", customers.get(3389).getCounty());
	}

	@Test
	@DisplayName("Record 3390: State is CA")
	void StateOfRecord3390() {
		assertEquals("CA", customers.get(3389).getState());
	}

	@Test
	@DisplayName("Record 3390: ZIP is 95106")
	void ZIPOfRecord3390() {
		assertEquals("95106", customers.get(3389).getZIP());
	}

	@Test
	@DisplayName("Record 3390: Phone is 408-292-1260")
	void PhoneOfRecord3390() {
		assertEquals("408-292-1260", customers.get(3389).getPhone());
	}

	@Test
	@DisplayName("Record 3390: Fax is 408-292-0012")
	void FaxOfRecord3390() {
		assertEquals("408-292-0012", customers.get(3389).getFax());
	}

	@Test
	@DisplayName("Record 3390: Email is minerva@fundora.com")
	void EmailOfRecord3390() {
		assertEquals("minerva@fundora.com", customers.get(3389).getEmail());
	}

	@Test
	@DisplayName("Record 3390: Web is http://www.minervafundora.com")
	void WebOfRecord3390() {
		assertEquals("http://www.minervafundora.com", customers.get(3389).getWeb());
	}
}
