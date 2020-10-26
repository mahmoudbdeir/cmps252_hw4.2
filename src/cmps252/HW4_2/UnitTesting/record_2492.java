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
class Record_2492 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2492: FirstName is Amanda")
	void FirstNameOfRecord2492() {
		assertEquals("Amanda", customers.get(2491).getFirstName());
	}

	@Test
	@DisplayName("Record 2492: LastName is Elkind")
	void LastNameOfRecord2492() {
		assertEquals("Elkind", customers.get(2491).getLastName());
	}

	@Test
	@DisplayName("Record 2492: Company is Econo Lodge")
	void CompanyOfRecord2492() {
		assertEquals("Econo Lodge", customers.get(2491).getCompany());
	}

	@Test
	@DisplayName("Record 2492: Address is 4683 S Valley View Blvd")
	void AddressOfRecord2492() {
		assertEquals("4683 S Valley View Blvd", customers.get(2491).getAddress());
	}

	@Test
	@DisplayName("Record 2492: City is Las Vegas")
	void CityOfRecord2492() {
		assertEquals("Las Vegas", customers.get(2491).getCity());
	}

	@Test
	@DisplayName("Record 2492: County is Clark")
	void CountyOfRecord2492() {
		assertEquals("Clark", customers.get(2491).getCounty());
	}

	@Test
	@DisplayName("Record 2492: State is NV")
	void StateOfRecord2492() {
		assertEquals("NV", customers.get(2491).getState());
	}

	@Test
	@DisplayName("Record 2492: ZIP is 89103")
	void ZIPOfRecord2492() {
		assertEquals("89103", customers.get(2491).getZIP());
	}

	@Test
	@DisplayName("Record 2492: Phone is 702-795-8545")
	void PhoneOfRecord2492() {
		assertEquals("702-795-8545", customers.get(2491).getPhone());
	}

	@Test
	@DisplayName("Record 2492: Fax is 702-795-0035")
	void FaxOfRecord2492() {
		assertEquals("702-795-0035", customers.get(2491).getFax());
	}

	@Test
	@DisplayName("Record 2492: Email is amanda@elkind.com")
	void EmailOfRecord2492() {
		assertEquals("amanda@elkind.com", customers.get(2491).getEmail());
	}

	@Test
	@DisplayName("Record 2492: Web is http://www.amandaelkind.com")
	void WebOfRecord2492() {
		assertEquals("http://www.amandaelkind.com", customers.get(2491).getWeb());
	}
}
