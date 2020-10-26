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

@Tag("3")
class Record_2680 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2680: FirstName is Lucy")
	void FirstNameOfRecord2680() {
		assertEquals("Lucy", customers.get(2679).getFirstName());
	}

	@Test
	@DisplayName("Record 2680: LastName is Heningburg")
	void LastNameOfRecord2680() {
		assertEquals("Heningburg", customers.get(2679).getLastName());
	}

	@Test
	@DisplayName("Record 2680: Company is Am Fm Wgry Wqon")
	void CompanyOfRecord2680() {
		assertEquals("Am Fm Wgry Wqon", customers.get(2679).getCompany());
	}

	@Test
	@DisplayName("Record 2680: Address is 9672 Manzanita Ave")
	void AddressOfRecord2680() {
		assertEquals("9672 Manzanita Ave", customers.get(2679).getAddress());
	}

	@Test
	@DisplayName("Record 2680: City is Ben Lomond")
	void CityOfRecord2680() {
		assertEquals("Ben Lomond", customers.get(2679).getCity());
	}

	@Test
	@DisplayName("Record 2680: County is Santa Cruz")
	void CountyOfRecord2680() {
		assertEquals("Santa Cruz", customers.get(2679).getCounty());
	}

	@Test
	@DisplayName("Record 2680: State is CA")
	void StateOfRecord2680() {
		assertEquals("CA", customers.get(2679).getState());
	}

	@Test
	@DisplayName("Record 2680: ZIP is 95005")
	void ZIPOfRecord2680() {
		assertEquals("95005", customers.get(2679).getZIP());
	}

	@Test
	@DisplayName("Record 2680: Phone is 831-336-8159")
	void PhoneOfRecord2680() {
		assertEquals("831-336-8159", customers.get(2679).getPhone());
	}

	@Test
	@DisplayName("Record 2680: Fax is 831-336-4431")
	void FaxOfRecord2680() {
		assertEquals("831-336-4431", customers.get(2679).getFax());
	}

	@Test
	@DisplayName("Record 2680: Email is lucy@heningburg.com")
	void EmailOfRecord2680() {
		assertEquals("lucy@heningburg.com", customers.get(2679).getEmail());
	}

	@Test
	@DisplayName("Record 2680: Web is http://www.lucyheningburg.com")
	void WebOfRecord2680() {
		assertEquals("http://www.lucyheningburg.com", customers.get(2679).getWeb());
	}
}
