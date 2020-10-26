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

@Tag("13")
class Record_4346 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4346: FirstName is Andrea")
	void FirstNameOfRecord4346() {
		assertEquals("Andrea", customers.get(4345).getFirstName());
	}

	@Test
	@DisplayName("Record 4346: LastName is Mcdermitt")
	void LastNameOfRecord4346() {
		assertEquals("Mcdermitt", customers.get(4345).getLastName());
	}

	@Test
	@DisplayName("Record 4346: Company is Watson, Brian K Esq")
	void CompanyOfRecord4346() {
		assertEquals("Watson, Brian K Esq", customers.get(4345).getCompany());
	}

	@Test
	@DisplayName("Record 4346: Address is 1127 State Hwy  #-35")
	void AddressOfRecord4346() {
		assertEquals("1127 State Hwy  #-35", customers.get(4345).getAddress());
	}

	@Test
	@DisplayName("Record 4346: City is Asbury Park")
	void CityOfRecord4346() {
		assertEquals("Asbury Park", customers.get(4345).getCity());
	}

	@Test
	@DisplayName("Record 4346: County is Monmouth")
	void CountyOfRecord4346() {
		assertEquals("Monmouth", customers.get(4345).getCounty());
	}

	@Test
	@DisplayName("Record 4346: State is NJ")
	void StateOfRecord4346() {
		assertEquals("NJ", customers.get(4345).getState());
	}

	@Test
	@DisplayName("Record 4346: ZIP is 7712")
	void ZIPOfRecord4346() {
		assertEquals("7712", customers.get(4345).getZIP());
	}

	@Test
	@DisplayName("Record 4346: Phone is 732-517-3135")
	void PhoneOfRecord4346() {
		assertEquals("732-517-3135", customers.get(4345).getPhone());
	}

	@Test
	@DisplayName("Record 4346: Fax is 732-517-4301")
	void FaxOfRecord4346() {
		assertEquals("732-517-4301", customers.get(4345).getFax());
	}

	@Test
	@DisplayName("Record 4346: Email is andrea@mcdermitt.com")
	void EmailOfRecord4346() {
		assertEquals("andrea@mcdermitt.com", customers.get(4345).getEmail());
	}

	@Test
	@DisplayName("Record 4346: Web is http://www.andreamcdermitt.com")
	void WebOfRecord4346() {
		assertEquals("http://www.andreamcdermitt.com", customers.get(4345).getWeb());
	}
}
