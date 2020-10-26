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

@Tag("21")
class Record_2181 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2181: FirstName is Mellisa")
	void FirstNameOfRecord2181() {
		assertEquals("Mellisa", customers.get(2180).getFirstName());
	}

	@Test
	@DisplayName("Record 2181: LastName is Barde")
	void LastNameOfRecord2181() {
		assertEquals("Barde", customers.get(2180).getLastName());
	}

	@Test
	@DisplayName("Record 2181: Company is Neshaminy Interplex")
	void CompanyOfRecord2181() {
		assertEquals("Neshaminy Interplex", customers.get(2180).getCompany());
	}

	@Test
	@DisplayName("Record 2181: Address is Hwy 1n N")
	void AddressOfRecord2181() {
		assertEquals("Hwy 1n N", customers.get(2180).getAddress());
	}

	@Test
	@DisplayName("Record 2181: City is Mc Bee")
	void CityOfRecord2181() {
		assertEquals("Mc Bee", customers.get(2180).getCity());
	}

	@Test
	@DisplayName("Record 2181: County is Chesterfield")
	void CountyOfRecord2181() {
		assertEquals("Chesterfield", customers.get(2180).getCounty());
	}

	@Test
	@DisplayName("Record 2181: State is SC")
	void StateOfRecord2181() {
		assertEquals("SC", customers.get(2180).getState());
	}

	@Test
	@DisplayName("Record 2181: ZIP is 29101")
	void ZIPOfRecord2181() {
		assertEquals("29101", customers.get(2180).getZIP());
	}

	@Test
	@DisplayName("Record 2181: Phone is 843-335-4814")
	void PhoneOfRecord2181() {
		assertEquals("843-335-4814", customers.get(2180).getPhone());
	}

	@Test
	@DisplayName("Record 2181: Fax is 843-335-6932")
	void FaxOfRecord2181() {
		assertEquals("843-335-6932", customers.get(2180).getFax());
	}

	@Test
	@DisplayName("Record 2181: Email is mellisa@barde.com")
	void EmailOfRecord2181() {
		assertEquals("mellisa@barde.com", customers.get(2180).getEmail());
	}

	@Test
	@DisplayName("Record 2181: Web is http://www.mellisabarde.com")
	void WebOfRecord2181() {
		assertEquals("http://www.mellisabarde.com", customers.get(2180).getWeb());
	}
}
