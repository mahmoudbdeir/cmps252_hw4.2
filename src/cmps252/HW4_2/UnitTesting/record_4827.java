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

@Tag("42")
class Record_4827 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4827: FirstName is Truman")
	void FirstNameOfRecord4827() {
		assertEquals("Truman", customers.get(4826).getFirstName());
	}

	@Test
	@DisplayName("Record 4827: LastName is Falor")
	void LastNameOfRecord4827() {
		assertEquals("Falor", customers.get(4826).getLastName());
	}

	@Test
	@DisplayName("Record 4827: Company is Dischell, Mark B Esq")
	void CompanyOfRecord4827() {
		assertEquals("Dischell, Mark B Esq", customers.get(4826).getCompany());
	}

	@Test
	@DisplayName("Record 4827: Address is 841 Gilman St")
	void AddressOfRecord4827() {
		assertEquals("841 Gilman St", customers.get(4826).getAddress());
	}

	@Test
	@DisplayName("Record 4827: City is Berkeley")
	void CityOfRecord4827() {
		assertEquals("Berkeley", customers.get(4826).getCity());
	}

	@Test
	@DisplayName("Record 4827: County is Alameda")
	void CountyOfRecord4827() {
		assertEquals("Alameda", customers.get(4826).getCounty());
	}

	@Test
	@DisplayName("Record 4827: State is CA")
	void StateOfRecord4827() {
		assertEquals("CA", customers.get(4826).getState());
	}

	@Test
	@DisplayName("Record 4827: ZIP is 94710")
	void ZIPOfRecord4827() {
		assertEquals("94710", customers.get(4826).getZIP());
	}

	@Test
	@DisplayName("Record 4827: Phone is 510-528-4555")
	void PhoneOfRecord4827() {
		assertEquals("510-528-4555", customers.get(4826).getPhone());
	}

	@Test
	@DisplayName("Record 4827: Fax is 510-528-9763")
	void FaxOfRecord4827() {
		assertEquals("510-528-9763", customers.get(4826).getFax());
	}

	@Test
	@DisplayName("Record 4827: Email is truman@falor.com")
	void EmailOfRecord4827() {
		assertEquals("truman@falor.com", customers.get(4826).getEmail());
	}

	@Test
	@DisplayName("Record 4827: Web is http://www.trumanfalor.com")
	void WebOfRecord4827() {
		assertEquals("http://www.trumanfalor.com", customers.get(4826).getWeb());
	}
}
