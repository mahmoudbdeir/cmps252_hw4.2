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

@Tag("33")
class Record_4800 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4800: FirstName is Buford")
	void FirstNameOfRecord4800() {
		assertEquals("Buford", customers.get(4799).getFirstName());
	}

	@Test
	@DisplayName("Record 4800: LastName is Gittinger")
	void LastNameOfRecord4800() {
		assertEquals("Gittinger", customers.get(4799).getLastName());
	}

	@Test
	@DisplayName("Record 4800: Company is S & S Color Center")
	void CompanyOfRecord4800() {
		assertEquals("S & S Color Center", customers.get(4799).getCompany());
	}

	@Test
	@DisplayName("Record 4800: Address is 501 2nd St")
	void AddressOfRecord4800() {
		assertEquals("501 2nd St", customers.get(4799).getAddress());
	}

	@Test
	@DisplayName("Record 4800: City is San Francisco")
	void CityOfRecord4800() {
		assertEquals("San Francisco", customers.get(4799).getCity());
	}

	@Test
	@DisplayName("Record 4800: County is San Francisco")
	void CountyOfRecord4800() {
		assertEquals("San Francisco", customers.get(4799).getCounty());
	}

	@Test
	@DisplayName("Record 4800: State is CA")
	void StateOfRecord4800() {
		assertEquals("CA", customers.get(4799).getState());
	}

	@Test
	@DisplayName("Record 4800: ZIP is 94107")
	void ZIPOfRecord4800() {
		assertEquals("94107", customers.get(4799).getZIP());
	}

	@Test
	@DisplayName("Record 4800: Phone is 415-543-6773")
	void PhoneOfRecord4800() {
		assertEquals("415-543-6773", customers.get(4799).getPhone());
	}

	@Test
	@DisplayName("Record 4800: Fax is 415-543-8101")
	void FaxOfRecord4800() {
		assertEquals("415-543-8101", customers.get(4799).getFax());
	}

	@Test
	@DisplayName("Record 4800: Email is buford@gittinger.com")
	void EmailOfRecord4800() {
		assertEquals("buford@gittinger.com", customers.get(4799).getEmail());
	}

	@Test
	@DisplayName("Record 4800: Web is http://www.bufordgittinger.com")
	void WebOfRecord4800() {
		assertEquals("http://www.bufordgittinger.com", customers.get(4799).getWeb());
	}
}
