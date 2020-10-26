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

@Tag("1")
class Record_4627 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4627: FirstName is Roxanna")
	void FirstNameOfRecord4627() {
		assertEquals("Roxanna", customers.get(4626).getFirstName());
	}

	@Test
	@DisplayName("Record 4627: LastName is Cossette")
	void LastNameOfRecord4627() {
		assertEquals("Cossette", customers.get(4626).getLastName());
	}

	@Test
	@DisplayName("Record 4627: Company is Hines, Michael T Esq")
	void CompanyOfRecord4627() {
		assertEquals("Hines, Michael T Esq", customers.get(4626).getCompany());
	}

	@Test
	@DisplayName("Record 4627: Address is 330 7th Ave")
	void AddressOfRecord4627() {
		assertEquals("330 7th Ave", customers.get(4626).getAddress());
	}

	@Test
	@DisplayName("Record 4627: City is New York")
	void CityOfRecord4627() {
		assertEquals("New York", customers.get(4626).getCity());
	}

	@Test
	@DisplayName("Record 4627: County is New York")
	void CountyOfRecord4627() {
		assertEquals("New York", customers.get(4626).getCounty());
	}

	@Test
	@DisplayName("Record 4627: State is NY")
	void StateOfRecord4627() {
		assertEquals("NY", customers.get(4626).getState());
	}

	@Test
	@DisplayName("Record 4627: ZIP is 10001")
	void ZIPOfRecord4627() {
		assertEquals("10001", customers.get(4626).getZIP());
	}

	@Test
	@DisplayName("Record 4627: Phone is 212-629-1012")
	void PhoneOfRecord4627() {
		assertEquals("212-629-1012", customers.get(4626).getPhone());
	}

	@Test
	@DisplayName("Record 4627: Fax is 212-629-8818")
	void FaxOfRecord4627() {
		assertEquals("212-629-8818", customers.get(4626).getFax());
	}

	@Test
	@DisplayName("Record 4627: Email is roxanna@cossette.com")
	void EmailOfRecord4627() {
		assertEquals("roxanna@cossette.com", customers.get(4626).getEmail());
	}

	@Test
	@DisplayName("Record 4627: Web is http://www.roxannacossette.com")
	void WebOfRecord4627() {
		assertEquals("http://www.roxannacossette.com", customers.get(4626).getWeb());
	}
}
