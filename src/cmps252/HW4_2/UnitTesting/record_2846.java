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
class Record_2846 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2846: FirstName is Carlo")
	void FirstNameOfRecord2846() {
		assertEquals("Carlo", customers.get(2845).getFirstName());
	}

	@Test
	@DisplayName("Record 2846: LastName is Ticknor")
	void LastNameOfRecord2846() {
		assertEquals("Ticknor", customers.get(2845).getLastName());
	}

	@Test
	@DisplayName("Record 2846: Company is Luton, S Scott Esq")
	void CompanyOfRecord2846() {
		assertEquals("Luton, S Scott Esq", customers.get(2845).getCompany());
	}

	@Test
	@DisplayName("Record 2846: Address is 119 W 57th St")
	void AddressOfRecord2846() {
		assertEquals("119 W 57th St", customers.get(2845).getAddress());
	}

	@Test
	@DisplayName("Record 2846: City is New York")
	void CityOfRecord2846() {
		assertEquals("New York", customers.get(2845).getCity());
	}

	@Test
	@DisplayName("Record 2846: County is New York")
	void CountyOfRecord2846() {
		assertEquals("New York", customers.get(2845).getCounty());
	}

	@Test
	@DisplayName("Record 2846: State is NY")
	void StateOfRecord2846() {
		assertEquals("NY", customers.get(2845).getState());
	}

	@Test
	@DisplayName("Record 2846: ZIP is 10019")
	void ZIPOfRecord2846() {
		assertEquals("10019", customers.get(2845).getZIP());
	}

	@Test
	@DisplayName("Record 2846: Phone is 212-245-4185")
	void PhoneOfRecord2846() {
		assertEquals("212-245-4185", customers.get(2845).getPhone());
	}

	@Test
	@DisplayName("Record 2846: Fax is 212-245-6637")
	void FaxOfRecord2846() {
		assertEquals("212-245-6637", customers.get(2845).getFax());
	}

	@Test
	@DisplayName("Record 2846: Email is carlo@ticknor.com")
	void EmailOfRecord2846() {
		assertEquals("carlo@ticknor.com", customers.get(2845).getEmail());
	}

	@Test
	@DisplayName("Record 2846: Web is http://www.carloticknor.com")
	void WebOfRecord2846() {
		assertEquals("http://www.carloticknor.com", customers.get(2845).getWeb());
	}
}
