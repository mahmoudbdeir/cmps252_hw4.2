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

@Tag("26")
class Record_4270 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4270: FirstName is Tiffany")
	void FirstNameOfRecord4270() {
		assertEquals("Tiffany", customers.get(4269).getFirstName());
	}

	@Test
	@DisplayName("Record 4270: LastName is Bintliff")
	void LastNameOfRecord4270() {
		assertEquals("Bintliff", customers.get(4269).getLastName());
	}

	@Test
	@DisplayName("Record 4270: Company is Moschitto Trim & Jewelry Co")
	void CompanyOfRecord4270() {
		assertEquals("Moschitto Trim & Jewelry Co", customers.get(4269).getCompany());
	}

	@Test
	@DisplayName("Record 4270: Address is 900 Front St")
	void AddressOfRecord4270() {
		assertEquals("900 Front St", customers.get(4269).getAddress());
	}

	@Test
	@DisplayName("Record 4270: City is San Francisco")
	void CityOfRecord4270() {
		assertEquals("San Francisco", customers.get(4269).getCity());
	}

	@Test
	@DisplayName("Record 4270: County is San Francisco")
	void CountyOfRecord4270() {
		assertEquals("San Francisco", customers.get(4269).getCounty());
	}

	@Test
	@DisplayName("Record 4270: State is CA")
	void StateOfRecord4270() {
		assertEquals("CA", customers.get(4269).getState());
	}

	@Test
	@DisplayName("Record 4270: ZIP is 94111")
	void ZIPOfRecord4270() {
		assertEquals("94111", customers.get(4269).getZIP());
	}

	@Test
	@DisplayName("Record 4270: Phone is 415-956-5016")
	void PhoneOfRecord4270() {
		assertEquals("415-956-5016", customers.get(4269).getPhone());
	}

	@Test
	@DisplayName("Record 4270: Fax is 415-956-6664")
	void FaxOfRecord4270() {
		assertEquals("415-956-6664", customers.get(4269).getFax());
	}

	@Test
	@DisplayName("Record 4270: Email is tiffany@bintliff.com")
	void EmailOfRecord4270() {
		assertEquals("tiffany@bintliff.com", customers.get(4269).getEmail());
	}

	@Test
	@DisplayName("Record 4270: Web is http://www.tiffanybintliff.com")
	void WebOfRecord4270() {
		assertEquals("http://www.tiffanybintliff.com", customers.get(4269).getWeb());
	}
}
