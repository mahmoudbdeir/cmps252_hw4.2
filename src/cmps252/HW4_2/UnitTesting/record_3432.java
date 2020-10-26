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

@Tag("36")
class Record_3432 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3432: FirstName is Harrison")
	void FirstNameOfRecord3432() {
		assertEquals("Harrison", customers.get(3431).getFirstName());
	}

	@Test
	@DisplayName("Record 3432: LastName is Iezzi")
	void LastNameOfRecord3432() {
		assertEquals("Iezzi", customers.get(3431).getLastName());
	}

	@Test
	@DisplayName("Record 3432: Company is Mcardle, Patrick D Esq")
	void CompanyOfRecord3432() {
		assertEquals("Mcardle, Patrick D Esq", customers.get(3431).getCompany());
	}

	@Test
	@DisplayName("Record 3432: Address is 1040 Home St")
	void AddressOfRecord3432() {
		assertEquals("1040 Home St", customers.get(3431).getAddress());
	}

	@Test
	@DisplayName("Record 3432: City is Bronx")
	void CityOfRecord3432() {
		assertEquals("Bronx", customers.get(3431).getCity());
	}

	@Test
	@DisplayName("Record 3432: County is Bronx")
	void CountyOfRecord3432() {
		assertEquals("Bronx", customers.get(3431).getCounty());
	}

	@Test
	@DisplayName("Record 3432: State is NY")
	void StateOfRecord3432() {
		assertEquals("NY", customers.get(3431).getState());
	}

	@Test
	@DisplayName("Record 3432: ZIP is 10459")
	void ZIPOfRecord3432() {
		assertEquals("10459", customers.get(3431).getZIP());
	}

	@Test
	@DisplayName("Record 3432: Phone is 718-589-7736")
	void PhoneOfRecord3432() {
		assertEquals("718-589-7736", customers.get(3431).getPhone());
	}

	@Test
	@DisplayName("Record 3432: Fax is 718-589-6405")
	void FaxOfRecord3432() {
		assertEquals("718-589-6405", customers.get(3431).getFax());
	}

	@Test
	@DisplayName("Record 3432: Email is harrison@iezzi.com")
	void EmailOfRecord3432() {
		assertEquals("harrison@iezzi.com", customers.get(3431).getEmail());
	}

	@Test
	@DisplayName("Record 3432: Web is http://www.harrisoniezzi.com")
	void WebOfRecord3432() {
		assertEquals("http://www.harrisoniezzi.com", customers.get(3431).getWeb());
	}
}
