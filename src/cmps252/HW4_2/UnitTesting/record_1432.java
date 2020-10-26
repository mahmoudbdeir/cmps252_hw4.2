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

@Tag("7")
class Record_1432 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1432: FirstName is Newton")
	void FirstNameOfRecord1432() {
		assertEquals("Newton", customers.get(1431).getFirstName());
	}

	@Test
	@DisplayName("Record 1432: LastName is Desilvio")
	void LastNameOfRecord1432() {
		assertEquals("Desilvio", customers.get(1431).getLastName());
	}

	@Test
	@DisplayName("Record 1432: Company is Hi Tech Elect Medl Clms Svc")
	void CompanyOfRecord1432() {
		assertEquals("Hi Tech Elect Medl Clms Svc", customers.get(1431).getCompany());
	}

	@Test
	@DisplayName("Record 1432: Address is 6330 E 75th St")
	void AddressOfRecord1432() {
		assertEquals("6330 E 75th St", customers.get(1431).getAddress());
	}

	@Test
	@DisplayName("Record 1432: City is Indianapolis")
	void CityOfRecord1432() {
		assertEquals("Indianapolis", customers.get(1431).getCity());
	}

	@Test
	@DisplayName("Record 1432: County is Marion")
	void CountyOfRecord1432() {
		assertEquals("Marion", customers.get(1431).getCounty());
	}

	@Test
	@DisplayName("Record 1432: State is IN")
	void StateOfRecord1432() {
		assertEquals("IN", customers.get(1431).getState());
	}

	@Test
	@DisplayName("Record 1432: ZIP is 46250")
	void ZIPOfRecord1432() {
		assertEquals("46250", customers.get(1431).getZIP());
	}

	@Test
	@DisplayName("Record 1432: Phone is 317-576-9154")
	void PhoneOfRecord1432() {
		assertEquals("317-576-9154", customers.get(1431).getPhone());
	}

	@Test
	@DisplayName("Record 1432: Fax is 317-576-5929")
	void FaxOfRecord1432() {
		assertEquals("317-576-5929", customers.get(1431).getFax());
	}

	@Test
	@DisplayName("Record 1432: Email is newton@desilvio.com")
	void EmailOfRecord1432() {
		assertEquals("newton@desilvio.com", customers.get(1431).getEmail());
	}

	@Test
	@DisplayName("Record 1432: Web is http://www.newtondesilvio.com")
	void WebOfRecord1432() {
		assertEquals("http://www.newtondesilvio.com", customers.get(1431).getWeb());
	}
}
