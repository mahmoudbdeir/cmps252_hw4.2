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

@Tag("6")
class Record_2864 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2864: FirstName is Daphne")
	void FirstNameOfRecord2864() {
		assertEquals("Daphne", customers.get(2863).getFirstName());
	}

	@Test
	@DisplayName("Record 2864: LastName is Ambrosia")
	void LastNameOfRecord2864() {
		assertEquals("Ambrosia", customers.get(2863).getLastName());
	}

	@Test
	@DisplayName("Record 2864: Company is ychler Bergsman Belonsky")
	void CompanyOfRecord2864() {
		assertEquals("ychler Bergsman Belonsky", customers.get(2863).getCompany());
	}

	@Test
	@DisplayName("Record 2864: Address is 3910 Wesley Chapel Rd")
	void AddressOfRecord2864() {
		assertEquals("3910 Wesley Chapel Rd", customers.get(2863).getAddress());
	}

	@Test
	@DisplayName("Record 2864: City is Marietta")
	void CityOfRecord2864() {
		assertEquals("Marietta", customers.get(2863).getCity());
	}

	@Test
	@DisplayName("Record 2864: County is Cobb")
	void CountyOfRecord2864() {
		assertEquals("Cobb", customers.get(2863).getCounty());
	}

	@Test
	@DisplayName("Record 2864: State is GA")
	void StateOfRecord2864() {
		assertEquals("GA", customers.get(2863).getState());
	}

	@Test
	@DisplayName("Record 2864: ZIP is 30062")
	void ZIPOfRecord2864() {
		assertEquals("30062", customers.get(2863).getZIP());
	}

	@Test
	@DisplayName("Record 2864: Phone is 770-509-0753")
	void PhoneOfRecord2864() {
		assertEquals("770-509-0753", customers.get(2863).getPhone());
	}

	@Test
	@DisplayName("Record 2864: Fax is 770-509-8165")
	void FaxOfRecord2864() {
		assertEquals("770-509-8165", customers.get(2863).getFax());
	}

	@Test
	@DisplayName("Record 2864: Email is daphne@ambrosia.com")
	void EmailOfRecord2864() {
		assertEquals("daphne@ambrosia.com", customers.get(2863).getEmail());
	}

	@Test
	@DisplayName("Record 2864: Web is http://www.daphneambrosia.com")
	void WebOfRecord2864() {
		assertEquals("http://www.daphneambrosia.com", customers.get(2863).getWeb());
	}
}
