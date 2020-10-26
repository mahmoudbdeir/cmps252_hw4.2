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

@Tag("47")
class Record_1825 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1825: FirstName is Van")
	void FirstNameOfRecord1825() {
		assertEquals("Van", customers.get(1824).getFirstName());
	}

	@Test
	@DisplayName("Record 1825: LastName is Carello")
	void LastNameOfRecord1825() {
		assertEquals("Carello", customers.get(1824).getLastName());
	}

	@Test
	@DisplayName("Record 1825: Company is Payne, Billy M Esq")
	void CompanyOfRecord1825() {
		assertEquals("Payne, Billy M Esq", customers.get(1824).getCompany());
	}

	@Test
	@DisplayName("Record 1825: Address is 1929 Williams St")
	void AddressOfRecord1825() {
		assertEquals("1929 Williams St", customers.get(1824).getAddress());
	}

	@Test
	@DisplayName("Record 1825: City is San Leandro")
	void CityOfRecord1825() {
		assertEquals("San Leandro", customers.get(1824).getCity());
	}

	@Test
	@DisplayName("Record 1825: County is Alameda")
	void CountyOfRecord1825() {
		assertEquals("Alameda", customers.get(1824).getCounty());
	}

	@Test
	@DisplayName("Record 1825: State is CA")
	void StateOfRecord1825() {
		assertEquals("CA", customers.get(1824).getState());
	}

	@Test
	@DisplayName("Record 1825: ZIP is 94577")
	void ZIPOfRecord1825() {
		assertEquals("94577", customers.get(1824).getZIP());
	}

	@Test
	@DisplayName("Record 1825: Phone is 510-483-3115")
	void PhoneOfRecord1825() {
		assertEquals("510-483-3115", customers.get(1824).getPhone());
	}

	@Test
	@DisplayName("Record 1825: Fax is 510-483-8683")
	void FaxOfRecord1825() {
		assertEquals("510-483-8683", customers.get(1824).getFax());
	}

	@Test
	@DisplayName("Record 1825: Email is van@carello.com")
	void EmailOfRecord1825() {
		assertEquals("van@carello.com", customers.get(1824).getEmail());
	}

	@Test
	@DisplayName("Record 1825: Web is http://www.vancarello.com")
	void WebOfRecord1825() {
		assertEquals("http://www.vancarello.com", customers.get(1824).getWeb());
	}
}
