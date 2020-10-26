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

@Tag("10")
class Record_698 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 698: FirstName is William")
	void FirstNameOfRecord698() {
		assertEquals("William", customers.get(697).getFirstName());
	}

	@Test
	@DisplayName("Record 698: LastName is Nedd")
	void LastNameOfRecord698() {
		assertEquals("Nedd", customers.get(697).getLastName());
	}

	@Test
	@DisplayName("Record 698: Company is Sharpe, Willard J Esq")
	void CompanyOfRecord698() {
		assertEquals("Sharpe, Willard J Esq", customers.get(697).getCompany());
	}

	@Test
	@DisplayName("Record 698: Address is 1112 N Memorial Dr")
	void AddressOfRecord698() {
		assertEquals("1112 N Memorial Dr", customers.get(697).getAddress());
	}

	@Test
	@DisplayName("Record 698: City is Lancaster")
	void CityOfRecord698() {
		assertEquals("Lancaster", customers.get(697).getCity());
	}

	@Test
	@DisplayName("Record 698: County is Fairfield")
	void CountyOfRecord698() {
		assertEquals("Fairfield", customers.get(697).getCounty());
	}

	@Test
	@DisplayName("Record 698: State is OH")
	void StateOfRecord698() {
		assertEquals("OH", customers.get(697).getState());
	}

	@Test
	@DisplayName("Record 698: ZIP is 43130")
	void ZIPOfRecord698() {
		assertEquals("43130", customers.get(697).getZIP());
	}

	@Test
	@DisplayName("Record 698: Phone is 740-687-9570")
	void PhoneOfRecord698() {
		assertEquals("740-687-9570", customers.get(697).getPhone());
	}

	@Test
	@DisplayName("Record 698: Fax is 740-687-6028")
	void FaxOfRecord698() {
		assertEquals("740-687-6028", customers.get(697).getFax());
	}

	@Test
	@DisplayName("Record 698: Email is william@nedd.com")
	void EmailOfRecord698() {
		assertEquals("william@nedd.com", customers.get(697).getEmail());
	}

	@Test
	@DisplayName("Record 698: Web is http://www.williamnedd.com")
	void WebOfRecord698() {
		assertEquals("http://www.williamnedd.com", customers.get(697).getWeb());
	}
}
