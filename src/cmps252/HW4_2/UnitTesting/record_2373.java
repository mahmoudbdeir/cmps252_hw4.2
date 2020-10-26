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

@Tag("35")
class Record_2373 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2373: FirstName is Dudley")
	void FirstNameOfRecord2373() {
		assertEquals("Dudley", customers.get(2372).getFirstName());
	}

	@Test
	@DisplayName("Record 2373: LastName is Garrean")
	void LastNameOfRecord2373() {
		assertEquals("Garrean", customers.get(2372).getLastName());
	}

	@Test
	@DisplayName("Record 2373: Company is Lemral Knitwear Inc")
	void CompanyOfRecord2373() {
		assertEquals("Lemral Knitwear Inc", customers.get(2372).getCompany());
	}

	@Test
	@DisplayName("Record 2373: Address is 2201 74th St")
	void AddressOfRecord2373() {
		assertEquals("2201 74th St", customers.get(2372).getAddress());
	}

	@Test
	@DisplayName("Record 2373: City is North Bergen")
	void CityOfRecord2373() {
		assertEquals("North Bergen", customers.get(2372).getCity());
	}

	@Test
	@DisplayName("Record 2373: County is Hudson")
	void CountyOfRecord2373() {
		assertEquals("Hudson", customers.get(2372).getCounty());
	}

	@Test
	@DisplayName("Record 2373: State is NJ")
	void StateOfRecord2373() {
		assertEquals("NJ", customers.get(2372).getState());
	}

	@Test
	@DisplayName("Record 2373: ZIP is 7047")
	void ZIPOfRecord2373() {
		assertEquals("7047", customers.get(2372).getZIP());
	}

	@Test
	@DisplayName("Record 2373: Phone is 201-869-5186")
	void PhoneOfRecord2373() {
		assertEquals("201-869-5186", customers.get(2372).getPhone());
	}

	@Test
	@DisplayName("Record 2373: Fax is 201-869-1915")
	void FaxOfRecord2373() {
		assertEquals("201-869-1915", customers.get(2372).getFax());
	}

	@Test
	@DisplayName("Record 2373: Email is dudley@garrean.com")
	void EmailOfRecord2373() {
		assertEquals("dudley@garrean.com", customers.get(2372).getEmail());
	}

	@Test
	@DisplayName("Record 2373: Web is http://www.dudleygarrean.com")
	void WebOfRecord2373() {
		assertEquals("http://www.dudleygarrean.com", customers.get(2372).getWeb());
	}
}
