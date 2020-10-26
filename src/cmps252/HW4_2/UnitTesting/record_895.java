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

@Tag("14")
class Record_895 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 895: FirstName is Sofia")
	void FirstNameOfRecord895() {
		assertEquals("Sofia", customers.get(894).getFirstName());
	}

	@Test
	@DisplayName("Record 895: LastName is Brooker")
	void LastNameOfRecord895() {
		assertEquals("Brooker", customers.get(894).getLastName());
	}

	@Test
	@DisplayName("Record 895: Company is Manufacturing & Techl Svc Inc")
	void CompanyOfRecord895() {
		assertEquals("Manufacturing & Techl Svc Inc", customers.get(894).getCompany());
	}

	@Test
	@DisplayName("Record 895: Address is 1001 Bayhill Dr")
	void AddressOfRecord895() {
		assertEquals("1001 Bayhill Dr", customers.get(894).getAddress());
	}

	@Test
	@DisplayName("Record 895: City is San Bruno")
	void CityOfRecord895() {
		assertEquals("San Bruno", customers.get(894).getCity());
	}

	@Test
	@DisplayName("Record 895: County is San Mateo")
	void CountyOfRecord895() {
		assertEquals("San Mateo", customers.get(894).getCounty());
	}

	@Test
	@DisplayName("Record 895: State is CA")
	void StateOfRecord895() {
		assertEquals("CA", customers.get(894).getState());
	}

	@Test
	@DisplayName("Record 895: ZIP is 94066")
	void ZIPOfRecord895() {
		assertEquals("94066", customers.get(894).getZIP());
	}

	@Test
	@DisplayName("Record 895: Phone is 650-588-7161")
	void PhoneOfRecord895() {
		assertEquals("650-588-7161", customers.get(894).getPhone());
	}

	@Test
	@DisplayName("Record 895: Fax is 650-588-6679")
	void FaxOfRecord895() {
		assertEquals("650-588-6679", customers.get(894).getFax());
	}

	@Test
	@DisplayName("Record 895: Email is sofia@brooker.com")
	void EmailOfRecord895() {
		assertEquals("sofia@brooker.com", customers.get(894).getEmail());
	}

	@Test
	@DisplayName("Record 895: Web is http://www.sofiabrooker.com")
	void WebOfRecord895() {
		assertEquals("http://www.sofiabrooker.com", customers.get(894).getWeb());
	}
}
