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

@Tag("7")
class Record_3771 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3771: FirstName is Judi")
	void FirstNameOfRecord3771() {
		assertEquals("Judi", customers.get(3770).getFirstName());
	}

	@Test
	@DisplayName("Record 3771: LastName is Honan")
	void LastNameOfRecord3771() {
		assertEquals("Honan", customers.get(3770).getLastName());
	}

	@Test
	@DisplayName("Record 3771: Company is National Center For State Cts")
	void CompanyOfRecord3771() {
		assertEquals("National Center For State Cts", customers.get(3770).getCompany());
	}

	@Test
	@DisplayName("Record 3771: Address is 698 Hegenberger Rd")
	void AddressOfRecord3771() {
		assertEquals("698 Hegenberger Rd", customers.get(3770).getAddress());
	}

	@Test
	@DisplayName("Record 3771: City is Oakland")
	void CityOfRecord3771() {
		assertEquals("Oakland", customers.get(3770).getCity());
	}

	@Test
	@DisplayName("Record 3771: County is Alameda")
	void CountyOfRecord3771() {
		assertEquals("Alameda", customers.get(3770).getCounty());
	}

	@Test
	@DisplayName("Record 3771: State is CA")
	void StateOfRecord3771() {
		assertEquals("CA", customers.get(3770).getState());
	}

	@Test
	@DisplayName("Record 3771: ZIP is 94621")
	void ZIPOfRecord3771() {
		assertEquals("94621", customers.get(3770).getZIP());
	}

	@Test
	@DisplayName("Record 3771: Phone is 510-635-8202")
	void PhoneOfRecord3771() {
		assertEquals("510-635-8202", customers.get(3770).getPhone());
	}

	@Test
	@DisplayName("Record 3771: Fax is 510-635-9559")
	void FaxOfRecord3771() {
		assertEquals("510-635-9559", customers.get(3770).getFax());
	}

	@Test
	@DisplayName("Record 3771: Email is judi@honan.com")
	void EmailOfRecord3771() {
		assertEquals("judi@honan.com", customers.get(3770).getEmail());
	}

	@Test
	@DisplayName("Record 3771: Web is http://www.judihonan.com")
	void WebOfRecord3771() {
		assertEquals("http://www.judihonan.com", customers.get(3770).getWeb());
	}
}
