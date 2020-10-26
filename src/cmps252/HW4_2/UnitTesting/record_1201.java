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

@Tag("41")
class Record_1201 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1201: FirstName is Lucas")
	void FirstNameOfRecord1201() {
		assertEquals("Lucas", customers.get(1200).getFirstName());
	}

	@Test
	@DisplayName("Record 1201: LastName is Guzowski")
	void LastNameOfRecord1201() {
		assertEquals("Guzowski", customers.get(1200).getLastName());
	}

	@Test
	@DisplayName("Record 1201: Company is Wersching, James P Esq")
	void CompanyOfRecord1201() {
		assertEquals("Wersching, James P Esq", customers.get(1200).getCompany());
	}

	@Test
	@DisplayName("Record 1201: Address is Schoolhouse Rd")
	void AddressOfRecord1201() {
		assertEquals("Schoolhouse Rd", customers.get(1200).getAddress());
	}

	@Test
	@DisplayName("Record 1201: City is Cheshire")
	void CityOfRecord1201() {
		assertEquals("Cheshire", customers.get(1200).getCity());
	}

	@Test
	@DisplayName("Record 1201: County is New Haven")
	void CountyOfRecord1201() {
		assertEquals("New Haven", customers.get(1200).getCounty());
	}

	@Test
	@DisplayName("Record 1201: State is CT")
	void StateOfRecord1201() {
		assertEquals("CT", customers.get(1200).getState());
	}

	@Test
	@DisplayName("Record 1201: ZIP is 6410")
	void ZIPOfRecord1201() {
		assertEquals("6410", customers.get(1200).getZIP());
	}

	@Test
	@DisplayName("Record 1201: Phone is 203-250-6905")
	void PhoneOfRecord1201() {
		assertEquals("203-250-6905", customers.get(1200).getPhone());
	}

	@Test
	@DisplayName("Record 1201: Fax is 203-250-5631")
	void FaxOfRecord1201() {
		assertEquals("203-250-5631", customers.get(1200).getFax());
	}

	@Test
	@DisplayName("Record 1201: Email is lucas@guzowski.com")
	void EmailOfRecord1201() {
		assertEquals("lucas@guzowski.com", customers.get(1200).getEmail());
	}

	@Test
	@DisplayName("Record 1201: Web is http://www.lucasguzowski.com")
	void WebOfRecord1201() {
		assertEquals("http://www.lucasguzowski.com", customers.get(1200).getWeb());
	}
}
