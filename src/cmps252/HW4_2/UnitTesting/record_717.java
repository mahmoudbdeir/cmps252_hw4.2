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

@Tag("31")
class Record_717 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 717: FirstName is Danette")
	void FirstNameOfRecord717() {
		assertEquals("Danette", customers.get(716).getFirstName());
	}

	@Test
	@DisplayName("Record 717: LastName is Gaebler")
	void LastNameOfRecord717() {
		assertEquals("Gaebler", customers.get(716).getLastName());
	}

	@Test
	@DisplayName("Record 717: Company is Fred Freshley & Associates")
	void CompanyOfRecord717() {
		assertEquals("Fred Freshley & Associates", customers.get(716).getCompany());
	}

	@Test
	@DisplayName("Record 717: Address is Rt 19s S")
	void AddressOfRecord717() {
		assertEquals("Rt 19s S", customers.get(716).getAddress());
	}

	@Test
	@DisplayName("Record 717: City is Clarksburg")
	void CityOfRecord717() {
		assertEquals("Clarksburg", customers.get(716).getCity());
	}

	@Test
	@DisplayName("Record 717: County is Harrison")
	void CountyOfRecord717() {
		assertEquals("Harrison", customers.get(716).getCounty());
	}

	@Test
	@DisplayName("Record 717: State is WV")
	void StateOfRecord717() {
		assertEquals("WV", customers.get(716).getState());
	}

	@Test
	@DisplayName("Record 717: ZIP is 26301")
	void ZIPOfRecord717() {
		assertEquals("26301", customers.get(716).getZIP());
	}

	@Test
	@DisplayName("Record 717: Phone is 304-622-2556")
	void PhoneOfRecord717() {
		assertEquals("304-622-2556", customers.get(716).getPhone());
	}

	@Test
	@DisplayName("Record 717: Fax is 304-622-0875")
	void FaxOfRecord717() {
		assertEquals("304-622-0875", customers.get(716).getFax());
	}

	@Test
	@DisplayName("Record 717: Email is danette@gaebler.com")
	void EmailOfRecord717() {
		assertEquals("danette@gaebler.com", customers.get(716).getEmail());
	}

	@Test
	@DisplayName("Record 717: Web is http://www.danettegaebler.com")
	void WebOfRecord717() {
		assertEquals("http://www.danettegaebler.com", customers.get(716).getWeb());
	}
}
