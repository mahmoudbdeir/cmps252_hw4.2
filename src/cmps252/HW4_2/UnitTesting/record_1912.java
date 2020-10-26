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

@Tag("4")
class Record_1912 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1912: FirstName is Michell")
	void FirstNameOfRecord1912() {
		assertEquals("Michell", customers.get(1911).getFirstName());
	}

	@Test
	@DisplayName("Record 1912: LastName is Fennimore")
	void LastNameOfRecord1912() {
		assertEquals("Fennimore", customers.get(1911).getLastName());
	}

	@Test
	@DisplayName("Record 1912: Company is Turner Designs")
	void CompanyOfRecord1912() {
		assertEquals("Turner Designs", customers.get(1911).getCompany());
	}

	@Test
	@DisplayName("Record 1912: Address is 4117 N Hy  #-26")
	void AddressOfRecord1912() {
		assertEquals("4117 N Hy  #-26", customers.get(1911).getAddress());
	}

	@Test
	@DisplayName("Record 1912: City is Juneau")
	void CityOfRecord1912() {
		assertEquals("Juneau", customers.get(1911).getCity());
	}

	@Test
	@DisplayName("Record 1912: County is Dodge")
	void CountyOfRecord1912() {
		assertEquals("Dodge", customers.get(1911).getCounty());
	}

	@Test
	@DisplayName("Record 1912: State is WI")
	void StateOfRecord1912() {
		assertEquals("WI", customers.get(1911).getState());
	}

	@Test
	@DisplayName("Record 1912: ZIP is 53039")
	void ZIPOfRecord1912() {
		assertEquals("53039", customers.get(1911).getZIP());
	}

	@Test
	@DisplayName("Record 1912: Phone is 920-386-6636")
	void PhoneOfRecord1912() {
		assertEquals("920-386-6636", customers.get(1911).getPhone());
	}

	@Test
	@DisplayName("Record 1912: Fax is 920-386-2167")
	void FaxOfRecord1912() {
		assertEquals("920-386-2167", customers.get(1911).getFax());
	}

	@Test
	@DisplayName("Record 1912: Email is michell@fennimore.com")
	void EmailOfRecord1912() {
		assertEquals("michell@fennimore.com", customers.get(1911).getEmail());
	}

	@Test
	@DisplayName("Record 1912: Web is http://www.michellfennimore.com")
	void WebOfRecord1912() {
		assertEquals("http://www.michellfennimore.com", customers.get(1911).getWeb());
	}
}
