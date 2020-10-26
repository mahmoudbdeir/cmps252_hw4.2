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

@Tag("46")
class Record_149 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 149: FirstName is Rebeca")
	void FirstNameOfRecord149() {
		assertEquals("Rebeca", customers.get(148).getFirstName());
	}

	@Test
	@DisplayName("Record 149: LastName is Brabson")
	void LastNameOfRecord149() {
		assertEquals("Brabson", customers.get(148).getLastName());
	}

	@Test
	@DisplayName("Record 149: Company is Hafer Tool Co Inc")
	void CompanyOfRecord149() {
		assertEquals("Hafer Tool Co Inc", customers.get(148).getCompany());
	}

	@Test
	@DisplayName("Record 149: Address is 320 W 7th St")
	void AddressOfRecord149() {
		assertEquals("320 W 7th St", customers.get(148).getAddress());
	}

	@Test
	@DisplayName("Record 149: City is Little Rock")
	void CityOfRecord149() {
		assertEquals("Little Rock", customers.get(148).getCity());
	}

	@Test
	@DisplayName("Record 149: County is Pulaski")
	void CountyOfRecord149() {
		assertEquals("Pulaski", customers.get(148).getCounty());
	}

	@Test
	@DisplayName("Record 149: State is AR")
	void StateOfRecord149() {
		assertEquals("AR", customers.get(148).getState());
	}

	@Test
	@DisplayName("Record 149: ZIP is 72201")
	void ZIPOfRecord149() {
		assertEquals("72201", customers.get(148).getZIP());
	}

	@Test
	@DisplayName("Record 149: Phone is 501-371-9905")
	void PhoneOfRecord149() {
		assertEquals("501-371-9905", customers.get(148).getPhone());
	}

	@Test
	@DisplayName("Record 149: Fax is 501-371-3426")
	void FaxOfRecord149() {
		assertEquals("501-371-3426", customers.get(148).getFax());
	}

	@Test
	@DisplayName("Record 149: Email is rebeca@brabson.com")
	void EmailOfRecord149() {
		assertEquals("rebeca@brabson.com", customers.get(148).getEmail());
	}

	@Test
	@DisplayName("Record 149: Web is http://www.rebecabrabson.com")
	void WebOfRecord149() {
		assertEquals("http://www.rebecabrabson.com", customers.get(148).getWeb());
	}
}
