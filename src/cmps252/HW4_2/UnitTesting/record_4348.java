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

@Tag("0")
class Record_4348 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4348: FirstName is Vincent")
	void FirstNameOfRecord4348() {
		assertEquals("Vincent", customers.get(4347).getFirstName());
	}

	@Test
	@DisplayName("Record 4348: LastName is Dimas")
	void LastNameOfRecord4348() {
		assertEquals("Dimas", customers.get(4347).getLastName());
	}

	@Test
	@DisplayName("Record 4348: Company is Noah, Douglas T Esq")
	void CompanyOfRecord4348() {
		assertEquals("Noah, Douglas T Esq", customers.get(4347).getCompany());
	}

	@Test
	@DisplayName("Record 4348: Address is 2600 Pacwest Cent")
	void AddressOfRecord4348() {
		assertEquals("2600 Pacwest Cent", customers.get(4347).getAddress());
	}

	@Test
	@DisplayName("Record 4348: City is Portland")
	void CityOfRecord4348() {
		assertEquals("Portland", customers.get(4347).getCity());
	}

	@Test
	@DisplayName("Record 4348: County is Multnomah")
	void CountyOfRecord4348() {
		assertEquals("Multnomah", customers.get(4347).getCounty());
	}

	@Test
	@DisplayName("Record 4348: State is OR")
	void StateOfRecord4348() {
		assertEquals("OR", customers.get(4347).getState());
	}

	@Test
	@DisplayName("Record 4348: ZIP is 97204")
	void ZIPOfRecord4348() {
		assertEquals("97204", customers.get(4347).getZIP());
	}

	@Test
	@DisplayName("Record 4348: Phone is 503-228-0945")
	void PhoneOfRecord4348() {
		assertEquals("503-228-0945", customers.get(4347).getPhone());
	}

	@Test
	@DisplayName("Record 4348: Fax is 503-228-9677")
	void FaxOfRecord4348() {
		assertEquals("503-228-9677", customers.get(4347).getFax());
	}

	@Test
	@DisplayName("Record 4348: Email is vincent@dimas.com")
	void EmailOfRecord4348() {
		assertEquals("vincent@dimas.com", customers.get(4347).getEmail());
	}

	@Test
	@DisplayName("Record 4348: Web is http://www.vincentdimas.com")
	void WebOfRecord4348() {
		assertEquals("http://www.vincentdimas.com", customers.get(4347).getWeb());
	}
}
