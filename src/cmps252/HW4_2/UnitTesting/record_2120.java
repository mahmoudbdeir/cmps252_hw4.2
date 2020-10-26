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

@Tag("43")
class Record_2120 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2120: FirstName is Virgil")
	void FirstNameOfRecord2120() {
		assertEquals("Virgil", customers.get(2119).getFirstName());
	}

	@Test
	@DisplayName("Record 2120: LastName is Creekmore")
	void LastNameOfRecord2120() {
		assertEquals("Creekmore", customers.get(2119).getLastName());
	}

	@Test
	@DisplayName("Record 2120: Company is Bruce Alan Finck Spray Gould")
	void CompanyOfRecord2120() {
		assertEquals("Bruce Alan Finck Spray Gould", customers.get(2119).getCompany());
	}

	@Test
	@DisplayName("Record 2120: Address is 3224 N Nevada Ave")
	void AddressOfRecord2120() {
		assertEquals("3224 N Nevada Ave", customers.get(2119).getAddress());
	}

	@Test
	@DisplayName("Record 2120: City is Colorado Springs")
	void CityOfRecord2120() {
		assertEquals("Colorado Springs", customers.get(2119).getCity());
	}

	@Test
	@DisplayName("Record 2120: County is El Paso")
	void CountyOfRecord2120() {
		assertEquals("El Paso", customers.get(2119).getCounty());
	}

	@Test
	@DisplayName("Record 2120: State is CO")
	void StateOfRecord2120() {
		assertEquals("CO", customers.get(2119).getState());
	}

	@Test
	@DisplayName("Record 2120: ZIP is 80907")
	void ZIPOfRecord2120() {
		assertEquals("80907", customers.get(2119).getZIP());
	}

	@Test
	@DisplayName("Record 2120: Phone is 719-635-1845")
	void PhoneOfRecord2120() {
		assertEquals("719-635-1845", customers.get(2119).getPhone());
	}

	@Test
	@DisplayName("Record 2120: Fax is 719-635-4938")
	void FaxOfRecord2120() {
		assertEquals("719-635-4938", customers.get(2119).getFax());
	}

	@Test
	@DisplayName("Record 2120: Email is virgil@creekmore.com")
	void EmailOfRecord2120() {
		assertEquals("virgil@creekmore.com", customers.get(2119).getEmail());
	}

	@Test
	@DisplayName("Record 2120: Web is http://www.virgilcreekmore.com")
	void WebOfRecord2120() {
		assertEquals("http://www.virgilcreekmore.com", customers.get(2119).getWeb());
	}
}
