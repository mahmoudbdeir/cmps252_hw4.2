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
class Record_77 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 77: FirstName is Joan")
	void FirstNameOfRecord77() {
		assertEquals("Joan", customers.get(76).getFirstName());
	}

	@Test
	@DisplayName("Record 77: LastName is Erle")
	void LastNameOfRecord77() {
		assertEquals("Erle", customers.get(76).getLastName());
	}

	@Test
	@DisplayName("Record 77: Company is Johnson, Kyth L Esq")
	void CompanyOfRecord77() {
		assertEquals("Johnson, Kyth L Esq", customers.get(76).getCompany());
	}

	@Test
	@DisplayName("Record 77: Address is 127 S Price St")
	void AddressOfRecord77() {
		assertEquals("127 S Price St", customers.get(76).getAddress());
	}

	@Test
	@DisplayName("Record 77: City is Kingwood")
	void CityOfRecord77() {
		assertEquals("Kingwood", customers.get(76).getCity());
	}

	@Test
	@DisplayName("Record 77: County is Preston")
	void CountyOfRecord77() {
		assertEquals("Preston", customers.get(76).getCounty());
	}

	@Test
	@DisplayName("Record 77: State is WV")
	void StateOfRecord77() {
		assertEquals("WV", customers.get(76).getState());
	}

	@Test
	@DisplayName("Record 77: ZIP is 26537")
	void ZIPOfRecord77() {
		assertEquals("26537", customers.get(76).getZIP());
	}

	@Test
	@DisplayName("Record 77: Phone is 304-329-4160")
	void PhoneOfRecord77() {
		assertEquals("304-329-4160", customers.get(76).getPhone());
	}

	@Test
	@DisplayName("Record 77: Fax is 304-329-8238")
	void FaxOfRecord77() {
		assertEquals("304-329-8238", customers.get(76).getFax());
	}

	@Test
	@DisplayName("Record 77: Email is joan@erle.com")
	void EmailOfRecord77() {
		assertEquals("joan@erle.com", customers.get(76).getEmail());
	}

	@Test
	@DisplayName("Record 77: Web is http://www.joanerle.com")
	void WebOfRecord77() {
		assertEquals("http://www.joanerle.com", customers.get(76).getWeb());
	}
}
