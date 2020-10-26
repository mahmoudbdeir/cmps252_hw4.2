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

@Tag("25")
class Record_4813 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4813: FirstName is Travis")
	void FirstNameOfRecord4813() {
		assertEquals("Travis", customers.get(4812).getFirstName());
	}

	@Test
	@DisplayName("Record 4813: LastName is Hepker")
	void LastNameOfRecord4813() {
		assertEquals("Hepker", customers.get(4812).getLastName());
	}

	@Test
	@DisplayName("Record 4813: Company is Conneley, David P")
	void CompanyOfRecord4813() {
		assertEquals("Conneley, David P", customers.get(4812).getCompany());
	}

	@Test
	@DisplayName("Record 4813: Address is 5769 Christie Ave")
	void AddressOfRecord4813() {
		assertEquals("5769 Christie Ave", customers.get(4812).getAddress());
	}

	@Test
	@DisplayName("Record 4813: City is Emeryville")
	void CityOfRecord4813() {
		assertEquals("Emeryville", customers.get(4812).getCity());
	}

	@Test
	@DisplayName("Record 4813: County is Alameda")
	void CountyOfRecord4813() {
		assertEquals("Alameda", customers.get(4812).getCounty());
	}

	@Test
	@DisplayName("Record 4813: State is CA")
	void StateOfRecord4813() {
		assertEquals("CA", customers.get(4812).getState());
	}

	@Test
	@DisplayName("Record 4813: ZIP is 94608")
	void ZIPOfRecord4813() {
		assertEquals("94608", customers.get(4812).getZIP());
	}

	@Test
	@DisplayName("Record 4813: Phone is 510-420-2004")
	void PhoneOfRecord4813() {
		assertEquals("510-420-2004", customers.get(4812).getPhone());
	}

	@Test
	@DisplayName("Record 4813: Fax is 510-420-5056")
	void FaxOfRecord4813() {
		assertEquals("510-420-5056", customers.get(4812).getFax());
	}

	@Test
	@DisplayName("Record 4813: Email is travis@hepker.com")
	void EmailOfRecord4813() {
		assertEquals("travis@hepker.com", customers.get(4812).getEmail());
	}

	@Test
	@DisplayName("Record 4813: Web is http://www.travishepker.com")
	void WebOfRecord4813() {
		assertEquals("http://www.travishepker.com", customers.get(4812).getWeb());
	}
}
