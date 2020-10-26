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

@Tag("2")
class Record_11 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 11: FirstName is Guillermo")
	void FirstNameOfRecord11() {
		assertEquals("Guillermo", customers.get(10).getFirstName());
	}

	@Test
	@DisplayName("Record 11: LastName is Bramhall")
	void LastNameOfRecord11() {
		assertEquals("Bramhall", customers.get(10).getLastName());
	}

	@Test
	@DisplayName("Record 11: Company is West, J Kevin Esq")
	void CompanyOfRecord11() {
		assertEquals("West, J Kevin Esq", customers.get(10).getCompany());
	}

	@Test
	@DisplayName("Record 11: Address is 1617 27th St")
	void AddressOfRecord11() {
		assertEquals("1617 27th St", customers.get(10).getAddress());
	}

	@Test
	@DisplayName("Record 11: City is Lubbock")
	void CityOfRecord11() {
		assertEquals("Lubbock", customers.get(10).getCity());
	}

	@Test
	@DisplayName("Record 11: County is Lubbock")
	void CountyOfRecord11() {
		assertEquals("Lubbock", customers.get(10).getCounty());
	}

	@Test
	@DisplayName("Record 11: State is TX")
	void StateOfRecord11() {
		assertEquals("TX", customers.get(10).getState());
	}

	@Test
	@DisplayName("Record 11: ZIP is 79405")
	void ZIPOfRecord11() {
		assertEquals("79405", customers.get(10).getZIP());
	}

	@Test
	@DisplayName("Record 11: Phone is 806-763-8915")
	void PhoneOfRecord11() {
		assertEquals("806-763-8915", customers.get(10).getPhone());
	}

	@Test
	@DisplayName("Record 11: Fax is 806-763-9774")
	void FaxOfRecord11() {
		assertEquals("806-763-9774", customers.get(10).getFax());
	}

	@Test
	@DisplayName("Record 11: Email is guillermo@bramhall.com")
	void EmailOfRecord11() {
		assertEquals("guillermo@bramhall.com", customers.get(10).getEmail());
	}

	@Test
	@DisplayName("Record 11: Web is http://www.guillermobramhall.com")
	void WebOfRecord11() {
		assertEquals("http://www.guillermobramhall.com", customers.get(10).getWeb());
	}
}
