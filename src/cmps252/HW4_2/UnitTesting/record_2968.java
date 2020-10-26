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

@Tag("9")
class Record_2968 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2968: FirstName is Anne")
	void FirstNameOfRecord2968() {
		assertEquals("Anne", customers.get(2967).getFirstName());
	}

	@Test
	@DisplayName("Record 2968: LastName is Mcmanigal")
	void LastNameOfRecord2968() {
		assertEquals("Mcmanigal", customers.get(2967).getLastName());
	}

	@Test
	@DisplayName("Record 2968: Company is Hartman, Gary E Esq")
	void CompanyOfRecord2968() {
		assertEquals("Hartman, Gary E Esq", customers.get(2967).getCompany());
	}

	@Test
	@DisplayName("Record 2968: Address is 113 10th St")
	void AddressOfRecord2968() {
		assertEquals("113 10th St", customers.get(2967).getAddress());
	}

	@Test
	@DisplayName("Record 2968: City is San Francisco")
	void CityOfRecord2968() {
		assertEquals("San Francisco", customers.get(2967).getCity());
	}

	@Test
	@DisplayName("Record 2968: County is San Francisco")
	void CountyOfRecord2968() {
		assertEquals("San Francisco", customers.get(2967).getCounty());
	}

	@Test
	@DisplayName("Record 2968: State is CA")
	void StateOfRecord2968() {
		assertEquals("CA", customers.get(2967).getState());
	}

	@Test
	@DisplayName("Record 2968: ZIP is 94103")
	void ZIPOfRecord2968() {
		assertEquals("94103", customers.get(2967).getZIP());
	}

	@Test
	@DisplayName("Record 2968: Phone is 415-431-0213")
	void PhoneOfRecord2968() {
		assertEquals("415-431-0213", customers.get(2967).getPhone());
	}

	@Test
	@DisplayName("Record 2968: Fax is 415-431-6618")
	void FaxOfRecord2968() {
		assertEquals("415-431-6618", customers.get(2967).getFax());
	}

	@Test
	@DisplayName("Record 2968: Email is anne@mcmanigal.com")
	void EmailOfRecord2968() {
		assertEquals("anne@mcmanigal.com", customers.get(2967).getEmail());
	}

	@Test
	@DisplayName("Record 2968: Web is http://www.annemcmanigal.com")
	void WebOfRecord2968() {
		assertEquals("http://www.annemcmanigal.com", customers.get(2967).getWeb());
	}
}
