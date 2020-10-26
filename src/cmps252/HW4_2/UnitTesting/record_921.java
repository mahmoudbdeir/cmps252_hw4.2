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

@Tag("3")
class Record_921 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 921: FirstName is Fausto")
	void FirstNameOfRecord921() {
		assertEquals("Fausto", customers.get(920).getFirstName());
	}

	@Test
	@DisplayName("Record 921: LastName is Willinghurst")
	void LastNameOfRecord921() {
		assertEquals("Willinghurst", customers.get(920).getLastName());
	}

	@Test
	@DisplayName("Record 921: Company is Core Mark Distributors Inc")
	void CompanyOfRecord921() {
		assertEquals("Core Mark Distributors Inc", customers.get(920).getCompany());
	}

	@Test
	@DisplayName("Record 921: Address is 134 Ridgewood Rd")
	void AddressOfRecord921() {
		assertEquals("134 Ridgewood Rd", customers.get(920).getAddress());
	}

	@Test
	@DisplayName("Record 921: City is Westwood")
	void CityOfRecord921() {
		assertEquals("Westwood", customers.get(920).getCity());
	}

	@Test
	@DisplayName("Record 921: County is Bergen")
	void CountyOfRecord921() {
		assertEquals("Bergen", customers.get(920).getCounty());
	}

	@Test
	@DisplayName("Record 921: State is NJ")
	void StateOfRecord921() {
		assertEquals("NJ", customers.get(920).getState());
	}

	@Test
	@DisplayName("Record 921: ZIP is 7675")
	void ZIPOfRecord921() {
		assertEquals("7675", customers.get(920).getZIP());
	}

	@Test
	@DisplayName("Record 921: Phone is 201-664-1192")
	void PhoneOfRecord921() {
		assertEquals("201-664-1192", customers.get(920).getPhone());
	}

	@Test
	@DisplayName("Record 921: Fax is 201-664-2698")
	void FaxOfRecord921() {
		assertEquals("201-664-2698", customers.get(920).getFax());
	}

	@Test
	@DisplayName("Record 921: Email is fausto@willinghurst.com")
	void EmailOfRecord921() {
		assertEquals("fausto@willinghurst.com", customers.get(920).getEmail());
	}

	@Test
	@DisplayName("Record 921: Web is http://www.faustowillinghurst.com")
	void WebOfRecord921() {
		assertEquals("http://www.faustowillinghurst.com", customers.get(920).getWeb());
	}
}
