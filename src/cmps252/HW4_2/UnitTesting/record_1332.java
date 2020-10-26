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

@Tag("38")
class Record_1332 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1332: FirstName is Rafaela")
	void FirstNameOfRecord1332() {
		assertEquals("Rafaela", customers.get(1331).getFirstName());
	}

	@Test
	@DisplayName("Record 1332: LastName is Masone")
	void LastNameOfRecord1332() {
		assertEquals("Masone", customers.get(1331).getLastName());
	}

	@Test
	@DisplayName("Record 1332: Company is Curatolo, Joseph G Esq")
	void CompanyOfRecord1332() {
		assertEquals("Curatolo, Joseph G Esq", customers.get(1331).getCompany());
	}

	@Test
	@DisplayName("Record 1332: Address is 15520 Bear Valley Rd")
	void AddressOfRecord1332() {
		assertEquals("15520 Bear Valley Rd", customers.get(1331).getAddress());
	}

	@Test
	@DisplayName("Record 1332: City is Victorville")
	void CityOfRecord1332() {
		assertEquals("Victorville", customers.get(1331).getCity());
	}

	@Test
	@DisplayName("Record 1332: County is San Bernardino")
	void CountyOfRecord1332() {
		assertEquals("San Bernardino", customers.get(1331).getCounty());
	}

	@Test
	@DisplayName("Record 1332: State is CA")
	void StateOfRecord1332() {
		assertEquals("CA", customers.get(1331).getState());
	}

	@Test
	@DisplayName("Record 1332: ZIP is 92392")
	void ZIPOfRecord1332() {
		assertEquals("92392", customers.get(1331).getZIP());
	}

	@Test
	@DisplayName("Record 1332: Phone is 760-951-3714")
	void PhoneOfRecord1332() {
		assertEquals("760-951-3714", customers.get(1331).getPhone());
	}

	@Test
	@DisplayName("Record 1332: Fax is 760-951-4628")
	void FaxOfRecord1332() {
		assertEquals("760-951-4628", customers.get(1331).getFax());
	}

	@Test
	@DisplayName("Record 1332: Email is rafaela@masone.com")
	void EmailOfRecord1332() {
		assertEquals("rafaela@masone.com", customers.get(1331).getEmail());
	}

	@Test
	@DisplayName("Record 1332: Web is http://www.rafaelamasone.com")
	void WebOfRecord1332() {
		assertEquals("http://www.rafaelamasone.com", customers.get(1331).getWeb());
	}
}
