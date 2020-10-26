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

@Tag("17")
class Record_4313 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4313: FirstName is Shelley")
	void FirstNameOfRecord4313() {
		assertEquals("Shelley", customers.get(4312).getFirstName());
	}

	@Test
	@DisplayName("Record 4313: LastName is Trejo")
	void LastNameOfRecord4313() {
		assertEquals("Trejo", customers.get(4312).getLastName());
	}

	@Test
	@DisplayName("Record 4313: Company is Maola Milk & Ice Cream Co Inc")
	void CompanyOfRecord4313() {
		assertEquals("Maola Milk & Ice Cream Co Inc", customers.get(4312).getCompany());
	}

	@Test
	@DisplayName("Record 4313: Address is 7010 Little River Tpke")
	void AddressOfRecord4313() {
		assertEquals("7010 Little River Tpke", customers.get(4312).getAddress());
	}

	@Test
	@DisplayName("Record 4313: City is Annandale")
	void CityOfRecord4313() {
		assertEquals("Annandale", customers.get(4312).getCity());
	}

	@Test
	@DisplayName("Record 4313: County is Fairfax")
	void CountyOfRecord4313() {
		assertEquals("Fairfax", customers.get(4312).getCounty());
	}

	@Test
	@DisplayName("Record 4313: State is VA")
	void StateOfRecord4313() {
		assertEquals("VA", customers.get(4312).getState());
	}

	@Test
	@DisplayName("Record 4313: ZIP is 22003")
	void ZIPOfRecord4313() {
		assertEquals("22003", customers.get(4312).getZIP());
	}

	@Test
	@DisplayName("Record 4313: Phone is 703-914-8383")
	void PhoneOfRecord4313() {
		assertEquals("703-914-8383", customers.get(4312).getPhone());
	}

	@Test
	@DisplayName("Record 4313: Fax is 703-914-5951")
	void FaxOfRecord4313() {
		assertEquals("703-914-5951", customers.get(4312).getFax());
	}

	@Test
	@DisplayName("Record 4313: Email is shelley@trejo.com")
	void EmailOfRecord4313() {
		assertEquals("shelley@trejo.com", customers.get(4312).getEmail());
	}

	@Test
	@DisplayName("Record 4313: Web is http://www.shelleytrejo.com")
	void WebOfRecord4313() {
		assertEquals("http://www.shelleytrejo.com", customers.get(4312).getWeb());
	}
}
