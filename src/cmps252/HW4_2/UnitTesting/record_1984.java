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

@Tag("47")
class Record_1984 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1984: FirstName is Shiela")
	void FirstNameOfRecord1984() {
		assertEquals("Shiela", customers.get(1983).getFirstName());
	}

	@Test
	@DisplayName("Record 1984: LastName is Sauby")
	void LastNameOfRecord1984() {
		assertEquals("Sauby", customers.get(1983).getLastName());
	}

	@Test
	@DisplayName("Record 1984: Company is Wcvs 96.7 Fm")
	void CompanyOfRecord1984() {
		assertEquals("Wcvs 96.7 Fm", customers.get(1983).getCompany());
	}

	@Test
	@DisplayName("Record 1984: Address is 45 Great Hill Rd")
	void AddressOfRecord1984() {
		assertEquals("45 Great Hill Rd", customers.get(1983).getAddress());
	}

	@Test
	@DisplayName("Record 1984: City is Naugatuck")
	void CityOfRecord1984() {
		assertEquals("Naugatuck", customers.get(1983).getCity());
	}

	@Test
	@DisplayName("Record 1984: County is New Haven")
	void CountyOfRecord1984() {
		assertEquals("New Haven", customers.get(1983).getCounty());
	}

	@Test
	@DisplayName("Record 1984: State is CT")
	void StateOfRecord1984() {
		assertEquals("CT", customers.get(1983).getState());
	}

	@Test
	@DisplayName("Record 1984: ZIP is 6770")
	void ZIPOfRecord1984() {
		assertEquals("6770", customers.get(1983).getZIP());
	}

	@Test
	@DisplayName("Record 1984: Phone is 203-723-3633")
	void PhoneOfRecord1984() {
		assertEquals("203-723-3633", customers.get(1983).getPhone());
	}

	@Test
	@DisplayName("Record 1984: Fax is 203-723-1951")
	void FaxOfRecord1984() {
		assertEquals("203-723-1951", customers.get(1983).getFax());
	}

	@Test
	@DisplayName("Record 1984: Email is shiela@sauby.com")
	void EmailOfRecord1984() {
		assertEquals("shiela@sauby.com", customers.get(1983).getEmail());
	}

	@Test
	@DisplayName("Record 1984: Web is http://www.shielasauby.com")
	void WebOfRecord1984() {
		assertEquals("http://www.shielasauby.com", customers.get(1983).getWeb());
	}
}
