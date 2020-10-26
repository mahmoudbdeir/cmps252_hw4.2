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

@Tag("17")
class Record_3260 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3260: FirstName is Reyes")
	void FirstNameOfRecord3260() {
		assertEquals("Reyes", customers.get(3259).getFirstName());
	}

	@Test
	@DisplayName("Record 3260: LastName is Delehanty")
	void LastNameOfRecord3260() {
		assertEquals("Delehanty", customers.get(3259).getLastName());
	}

	@Test
	@DisplayName("Record 3260: Company is Bloomquist, William A Esq")
	void CompanyOfRecord3260() {
		assertEquals("Bloomquist, William A Esq", customers.get(3259).getCompany());
	}

	@Test
	@DisplayName("Record 3260: Address is 33 N Duke St")
	void AddressOfRecord3260() {
		assertEquals("33 N Duke St", customers.get(3259).getAddress());
	}

	@Test
	@DisplayName("Record 3260: City is Lancaster")
	void CityOfRecord3260() {
		assertEquals("Lancaster", customers.get(3259).getCity());
	}

	@Test
	@DisplayName("Record 3260: County is Lancaster")
	void CountyOfRecord3260() {
		assertEquals("Lancaster", customers.get(3259).getCounty());
	}

	@Test
	@DisplayName("Record 3260: State is PA")
	void StateOfRecord3260() {
		assertEquals("PA", customers.get(3259).getState());
	}

	@Test
	@DisplayName("Record 3260: ZIP is 17602")
	void ZIPOfRecord3260() {
		assertEquals("17602", customers.get(3259).getZIP());
	}

	@Test
	@DisplayName("Record 3260: Phone is 717-299-5680")
	void PhoneOfRecord3260() {
		assertEquals("717-299-5680", customers.get(3259).getPhone());
	}

	@Test
	@DisplayName("Record 3260: Fax is 717-299-5774")
	void FaxOfRecord3260() {
		assertEquals("717-299-5774", customers.get(3259).getFax());
	}

	@Test
	@DisplayName("Record 3260: Email is reyes@delehanty.com")
	void EmailOfRecord3260() {
		assertEquals("reyes@delehanty.com", customers.get(3259).getEmail());
	}

	@Test
	@DisplayName("Record 3260: Web is http://www.reyesdelehanty.com")
	void WebOfRecord3260() {
		assertEquals("http://www.reyesdelehanty.com", customers.get(3259).getWeb());
	}
}
