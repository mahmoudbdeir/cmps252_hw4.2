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

@Tag("44")
class Record_929 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 929: FirstName is Nicolas")
	void FirstNameOfRecord929() {
		assertEquals("Nicolas", customers.get(928).getFirstName());
	}

	@Test
	@DisplayName("Record 929: LastName is Widlak")
	void LastNameOfRecord929() {
		assertEquals("Widlak", customers.get(928).getLastName());
	}

	@Test
	@DisplayName("Record 929: Company is Eaton & Mclninch")
	void CompanyOfRecord929() {
		assertEquals("Eaton & Mclninch", customers.get(928).getCompany());
	}

	@Test
	@DisplayName("Record 929: Address is 616 N Jefferson St")
	void AddressOfRecord929() {
		assertEquals("616 N Jefferson St", customers.get(928).getAddress());
	}

	@Test
	@DisplayName("Record 929: City is Huntington")
	void CityOfRecord929() {
		assertEquals("Huntington", customers.get(928).getCity());
	}

	@Test
	@DisplayName("Record 929: County is Huntington")
	void CountyOfRecord929() {
		assertEquals("Huntington", customers.get(928).getCounty());
	}

	@Test
	@DisplayName("Record 929: State is IN")
	void StateOfRecord929() {
		assertEquals("IN", customers.get(928).getState());
	}

	@Test
	@DisplayName("Record 929: ZIP is 46750")
	void ZIPOfRecord929() {
		assertEquals("46750", customers.get(928).getZIP());
	}

	@Test
	@DisplayName("Record 929: Phone is 260-356-8079")
	void PhoneOfRecord929() {
		assertEquals("260-356-8079", customers.get(928).getPhone());
	}

	@Test
	@DisplayName("Record 929: Fax is 260-356-5392")
	void FaxOfRecord929() {
		assertEquals("260-356-5392", customers.get(928).getFax());
	}

	@Test
	@DisplayName("Record 929: Email is nicolas@widlak.com")
	void EmailOfRecord929() {
		assertEquals("nicolas@widlak.com", customers.get(928).getEmail());
	}

	@Test
	@DisplayName("Record 929: Web is http://www.nicolaswidlak.com")
	void WebOfRecord929() {
		assertEquals("http://www.nicolaswidlak.com", customers.get(928).getWeb());
	}
}
