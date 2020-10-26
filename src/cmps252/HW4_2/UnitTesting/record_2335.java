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

@Tag("3")
class Record_2335 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2335: FirstName is Meghan")
	void FirstNameOfRecord2335() {
		assertEquals("Meghan", customers.get(2334).getFirstName());
	}

	@Test
	@DisplayName("Record 2335: LastName is Bambino")
	void LastNameOfRecord2335() {
		assertEquals("Bambino", customers.get(2334).getLastName());
	}

	@Test
	@DisplayName("Record 2335: Company is Bess Heat Treating Corp")
	void CompanyOfRecord2335() {
		assertEquals("Bess Heat Treating Corp", customers.get(2334).getCompany());
	}

	@Test
	@DisplayName("Record 2335: Address is 514 San Blanco Ct")
	void AddressOfRecord2335() {
		assertEquals("514 San Blanco Ct", customers.get(2334).getAddress());
	}

	@Test
	@DisplayName("Record 2335: City is Salinas")
	void CityOfRecord2335() {
		assertEquals("Salinas", customers.get(2334).getCity());
	}

	@Test
	@DisplayName("Record 2335: County is Monterey")
	void CountyOfRecord2335() {
		assertEquals("Monterey", customers.get(2334).getCounty());
	}

	@Test
	@DisplayName("Record 2335: State is CA")
	void StateOfRecord2335() {
		assertEquals("CA", customers.get(2334).getState());
	}

	@Test
	@DisplayName("Record 2335: ZIP is 93901")
	void ZIPOfRecord2335() {
		assertEquals("93901", customers.get(2334).getZIP());
	}

	@Test
	@DisplayName("Record 2335: Phone is 831-751-5559")
	void PhoneOfRecord2335() {
		assertEquals("831-751-5559", customers.get(2334).getPhone());
	}

	@Test
	@DisplayName("Record 2335: Fax is 831-751-7641")
	void FaxOfRecord2335() {
		assertEquals("831-751-7641", customers.get(2334).getFax());
	}

	@Test
	@DisplayName("Record 2335: Email is meghan@bambino.com")
	void EmailOfRecord2335() {
		assertEquals("meghan@bambino.com", customers.get(2334).getEmail());
	}

	@Test
	@DisplayName("Record 2335: Web is http://www.meghanbambino.com")
	void WebOfRecord2335() {
		assertEquals("http://www.meghanbambino.com", customers.get(2334).getWeb());
	}
}
