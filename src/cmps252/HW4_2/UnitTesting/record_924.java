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
class Record_924 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 924: FirstName is Maribel")
	void FirstNameOfRecord924() {
		assertEquals("Maribel", customers.get(923).getFirstName());
	}

	@Test
	@DisplayName("Record 924: LastName is Ono")
	void LastNameOfRecord924() {
		assertEquals("Ono", customers.get(923).getLastName());
	}

	@Test
	@DisplayName("Record 924: Company is Levin, Allan B Md")
	void CompanyOfRecord924() {
		assertEquals("Levin, Allan B Md", customers.get(923).getCompany());
	}

	@Test
	@DisplayName("Record 924: Address is 2603 E 30th St")
	void AddressOfRecord924() {
		assertEquals("2603 E 30th St", customers.get(923).getAddress());
	}

	@Test
	@DisplayName("Record 924: City is Indianapolis")
	void CityOfRecord924() {
		assertEquals("Indianapolis", customers.get(923).getCity());
	}

	@Test
	@DisplayName("Record 924: County is Marion")
	void CountyOfRecord924() {
		assertEquals("Marion", customers.get(923).getCounty());
	}

	@Test
	@DisplayName("Record 924: State is IN")
	void StateOfRecord924() {
		assertEquals("IN", customers.get(923).getState());
	}

	@Test
	@DisplayName("Record 924: ZIP is 46218")
	void ZIPOfRecord924() {
		assertEquals("46218", customers.get(923).getZIP());
	}

	@Test
	@DisplayName("Record 924: Phone is 317-925-8547")
	void PhoneOfRecord924() {
		assertEquals("317-925-8547", customers.get(923).getPhone());
	}

	@Test
	@DisplayName("Record 924: Fax is 317-925-7284")
	void FaxOfRecord924() {
		assertEquals("317-925-7284", customers.get(923).getFax());
	}

	@Test
	@DisplayName("Record 924: Email is maribel@ono.com")
	void EmailOfRecord924() {
		assertEquals("maribel@ono.com", customers.get(923).getEmail());
	}

	@Test
	@DisplayName("Record 924: Web is http://www.maribelono.com")
	void WebOfRecord924() {
		assertEquals("http://www.maribelono.com", customers.get(923).getWeb());
	}
}
