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
class Record_2833 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2833: FirstName is Delores")
	void FirstNameOfRecord2833() {
		assertEquals("Delores", customers.get(2832).getFirstName());
	}

	@Test
	@DisplayName("Record 2833: LastName is Helmig")
	void LastNameOfRecord2833() {
		assertEquals("Helmig", customers.get(2832).getLastName());
	}

	@Test
	@DisplayName("Record 2833: Company is Econoprint")
	void CompanyOfRecord2833() {
		assertEquals("Econoprint", customers.get(2832).getCompany());
	}

	@Test
	@DisplayName("Record 2833: Address is 105 Court St")
	void AddressOfRecord2833() {
		assertEquals("105 Court St", customers.get(2832).getAddress());
	}

	@Test
	@DisplayName("Record 2833: City is Brooklyn")
	void CityOfRecord2833() {
		assertEquals("Brooklyn", customers.get(2832).getCity());
	}

	@Test
	@DisplayName("Record 2833: County is Kings")
	void CountyOfRecord2833() {
		assertEquals("Kings", customers.get(2832).getCounty());
	}

	@Test
	@DisplayName("Record 2833: State is NY")
	void StateOfRecord2833() {
		assertEquals("NY", customers.get(2832).getState());
	}

	@Test
	@DisplayName("Record 2833: ZIP is 11201")
	void ZIPOfRecord2833() {
		assertEquals("11201", customers.get(2832).getZIP());
	}

	@Test
	@DisplayName("Record 2833: Phone is 718-625-2120")
	void PhoneOfRecord2833() {
		assertEquals("718-625-2120", customers.get(2832).getPhone());
	}

	@Test
	@DisplayName("Record 2833: Fax is 718-625-3496")
	void FaxOfRecord2833() {
		assertEquals("718-625-3496", customers.get(2832).getFax());
	}

	@Test
	@DisplayName("Record 2833: Email is delores@helmig.com")
	void EmailOfRecord2833() {
		assertEquals("delores@helmig.com", customers.get(2832).getEmail());
	}

	@Test
	@DisplayName("Record 2833: Web is http://www.deloreshelmig.com")
	void WebOfRecord2833() {
		assertEquals("http://www.deloreshelmig.com", customers.get(2832).getWeb());
	}
}
