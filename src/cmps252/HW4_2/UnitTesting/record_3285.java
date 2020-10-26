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

@Tag("18")
class Record_3285 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3285: FirstName is Neal")
	void FirstNameOfRecord3285() {
		assertEquals("Neal", customers.get(3284).getFirstName());
	}

	@Test
	@DisplayName("Record 3285: LastName is Susko")
	void LastNameOfRecord3285() {
		assertEquals("Susko", customers.get(3284).getLastName());
	}

	@Test
	@DisplayName("Record 3285: Company is Weymouth, Stephen Esq")
	void CompanyOfRecord3285() {
		assertEquals("Weymouth, Stephen Esq", customers.get(3284).getCompany());
	}

	@Test
	@DisplayName("Record 3285: Address is 235 Montgomery St  #-920")
	void AddressOfRecord3285() {
		assertEquals("235 Montgomery St  #-920", customers.get(3284).getAddress());
	}

	@Test
	@DisplayName("Record 3285: City is San Francisco")
	void CityOfRecord3285() {
		assertEquals("San Francisco", customers.get(3284).getCity());
	}

	@Test
	@DisplayName("Record 3285: County is San Francisco")
	void CountyOfRecord3285() {
		assertEquals("San Francisco", customers.get(3284).getCounty());
	}

	@Test
	@DisplayName("Record 3285: State is CA")
	void StateOfRecord3285() {
		assertEquals("CA", customers.get(3284).getState());
	}

	@Test
	@DisplayName("Record 3285: ZIP is 94104")
	void ZIPOfRecord3285() {
		assertEquals("94104", customers.get(3284).getZIP());
	}

	@Test
	@DisplayName("Record 3285: Phone is 415-982-9338")
	void PhoneOfRecord3285() {
		assertEquals("415-982-9338", customers.get(3284).getPhone());
	}

	@Test
	@DisplayName("Record 3285: Fax is 415-982-1739")
	void FaxOfRecord3285() {
		assertEquals("415-982-1739", customers.get(3284).getFax());
	}

	@Test
	@DisplayName("Record 3285: Email is neal@susko.com")
	void EmailOfRecord3285() {
		assertEquals("neal@susko.com", customers.get(3284).getEmail());
	}

	@Test
	@DisplayName("Record 3285: Web is http://www.nealsusko.com")
	void WebOfRecord3285() {
		assertEquals("http://www.nealsusko.com", customers.get(3284).getWeb());
	}
}
