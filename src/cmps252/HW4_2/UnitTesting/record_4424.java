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

@Tag("31")
class Record_4424 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4424: FirstName is Kelsey")
	void FirstNameOfRecord4424() {
		assertEquals("Kelsey", customers.get(4423).getFirstName());
	}

	@Test
	@DisplayName("Record 4424: LastName is Olliff")
	void LastNameOfRecord4424() {
		assertEquals("Olliff", customers.get(4423).getLastName());
	}

	@Test
	@DisplayName("Record 4424: Company is Super Ice Corp")
	void CompanyOfRecord4424() {
		assertEquals("Super Ice Corp", customers.get(4423).getCompany());
	}

	@Test
	@DisplayName("Record 4424: Address is 1930 Thoreau Dr N")
	void AddressOfRecord4424() {
		assertEquals("1930 Thoreau Dr N", customers.get(4423).getAddress());
	}

	@Test
	@DisplayName("Record 4424: City is Schaumburg")
	void CityOfRecord4424() {
		assertEquals("Schaumburg", customers.get(4423).getCity());
	}

	@Test
	@DisplayName("Record 4424: County is Cook")
	void CountyOfRecord4424() {
		assertEquals("Cook", customers.get(4423).getCounty());
	}

	@Test
	@DisplayName("Record 4424: State is IL")
	void StateOfRecord4424() {
		assertEquals("IL", customers.get(4423).getState());
	}

	@Test
	@DisplayName("Record 4424: ZIP is 60173")
	void ZIPOfRecord4424() {
		assertEquals("60173", customers.get(4423).getZIP());
	}

	@Test
	@DisplayName("Record 4424: Phone is 847-397-7640")
	void PhoneOfRecord4424() {
		assertEquals("847-397-7640", customers.get(4423).getPhone());
	}

	@Test
	@DisplayName("Record 4424: Fax is 847-397-4221")
	void FaxOfRecord4424() {
		assertEquals("847-397-4221", customers.get(4423).getFax());
	}

	@Test
	@DisplayName("Record 4424: Email is kelsey@olliff.com")
	void EmailOfRecord4424() {
		assertEquals("kelsey@olliff.com", customers.get(4423).getEmail());
	}

	@Test
	@DisplayName("Record 4424: Web is http://www.kelseyolliff.com")
	void WebOfRecord4424() {
		assertEquals("http://www.kelseyolliff.com", customers.get(4423).getWeb());
	}
}
