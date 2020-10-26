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

@Tag("12")
class Record_740 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 740: FirstName is Freddie")
	void FirstNameOfRecord740() {
		assertEquals("Freddie", customers.get(739).getFirstName());
	}

	@Test
	@DisplayName("Record 740: LastName is Whitby")
	void LastNameOfRecord740() {
		assertEquals("Whitby", customers.get(739).getLastName());
	}

	@Test
	@DisplayName("Record 740: Company is Thruway Messenger Svce Inc")
	void CompanyOfRecord740() {
		assertEquals("Thruway Messenger Svce Inc", customers.get(739).getCompany());
	}

	@Test
	@DisplayName("Record 740: Address is 10580 Evendale Dr")
	void AddressOfRecord740() {
		assertEquals("10580 Evendale Dr", customers.get(739).getAddress());
	}

	@Test
	@DisplayName("Record 740: City is Cincinnati")
	void CityOfRecord740() {
		assertEquals("Cincinnati", customers.get(739).getCity());
	}

	@Test
	@DisplayName("Record 740: County is Hamilton")
	void CountyOfRecord740() {
		assertEquals("Hamilton", customers.get(739).getCounty());
	}

	@Test
	@DisplayName("Record 740: State is OH")
	void StateOfRecord740() {
		assertEquals("OH", customers.get(739).getState());
	}

	@Test
	@DisplayName("Record 740: ZIP is 45241")
	void ZIPOfRecord740() {
		assertEquals("45241", customers.get(739).getZIP());
	}

	@Test
	@DisplayName("Record 740: Phone is 513-563-4058")
	void PhoneOfRecord740() {
		assertEquals("513-563-4058", customers.get(739).getPhone());
	}

	@Test
	@DisplayName("Record 740: Fax is 513-563-8736")
	void FaxOfRecord740() {
		assertEquals("513-563-8736", customers.get(739).getFax());
	}

	@Test
	@DisplayName("Record 740: Email is freddie@whitby.com")
	void EmailOfRecord740() {
		assertEquals("freddie@whitby.com", customers.get(739).getEmail());
	}

	@Test
	@DisplayName("Record 740: Web is http://www.freddiewhitby.com")
	void WebOfRecord740() {
		assertEquals("http://www.freddiewhitby.com", customers.get(739).getWeb());
	}
}
