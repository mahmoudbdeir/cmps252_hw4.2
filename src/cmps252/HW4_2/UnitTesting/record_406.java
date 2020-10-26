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

@Tag("4")
class Record_406 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 406: FirstName is Cruz")
	void FirstNameOfRecord406() {
		assertEquals("Cruz", customers.get(405).getFirstName());
	}

	@Test
	@DisplayName("Record 406: LastName is Boeckx")
	void LastNameOfRecord406() {
		assertEquals("Boeckx", customers.get(405).getLastName());
	}

	@Test
	@DisplayName("Record 406: Company is Ryan, Edward")
	void CompanyOfRecord406() {
		assertEquals("Ryan, Edward", customers.get(405).getCompany());
	}

	@Test
	@DisplayName("Record 406: Address is 25 Main St")
	void AddressOfRecord406() {
		assertEquals("25 Main St", customers.get(405).getAddress());
	}

	@Test
	@DisplayName("Record 406: City is Goshen")
	void CityOfRecord406() {
		assertEquals("Goshen", customers.get(405).getCity());
	}

	@Test
	@DisplayName("Record 406: County is Orange")
	void CountyOfRecord406() {
		assertEquals("Orange", customers.get(405).getCounty());
	}

	@Test
	@DisplayName("Record 406: State is NY")
	void StateOfRecord406() {
		assertEquals("NY", customers.get(405).getState());
	}

	@Test
	@DisplayName("Record 406: ZIP is 10924")
	void ZIPOfRecord406() {
		assertEquals("10924", customers.get(405).getZIP());
	}

	@Test
	@DisplayName("Record 406: Phone is 845-294-0785")
	void PhoneOfRecord406() {
		assertEquals("845-294-0785", customers.get(405).getPhone());
	}

	@Test
	@DisplayName("Record 406: Fax is 845-294-3362")
	void FaxOfRecord406() {
		assertEquals("845-294-3362", customers.get(405).getFax());
	}

	@Test
	@DisplayName("Record 406: Email is cruz@boeckx.com")
	void EmailOfRecord406() {
		assertEquals("cruz@boeckx.com", customers.get(405).getEmail());
	}

	@Test
	@DisplayName("Record 406: Web is http://www.cruzboeckx.com")
	void WebOfRecord406() {
		assertEquals("http://www.cruzboeckx.com", customers.get(405).getWeb());
	}
}
