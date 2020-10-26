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

@Tag("12")
class Record_4371 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4371: FirstName is Boyd")
	void FirstNameOfRecord4371() {
		assertEquals("Boyd", customers.get(4370).getFirstName());
	}

	@Test
	@DisplayName("Record 4371: LastName is Schraff")
	void LastNameOfRecord4371() {
		assertEquals("Schraff", customers.get(4370).getLastName());
	}

	@Test
	@DisplayName("Record 4371: Company is Napier, Patricia M Esq")
	void CompanyOfRecord4371() {
		assertEquals("Napier, Patricia M Esq", customers.get(4370).getCompany());
	}

	@Test
	@DisplayName("Record 4371: Address is 9175 Guilford Rd")
	void AddressOfRecord4371() {
		assertEquals("9175 Guilford Rd", customers.get(4370).getAddress());
	}

	@Test
	@DisplayName("Record 4371: City is Columbia")
	void CityOfRecord4371() {
		assertEquals("Columbia", customers.get(4370).getCity());
	}

	@Test
	@DisplayName("Record 4371: County is Howard")
	void CountyOfRecord4371() {
		assertEquals("Howard", customers.get(4370).getCounty());
	}

	@Test
	@DisplayName("Record 4371: State is MD")
	void StateOfRecord4371() {
		assertEquals("MD", customers.get(4370).getState());
	}

	@Test
	@DisplayName("Record 4371: ZIP is 21046")
	void ZIPOfRecord4371() {
		assertEquals("21046", customers.get(4370).getZIP());
	}

	@Test
	@DisplayName("Record 4371: Phone is 410-792-4931")
	void PhoneOfRecord4371() {
		assertEquals("410-792-4931", customers.get(4370).getPhone());
	}

	@Test
	@DisplayName("Record 4371: Fax is 410-792-0209")
	void FaxOfRecord4371() {
		assertEquals("410-792-0209", customers.get(4370).getFax());
	}

	@Test
	@DisplayName("Record 4371: Email is boyd@schraff.com")
	void EmailOfRecord4371() {
		assertEquals("boyd@schraff.com", customers.get(4370).getEmail());
	}

	@Test
	@DisplayName("Record 4371: Web is http://www.boydschraff.com")
	void WebOfRecord4371() {
		assertEquals("http://www.boydschraff.com", customers.get(4370).getWeb());
	}
}
