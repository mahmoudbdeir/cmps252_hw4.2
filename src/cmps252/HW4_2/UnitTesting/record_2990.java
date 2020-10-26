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
class Record_2990 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2990: FirstName is Melba")
	void FirstNameOfRecord2990() {
		assertEquals("Melba", customers.get(2989).getFirstName());
	}

	@Test
	@DisplayName("Record 2990: LastName is Annarummo")
	void LastNameOfRecord2990() {
		assertEquals("Annarummo", customers.get(2989).getLastName());
	}

	@Test
	@DisplayName("Record 2990: Company is Nemo Tile Company Inc")
	void CompanyOfRecord2990() {
		assertEquals("Nemo Tile Company Inc", customers.get(2989).getCompany());
	}

	@Test
	@DisplayName("Record 2990: Address is 4080 Highway 80 E")
	void AddressOfRecord2990() {
		assertEquals("4080 Highway 80 E", customers.get(2989).getAddress());
	}

	@Test
	@DisplayName("Record 2990: City is Pearl")
	void CityOfRecord2990() {
		assertEquals("Pearl", customers.get(2989).getCity());
	}

	@Test
	@DisplayName("Record 2990: County is Rankin")
	void CountyOfRecord2990() {
		assertEquals("Rankin", customers.get(2989).getCounty());
	}

	@Test
	@DisplayName("Record 2990: State is MS")
	void StateOfRecord2990() {
		assertEquals("MS", customers.get(2989).getState());
	}

	@Test
	@DisplayName("Record 2990: ZIP is 39208")
	void ZIPOfRecord2990() {
		assertEquals("39208", customers.get(2989).getZIP());
	}

	@Test
	@DisplayName("Record 2990: Phone is 601-939-5656")
	void PhoneOfRecord2990() {
		assertEquals("601-939-5656", customers.get(2989).getPhone());
	}

	@Test
	@DisplayName("Record 2990: Fax is 601-939-8979")
	void FaxOfRecord2990() {
		assertEquals("601-939-8979", customers.get(2989).getFax());
	}

	@Test
	@DisplayName("Record 2990: Email is melba@annarummo.com")
	void EmailOfRecord2990() {
		assertEquals("melba@annarummo.com", customers.get(2989).getEmail());
	}

	@Test
	@DisplayName("Record 2990: Web is http://www.melbaannarummo.com")
	void WebOfRecord2990() {
		assertEquals("http://www.melbaannarummo.com", customers.get(2989).getWeb());
	}
}
